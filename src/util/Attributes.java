package util;
import java.util.Random;

public class Attributes {
  private int level = 1;
  private int dex = 0;
  private int sta = 0;
  private int str = 0;
  private int intel = 0;
  private int agi = 0;
  private int luk = 0;
  private int xp = 0;
  private static Random random = new Random();


  public Attributes() {
  }

  public Attributes(int level, int weight){
    this.level = level;

    this.dex = random.nextInt(level*weight)+1;
    this.sta = random.nextInt(level*weight)+1;
    this.str = random.nextInt(level*weight)+1;
    this.intel = random.nextInt(level*weight)+1;
    this.agi = random.nextInt(level*weight)+1;
    this.luk = random.nextInt(level*weight)+1;

  }

  public Attributes(int level, int dex, int sta, int str, int intel, int agi,
                    int luk) {
    this.level = level;
    this.dex = dex;
    this.sta = sta;
    this.str = str;
    this.intel = intel;
    this.agi = agi;
    this.luk = luk;
  }

  public int getXp() {
    return xp;
  }

  public void setXp(int xp) {
    this.xp = xp;
    if (this.xp >= 100) {
      lvlUp();
      this.xp = 0;
    }
  }


  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    if(level<=0){
      System.out.println("New stage is lower or equal to 0");
      System.exit(0);
    }
    this.level = level;
  }

  public int getDex() {
    return dex;
  }

  public void setDex(int dex) {
    this.dex = dex;
  }

  public int getSta() {
    return sta;
  }

  public void setSta(int sta) {
    this.sta = sta;
  }

  public int getStr() {
    return str;
  }

  public void setStr(int str) {
    this.str = str;
  }

  public int getIntel() {
    return intel;
  }

  public void setIntel(int intel) {
    this.intel = intel;
  }

  public int getAgi() {
    return agi;
  }

  public void setAgi(int agi) {
    this.agi = agi;
  }

  public int getLuk() {
    return luk;
  }

  public void setLuk(int luk) {
    this.luk = luk;
  }

  public Attributes add(Attributes[] att){
    Attributes result = new Attributes(getLevel(), getDex(), getSta(), getStr(),
            getIntel(), getAgi(), getLuk());
    for (int i = 0; i < att.length; i++){
      int dex = result.getDex() + att[i].getDex();
      int sta = result.getSta() + att[i].getSta();
      int str = result.getStr() + att[i].getStr();
      int agi = result.getAgi() + att[i].getAgi();
      int luk = result.getLuk() + att[i].getLuk();
      int intel = result.getIntel() + att[i].getIntel();

      result.setDex(dex);
      result.setSta(sta);
      result.setStr(str);
      result.setAgi(agi);
      result.setLuk(luk);
      result.setIntel(intel);
    }
    return result;
  }

  public void lvlUp(){
    int old = this.getLevel();
    int new_level = old + 1;
    setLevel(new_level);

    int new_att;
    new_att = getDex() + 1;
    setDex(new_att);

    new_att = getSta() + 1;
    setSta(new_att);

    new_att = getStr() + 1;
    setStr(new_att);

    new_att = getAgi() + 1;
    setAgi(new_att);

    new_att = getIntel() + 1;
    setIntel(new_att);

    new_att = getLuk() + 1;
    setLuk(new_att);

  }

  @Override
  public String toString() {
    return "Attributes{" +
            "lvl=" + level +
            ", dex=" + dex +
            ", sta=" + sta +
            ", str=" + str +
            ", intel=" + intel +
            ", agi=" + agi +
            ", luk=" + luk +
            ", xp=" + xp +
            '}';
  }
}
