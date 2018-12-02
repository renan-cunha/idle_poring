package character.hero;

import bag.Bag;
import character.Character;
import character.Job;
import item.Equipment;
import item.EquipmentType;
import org.w3c.dom.Attr;
import pets.Pet;
import util.Attributes;

import javax.smartcardio.ATR;
import java.util.ArrayList;
import java.util.LinkedList;

public class Hero extends Character {

  private Bag bag = new Bag();

  LinkedList<Pet> pets = new LinkedList<Pet>();

  //TODO: Hp and SP should be on Battle class or in Character class?
  //TODO: Set stats with attributes of character and item


  public Hero(String name) {
    super(name);
    this.job = new Novice();
    updateStats();
  }

  public Hero(String name, HeroJob job, Attributes attributes) {
    super(name, attributes);
    this.job = job;
    updateStats();
  }

  public Hero(String name, HeroJob job, int level, int dex, int sta, int str, int intel, int agi, int luk) {
    super(name, level, dex, sta, str, intel, agi, luk);
    this.job = job;
    updateStats();
  }

  public Pet getPet(int index){
    return pets.get(index);
  }

  public String getAllPets() {
    return pets.toString();
  }

  public void addPet(Pet pet){
    this.pets.add(pet);
    updateStats();
  }

  public void removePet(int index){
    this.pets.remove(index);
    updateStats();
  }

  private boolean testEquipmentJobType(Equipment equipment){
    HeroJob job = (HeroJob) this.job;
    if (equipment.getHeroJobType() == job.getHeroJobType() || equipment.getHeroJobType()== HeroJobType.NOVICE){
      return true;
    }
    else{
      System.out.println("ERROR: This equipment does not suit the character's job");
      return false;
    }
  }

  public void setHelmet(Equipment helmet) {
    if (testEquipmentJobType(helmet)) {
      if (helmet.getEquipType() == EquipmentType.HELMET) {
        this.helmet = helmet;
        updateStats();
      }else
        System.out.println("It's not a Helmet");
    }
  }

  public void setWeapon(Equipment weapon) {
    if (testEquipmentJobType(weapon)) {
      if (weapon.getEquipType() == EquipmentType.WEAPON) {
        this.weapon = weapon;
        updateStats();
      }else
        System.out.println("It's not a Weapon");
    }
  }

  public void setArmor(Equipment armor) {
    if (testEquipmentJobType(armor)) {
      if (armor.getEquipType() == EquipmentType.ARMOR) {
        this.armor = armor;
        updateStats();
      }else
        System.out.println(("Its' not an Armor"));
    }
  }

  public Bag getBag() {
    return bag;
  }

  public Attributes[] getAttPets(){
    int size = pets.size();
    ArrayList<Attributes> attributes = new ArrayList<Attributes>();
    for(int i=0; i <size; i++){
      attributes.add(pets.get(i).getAttributes());
    }
    Attributes[] att = new Attributes[size];
    att = attributes.toArray(att);
    return att;
  }

  @Override
  public  Attributes[] getAttItens(){
    Attributes test = new Attributes();
    test = test.add(getAttEquip());
    test = test.add(getAttPets());
    Attributes[] result = {test};
    return result;
  }
}
