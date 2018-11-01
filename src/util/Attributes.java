package util;

public class Attributes {
  private int level; private int dex;private int sta; private int str;
  private int intel; private int agi; private int luk;

  public Attributes(int level, int dex, int sta, int str, int intel, int agi, int luk) {
    this.level = level;
    this.dex = dex;
    this.sta = sta;
    this.str = str;
    this.intel = intel;
    this.agi = agi;
    this.luk = luk;
  }

  @Override
  public String toString() {
    return "Attributes{" +
            "level=" + level +
            ", dex=" + dex +
            ", sta=" + sta +
            ", str=" + str +
            ", intel=" + intel +
            ", agi=" + agi +
            ", luk=" + luk +
            '}';
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
}
