package character.hero;
import inventory.Inventory;
import character.Character;
import character.Job;
import item.Equipment;
import item.EquipmentType;
import pets.Pet;
import util.Attributes;
import java.io.*;
import util.Config;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hero extends Character implements Serializable {

  public Inventory bag = new Inventory();
  private int attributPoints = Config.NUMBER_ATT_POINTS_START.getValue();
  private LinkedList<Pet> pets = new LinkedList<Pet>();

  public Hero(String name) {
    super(name);
    this.job = new Novice();
    super.updateStats();
  }

  public Pet getPet(int index){
    return pets.get(index);
  }

  public String getAllPets() {
    return pets.toString();
  }

  public void addPet(Pet pet){
    if(pets.size()<Config.NUMBER_PETS.getValue()) {
      this.pets.add(pet);
      updateStats();
    }else{
      System.out.println("Maximum number of pets");
    }
  }

  @Override
  public void setJob(Job job) {
    HeroJob heroJob = (HeroJob) job;
    this.job = heroJob;
  }

  public void setXp(int xp){
    if (getAttributes().getXp() + xp >= Config.XP_TO_LVL_UP.getValue()){
      this.attributPoints =
              this.attributPoints+Config.NUMBER_ATT_POINTS_LVL_UP.getValue();
    }
    getAttributes().setXp(xp);
  }

  public int getAttributPoints() {
    return attributPoints;
  }


  private boolean testAttributePoints(){
    if(this.attributPoints>0){
      this.attributPoints -= 1;
      return true;
    }else{
      System.out.println("Error, you don't have more att points");
      return false;
    }
  }

  //isso abaixo é codigo duplicado ou não?
  public void increaseSta(){
    if(testAttributePoints()){
      int sta = getAttributes().getSta();
      getAttributes().setSta(sta+1);
    }
  }

  public void increaseDex(){
    if(testAttributePoints()) {
      int dex = getAttributes().getDex();
      getAttributes().setDex(dex + 1);
    }
  }

  public void increaseIntel(){
    if(testAttributePoints()){
      int intel = getAttributes().getIntel();
      getAttributes().setSta(intel+1);
    }
  }

  public void increaseStr(){
    if(testAttributePoints()){
      int str = getAttributes().getStr();
      getAttributes().setStr(str+1);
    }
  }

  public void increaseAgi(){
    if(testAttributePoints()){
      int agi = getAttributes().getAgi();
      getAttributes().setAgi(agi+1);
    }
  }

  public void increaseLuk(){
    if(testAttributePoints()){
      int luk = getAttributes().getLuk();
      getAttributes().setLuk(luk+1);
    }
  }

  public LinkedList<Pet> getPets() {
    return pets;
  }

  public void removePet(int index){
    this.pets.remove(index);
    updateStats();
  }

  private boolean testEquipmentJobType(Equipment equipment){
    HeroJob job = (HeroJob) this.job;
    if (equipment.getHeroJobType() == job.getHeroJobType() ||
            equipment.getHeroJobType()== HeroJobType.NOVICE){
      return true;
    }
    else{
      System.out.println("ERROR: This equipment" +
              " does not suit the character's job");
      return false;
    }
  }

  public void setEquipment(Equipment equipment){
    if (testEquipmentJobType(equipment)){
      super.setEquipment(equipment);
    }
  }

  public Inventory getBag() {
    return bag;
  }

  public Attributes[] getAttPets(){
    int size = pets.size();
    Attributes[] attributes = new Attributes[size];

    for(int i=0; i <size; i++){
      attributes[i] = pets.get(i).getAttributes();
    }

    return attributes;
  }

  @Override
  public Attributes getAllAttributes(){
    if(pets.size()==0)
      return super.getAllAttributes();
    else
      return super.getAllAttributes().add(getAttPets());
  }
}
