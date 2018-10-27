package character;

import items.*;

public class Character {

  private static int n_characters;
  private String name;
  private Job job; //Define o job do personagem

  //level:
  private int lvl;

  private int hp;
  private int sp;

  //atributos independentes:
  private int dex; private int sta; private int str; private int intel;
  private int agi; private int luk;

  //atributos dependentes:
  private int atk;   private int mAtk;  private int def;
  private int mDef; private int maxHp; private int maxSp; private int atkSpd;
  private int ten;  private int cri;   private int hit;   private int eva;

  //equipamento
  private items.Helmet helmet = new Helmet("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.Armor armor = new Armor("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.LeftHand leftHand = new LeftHand("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.RightHand rightHand = new RightHand("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.Manteau manteau = new Manteau("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.FootGear footGear = new FootGear("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.Acessory acessory1 = new Acessory("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);
  private items.Acessory acessory2 = new Acessory("Vazio", new Novice(), 0, 0, 0, 0, 0, 0, 0);

  //Construtor:
  public Character(String name, int lvl, Job job) {
    this.name = name;
    this.lvl = lvl;
    this.job = job;
    this.hp = maxHp;

    this.dex = lvl; this.sta = lvl; this.str = lvl; this.intel = lvl;
    this.agi = lvl; this.luk = lvl;

    updateStats();
  }

  public Character(String name) {
    this(name,1, new Novice());
  }

  //Métodos auxiliares:
  public static int getN_characters() {
    return n_characters;
  }

  public String getName() {
    return name;
  }

  public Job getJob() {
    return job;
  }

  public int getHP() { return hp; }

  public int getLvl() {
    return lvl;
  }

  public int getIntel() {
    return intel + getEquipmentsIntel();
  }

  public int getStr() {
    return str + getEquipmentsStr();
  }

  public int getSta() {
    return sta + getEquipmentsSta();
  }

  public int getAgi() {
    return agi + getEquipmentsAgi();
  }

  public int getDex() {
    return dex + getEquipmentsDex();
  }

  public int getLuk() {
    return luk + getEquipmentsLuk();
  }

  public int getAtk() {
    return atk ;
  }

  public int getmAtk() {
    return mAtk;
  }

  public int getDef() {
    return def;
  }

  public int getmDef() {
    return mDef;
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

  public void setJob(Job job) {
    this.job = job;
  }

  public void lvlUp(int increment) {
    this.lvl += increment;
  }

  private boolean testIncrementAtt(int increment){
    if (increment > 0)
      return true;
    else {
      System.out.println("Erro, incremento de atributo negativo");
      return false;
    }
  }

  public void incrementIntel(int increment) {
    if (testIncrementAtt(increment)) {
      this.intel += increment;
      updateStats();
    }
  }

  public void incrementStr(int increment) {
    if (testIncrementAtt(increment)) {
      this.str += increment;
      updateStats();
    }
  }

  public void incrementSta(int increment) {
    if (testIncrementAtt(increment)) {
      this.sta += increment;
      updateStats();
    }
  }

  public void incrementAgi(int increment) {
    if (testIncrementAtt(increment)) {
      this.agi += increment;
      updateStats();
    }
  }

  public void incrementDex(int increment) {
    if (testIncrementAtt(increment)) {
      this.dex += increment;
      updateStats();
    }
  }

  public void incrementLuk(int increment) {
    if (testIncrementAtt(increment)) {
      this.luk += increment;
      updateStats();
    }
  }


  private void updateStats(){
    this.atk = job.setAtk(this);
    this.mAtk = job.setMAtk(this);
    this.def = job.setDef(this);
    this.mDef = job.setMDef(this);
    this.maxHp = job.setMaxHp(this);
    this.maxSp = job.setMaxSp(this);
    this.atkSpd = job.setAtkSpd(this);
    this.eva = job.setEva(this);
    this.cri = job.setCri(this);
    this.hit = job.setHit(this);
    this.ten = job.setTen(this);
  }

    //atualiza o HP, para batalhas:
    public void setHP(int newHP){
      if (newHP<0) { System.out.println("Valor precisa ser positivo!"); return;}
      else if (newHP <= this.maxHp) {this.hp = newHP;}
      else {System.out.printf("Novo valor tem q ser menor q o valor máximo (%i)", this.maxHp);}
  }
    //Talvez possamos ler os atributos desta forma, durante o desenvolvimento:
    @Override
    public String toString(){
    return  "Name: "+this.name+" Level: "+this.lvl+" Job: "+this.job.name+
            "\nDependent attributes list: \n"+"Dexterity: "+this.dex+
                                                "\nStamina: "+this.sta+
                                                "\nStrength: "+this.str+
                                                "\nInteligence: "+this.intel+
                                                "\nAgility: "+this.agi+
                                                "\nLuck: "+this.luk;
  }

  public int getHp() {
    return hp;
  }

  public int getSp() {
    return sp;
  }

  public Helmet getHelmet() {
    return helmet;
  }

  public Armor getArmor() {
    return armor;
  }

  public LeftHand getLeftHand() {
    return leftHand;
  }

  public RightHand getRightHand() {
    return rightHand;
  }

  public Manteau getManteau() {
    return manteau;
  }

  public FootGear getFootGear() {
    return footGear;
  }

  public Acessory getAcessory1() {
    return acessory1;
  }

  public Acessory getAcessory2() {
    return acessory2;
  }

  private boolean testEquipment(Equipment equipment){
    if (equipment.getJob().getClass()==this.getJob().getClass()) {
      return true;
    }
    else {
      System.out.println("Job of equipment is different from job of character");
      return false;
    }
  }

  public void setHelmet(Helmet helmet) {
    if (testEquipment(helmet))
      this.helmet = helmet;
      updateStats();
  }

  public void setArmor(Armor armor) {
    if (testEquipment(armor))
      this.armor = armor;
      updateStats();
  }

  public void setLeftHand(LeftHand leftHand) {
    if (testEquipment(leftHand))
      this.leftHand = leftHand;
      updateStats();
  }

  public void setRightHand(RightHand rightHand) {
    if (testEquipment(rightHand))
      this.rightHand = rightHand;
      updateStats();
  }

  public void setManteau(Manteau manteau) {
    if (testEquipment(manteau))
      this.manteau = manteau;
      updateStats();
  }

  public void setFootGear(FootGear footGear) {
    if (testEquipment(footGear))
      this.footGear = footGear;
      updateStats();
  }

  public void setAcessory1(Acessory acessory1) {
    if (testEquipment(acessory1))
      this.acessory1 = acessory1;
      updateStats();
  }

  public void setAcessory2(Acessory acessory2) {
    if (testEquipment(acessory2))
      this.acessory2 = acessory2;
      updateStats();
  }

  private int getEquipmentsAgi(){
    return helmet.getAgi() + armor.getAgi() + leftHand.getAgi() +
            rightHand.getAgi() + manteau.getAgi() + footGear.getAgi() +
            acessory1.getAgi() + acessory2.getAgi();
  }

  private int getEquipmentsStr(){
    return helmet.getStr() + armor.getStr() + leftHand.getStr() +
            rightHand.getStr() + manteau.getStr() + footGear.getStr() +
            acessory1.getStr() + acessory2.getStr();
  }

  private int getEquipmentsSta(){
    return helmet.getSta() + armor.getSta() + leftHand.getSta() +
            rightHand.getSta() + manteau.getSta() + footGear.getSta() +
            acessory1.getSta() + acessory2.getSta();
  }

  private int getEquipmentsIntel(){
    return helmet.getIntel() + armor.getIntel() + leftHand.getIntel() +
            rightHand.getIntel() + manteau.getIntel() + footGear.getIntel() +
            acessory1.getIntel() + acessory2.getIntel();
  }

  private int getEquipmentsDex(){
    return helmet.getDex() + armor.getDex() + leftHand.getDex() +
            rightHand.getDex() + manteau.getDex() + footGear.getDex() +
            acessory1.getDex() + acessory2.getDex();
  }

  private int getEquipmentsLuk(){
    return helmet.getLuk() + armor.getLuk() + leftHand.getLuk() +
            rightHand.getLuk() + manteau.getLuk() + footGear.getLuk() +
            acessory1.getLuk() + acessory2.getLuk();
  }

}
