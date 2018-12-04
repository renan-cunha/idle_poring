package character;

import character.hero.HeroJobType;
import item.*;
import org.w3c.dom.Attr;
import util.Attributes;

import java.util.Arrays;

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

  protected Equipment[] equipments ={new Equipment(EquipmentType.ARMOR),
  new Equipment(EquipmentType.WEAPON), new Equipment(EquipmentType.HELMET)};


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

  public void setEquipment(Equipment equipment){
    EquipmentType equipmentType = equipment.getEquipType();
    if (equipmentType==EquipmentType.HELMET)
      equipments[0] = equipment;
    else if (equipmentType==EquipmentType.WEAPON)
      equipments[1] = equipment;
    else if (equipmentType==EquipmentType.ARMOR)
      equipments[2] = equipment;
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

  public Attributes[] getAttEquip(){
    int length = this.equipments.length;
    Attributes[] attributes = new Attributes[length];
    for(int i=0; i<length; i++)
      attributes[i] = equipments[i].getAttributes();
    return attributes;
  }

  public Equipment[] getEquipments(){
    return  this.equipments;
  }

  public Attributes[] getAttItens(){
    return getAttEquip();
  }

  public Attributes getAllAttributes(){
    return getAttributes().add(getAttItens());
  }

  @Override
  public String toString() {
    return "Character{" +
            "name='" + name + '\'' +
            ", job=" + job +
            ", pouch=" + pouch +
            ", hp=" + hp +
            ", sp=" + sp +
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
            ", equipments=" + Arrays.toString(equipments) +
            '}';
  }

  public Pouch getPouch() {
    return pouch;
  }
}
