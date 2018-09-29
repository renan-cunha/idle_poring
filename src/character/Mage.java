package character;

public class Mage extends Job {

  public Mage(){
    this.name = "Mage";
  }

  @Override
  public int setAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 0;
  }

  @Override
  public int setMAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 4*intel;
  }

  @Override
  public int setDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return 2*dex+2*sta+2*str;
  }

  @Override
  public int setMDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return setDef(dex,sta,str,intel,agi,luk);
  }

  @Override
  public int setMaxHp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 10*luk+8*dex+4*intel+16*sta+12*agi+8*str;
  }

  @Override
  public int setMaxSp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 8*str+2*intel+8*dex;
  }

}
