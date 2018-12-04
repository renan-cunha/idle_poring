package character;

import character.hero.HeroJobType;
import item.*;
import util.Attributes;

public abstract class Character {

  protected final String name;
  protected Job job;
  protected Pouch pouch = new Pouch();

  //atributos dependentes:
  protected int hp;
  protected int sp;
  protected int atk;
  protected int def;
  protected int maxHp;
  protected int maxSp;
  protected int atkSpd;
  protected int ten;
  protected int cri;
  protected int hit;
  protected int eva;

  //atributos independentes
  protected Attributes attributes;

  protected Equipment armor = new Equipment(EquipmentType.ARMOR);
  protected Equipment weapon = new Equipment(EquipmentType.WEAPON);
  protected Equipment helmet = new Equipment(EquipmentType.HELMET);


  public Character(String name, Attributes attributes) {
    this.name = name;
    this.attributes = attributes;
  }

  public Character(String name, int level, int dex, int sta, int str,
                   int intel, int agi, int luk) {
    this(name, new Attributes(level, dex, sta, str, intel, agi, luk));
  }

  public Character(String name){
    this(name, 1, 1, 1, 1, 1, 1, 1);
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
    if (newHP<0) {
      System.out.println("Valor precisa ser positivo!");
      return;}
    else if (newHP <= this.maxHp) {this.hp = newHP;}
    else{this.hp = maxHp;}
  }

  public int getHp() {
    return hp;
  }

  //toda vez que adicionar um novo equipamento essa função e mais uma outra
  //serão alteradas, será que daá pra fazer de uma outra forma mais eficiente
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

  //Essa função tambem será alterada toda vez que adicionar um novo equipamento
  public Attributes[] getAttEquip(){
    return new Attributes[]{helmet.getAttributes(), armor.getAttributes(),
            weapon.getAttributes()};
  }

  //Essa função será alterada sempre que adicionat um novo equipamento
  public Equipment[] getEquipments(){
    return  new Equipment[]{this.armor, this.weapon, this.helmet};
  }

  public Attributes[] getAttItens(){
    return getAttEquip();
  }

}
