package character;

import character.hero.HeroJobType;
import item.*;
import util.Attributes;

public abstract class Character {

  final String name;

  protected Job job;

  //pouch para por moedas:
  public Pouch pouch = new Pouch();


  //atributos dependentes:
  int hp; int sp;
  int atk;   int def;
  int maxHp; int maxSp; int atkSpd;
  int ten;  int cri;   int hit;   int eva;
  Attributes attributes;
  protected Equipment armor = new Equipment("Empty", HeroJobType.NOVICE,
          EquipmentType.ARMOR,1,  0, 0, 0,
          0, 0, 0);
  protected Equipment weapon = new Equipment("Empty", HeroJobType.NOVICE,
          EquipmentType.WEAPON, 1, 0, 0, 0,
          0, 0, 0);
  protected Equipment helmet = new Equipment("Empty", HeroJobType.NOVICE,
                                         EquipmentType.HELMET, 1, 0,
          0, 0, 0, 0, 0);

  //TODO: Hp and SP should be on Battle class or in Character class?
  //TODO: Set stats with attributes of character and item

  public Character(String name){
    this.name = name;
    this.attributes = new Attributes(1,1,1,1,1,1,
            1);
  }

  public Character(String name, Attributes attributes) {
    this.name = name;
    this.attributes = attributes;
  }

  public Character(String name, int level, int dex, int sta, int str,
                   int intel, int agi, int luk) {
    this.name = name;
    this.attributes = new Attributes(level, dex, sta, str, intel, agi, luk);
  }

  public abstract void setJob(Job job);

  protected void updateStats(){
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

  public int getHp() {
    return hp;
  }

  public void setEquipment(Equipment equipment){
    EquipmentType equipmentType = equipment.getEquipType();
    if (equipmentType==EquipmentType.HELMET)
      this.helmet = equipment;
    else if (equipmentType==EquipmentType.WEAPON)
      this.weapon = equipment;
    else if (equipmentType==EquipmentType.ARMOR)
      this.armor = equipment;
    else
      System.out.println("Erro, the character does not accept this type of equipment");
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

  public Attributes[] getAttItens(){
    return getAttEquip();
  }

}
