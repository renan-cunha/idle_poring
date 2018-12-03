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

  public static Attributes randomAttributes(int level, int weight){
    int[] numbers = new int[6];
    for(int i=0; i<6; i++){
      numbers[i] = random.nextInt(level*weight)+1;
    }
    Attributes attributes = new Attributes(level, numbers[0], numbers[1],
            numbers[2], numbers[3], numbers[4], numbers[5]);
    return attributes;
  }

  public Attributes add(Attributes[] att){

    Attributes result = new Attributes();
    for (int i = 0; i < att.length; i++){
      result.setDex(this.dex + att[i].getDex());
      result.setSta(this.sta + att[i].getSta());
      result.setStr(this.str + att[i].getStr());
      result.setAgi(this.agi + att[i].getAgi());
      result.setLuk(this.luk + att[i].getLuk());
      result.setIntel(this.intel + att[i].getIntel());
    }
    return result;
  }

  public int getXp() {
    return xp;
  }

  public void setXp(int xp) {
    if(xp <0){
      System.out.println("New xp is lower than 0");
      System.exit(0);
    }
    this.xp = xp;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    if(level<=0){
      System.out.println("New level is lower or equal to 0");
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
