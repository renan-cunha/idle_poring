package character;

public class Character {

  //Atributos:
  private static int n_characters;
  private String name;
  private Job job; //Define o job do personagem

  //level
  private int lvl;

  //atributos independentes
  private int dex; private int sta; private int str; private int intel;
  private int agi; private int luk;

  //atributos dependentes
  private int atk; private int mAtk; private int def; private int mDef;
  private int maxHp; private int maxSp; private int atkSpd; private int ten;
  private int cri; private int hit; private int eva;

  //Construtor:

  public Character(String name, int lvl, Job job) {
    this.name = name;
    this.lvl = lvl;
    this.job = job;

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

  public String getJob() {
    return job.name;
  }

  public int getLvl() {
    return lvl;
  }

  public int getIntel() {
    return intel;
  }

  public int getStr() {
    return str;
  }

  public int getSta() {
    return sta;
  }

  public int getAgi() {
    return agi;
  }

  public int getDex() {
    return dex;
  }

  public int getLuk() {
    return luk;
  }

  public int getAtk() {
    return atk;
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

  public void lvlUp() {
    this.lvl += lvl;
  }

  public void incrementIntel(int increment) {
    if (increment>0) {
      this.intel += increment;
      updateStats();
    }
    else
      System.out.println("Erro, increment de atributo negativo");
  }

  public void incrementStr(int increment) {
    if (increment>0) {
      this.str += increment;
      updateStats();
    }
    else
      System.out.println("Erro, increment de atributo negativo");
  }

  public void incrementSta(int increment) {
    if (increment>0){
      this.sta +=increment;
      updateStats();
    }
    else
      System.out.println("Erro, increment de atributo negativo");
  }

  public void incrementAgi(int increment) {
    if (increment>0) {
      this.agi += increment;
      updateStats();
    }
    else
      System.out.println("Erro, increment de atributo negativo");
  }

  public void incrementDex(int increment) {
    if (increment>0){
      this.dex +=increment;
      updateStats();
    }
    else
      System.out.println("Erro, increment de atributo negativo");
  }

  public void incrementLuk(int increment) {
    if (increment>0) {
      this.luk += increment;
      updateStats();
    }
    else
      System.out.println("Erro, increment de atributo negativo");
  }

  private void updateStats(){
    this.atk = job.setAtk(dex,sta,str,intel,agi,luk);
    this.mAtk = job.setMAtk(dex,sta,str,intel,agi,luk);
    this.def = job.setDef(dex,sta,str,intel,agi,luk);
    this.mDef = job.setMDef(dex,sta,str,intel,agi,luk);
    this.maxHp = job.setMaxHp(dex,sta,str,intel,agi,luk);
    this.maxSp = job.setMaxSp(dex,sta,str,intel,agi,luk);
    this.atkSpd = job.setAtkSpd(dex,sta,str,intel,agi,luk);
    this.eva = job.setEva(dex,sta,str,intel,agi,luk);
    this.cri = job.setCri(dex,sta,str,intel,agi,luk);
    this.hit = job.setHit(dex,sta,str,intel,agi,luk);
    this.ten = job.setTen(dex,sta,str,intel,agi,luk);
  }

}
