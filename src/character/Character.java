package character;

import item.*;
import util.Attributes;
import bag.Bag;

public class Character {

  private String name;

  private Job job;
  private Bag bag = new Bag();

  //atributos dependentes:
  private int hp; private int sp;
  private int atk;   private int def;
  private int maxHp; private int maxSp; private int atkSpd;
  private int ten;  private int cri;   private int hit;   private int eva;
  private Attributes attributes;
  private item.Armor armor;
  private item.Weapon weapon;
  private item.Helmet helmet;

  //TODO: Hp and SP should be on Battle class or in Character class?
  //TODO: Set stats with attributes of character and item


  public Character(String name) {
    this.name = name;
    this.job = new Novice();
    this.attributes = new Attributes(1, 1, 1, 1,
            1, 1, 1);
    this.helmet = new Helmet("Empty", 1, 0, 0, 0,
            0, 0, 0);
    this.weapon = new Weapon("Empty", 1, 0, 0, 0,
            0, 0, 0);
    this.armor = new Armor("Empty", 1, 0, 0, 0,
            0, 0, 0);
    updateStats();
  }

  public Character(String name, Job job, Attributes attributes, Helmet helmet,
                   Weapon weapon, Armor armor) {
    this.name = name;
    this.job = job;
    this.attributes = attributes;
    this.helmet = helmet;
    this.weapon = weapon;
    this.armor = armor;
    updateStats();
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


  public void setHelmet(Helmet helmet) {
    this.helmet = helmet;
    updateStats();
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
    updateStats();
  }

  public void setArmor(Armor armor) {
    this.armor = armor;
    updateStats();
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

  public Armor getArmor() {
    return armor;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public Helmet getHelmet() {
    return helmet;
  }

  public Attributes[] getAttEquip(){
    return new Attributes[]{helmet.getAttributes(),
            armor.getAttributes(),
            weapon.getAttributes()};
  }
}
