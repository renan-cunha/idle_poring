package character;

import item.*;
import org.w3c.dom.Attr;
import util.Attributes;
import bag.Bag;
import pets.Pet;

import javax.smartcardio.ATR;
import java.util.*;

public class Character {

  private String name;

  private Job job;
  //Ttodo Character tem uma bag par items:
  public Bag bag;
  //E uma pouch para moedas:
  public Pouch pouch;

  //atributos dependentes:
  private int hp; private int sp;
  private int atk;   private int def;
  private int maxHp; private int maxSp; private int atkSpd;
  private int ten;  private int cri;   private int hit;   private int eva;
  LinkedList<Pet> pets = new LinkedList<Pet>();
  private Attributes attributes;
  private Equipment armor;
  private Equipment weapon;
  private Equipment helmet;

  //TODO: Hp and SP should be on Battle class or in Character class?
  //TODO: Set stats with attributes of character and item


  public Character(String name) {
    this.name = name;
    this.job = new Novice();
    this.attributes = new Attributes(1, 1, 1, 1,
            1, 1, 1);
    this.helmet = new Equipment("Empty", JobType.NOVICE,
            EquipmentType.HELMET, 1, 0, 0, 0,
            0, 0, 0);
    this.weapon = new Equipment("Empty", JobType.NOVICE,
            EquipmentType.WEAPON, 1, 0, 0, 0,
            0, 0, 0);
    this.armor = new Equipment("Empty", JobType.NOVICE,
            EquipmentType.ARMOR,1,  0, 0, 0,
            0, 0, 0);
    updateStats();
    pouch = new Pouch();
    bag = new Bag();
  }

  public Character(String name, Job job, Attributes attributes) {
    this.name = name;
    this.job = job;
    this.attributes = attributes;
    this.helmet = helmet;
    this.weapon = weapon;
    this.armor = armor;
    updateStats();
    pouch = new Pouch();
    bag = new Bag();
  }

  @Override
  public String toString() {
    return "Character{" +
            "name='" + name + '\'' +
            ", job=" + job +
            ", atk=" + atk +
            ", def=" + def +
            ", maxHp=" + maxHp +
            ", maxSp=" + maxSp +
            ", atkSpd=" + atkSpd +
            ", ten=" + ten +
            ", cri=" + cri +
            ", hit=" + hit +
            ", eva=" + eva +
            ", attributes=" + attributes +
            ", armor=" + armor +
            ", weapon=" + weapon +
            ", helmet=" + helmet +
            '}';
  }

  private boolean testEquipmentJobType(Equipment equipment){
    if (equipment.getJobType()==job.getType() || equipment.getJobType()==JobType.NOVICE){
      return true;
    }
    else{
      System.out.println("ERROR: This equipment does not suit the character's job");
      return false;
    }
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

  public void setJob(Job job) {
    this.job = job;
    updateStats();
  }

  private void updateStats(){
    this.def = job.setDef(this);
    this.atk = job.setAtk(this);
    this.eva = job.setEva(this);
    this.hit = job.setHit(this);
    this.cri = job.setCri(this);
    this.ten = job.setTen(this);
    this.atkSpd = job.setAtkSpd(this);
    this.maxSp = job.setMaxSp(this);
    this.maxHp = job.setMaxHp(this);
  }

  public String getName() {
    return name;
  }

  public Job getJob() {
    return job;
  }

  public void setHp(int newHP){
    if (newHP<0) { System.out.println("Valor precisa ser positivo!"); return;}
    else if (newHP <= this.maxHp) {this.hp = newHP;}
    else if(newHP > this.maxHp){this.hp = maxHp;}
  }

  public Bag getBag() {
    return bag;
  }

  public int getHp() {
    return hp;
  }

  public int getAtk() {
    return atk;
  }

  public int getDef() {
    return def;
  }


  public int getMaxHp() {
    return maxHp;
  }

  public int getMaxSp() {
    return maxSp;
  }

  public int getAtkSpd() {
    return atkSpd;
  }

  public int getTen() {
    return ten;
  }

  public int getCri() {
    return cri;
  }

  public int getHit() {
    return hit;
  }

  public int getEva() {
    return eva;
  }

  public Attributes getAttributes() {
    return attributes;
  }

  public Equipment getArmor() {
    return armor;
  }

  public Equipment getWeapon() {
    return weapon;
  }

  public Equipment getHelmet() {
    return helmet;
  }

  public Attributes[] getAttEquip(){
    return new Attributes[]{helmet.getAttributes(),
            armor.getAttributes(),
            weapon.getAttributes()};
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
}
