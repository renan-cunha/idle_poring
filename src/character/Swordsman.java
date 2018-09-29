package character;

public class Swordsman extends Job {

  public Swordsman(){
    this.name="Swordsman";
  }

  @Override
  public int setAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 4*str;
  }

  @Override
  public int setMAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 0;
  }

  @Override
  public int setDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return 2*sta+2*intel+2*dex;
  }

  @Override
  public int setMDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return setDef(dex,sta,str,intel,agi,luk);
  }

  @Override
  public int setMaxHp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 12*agi+16*sta+8*intel+8*dex+10*luk;
  }

  @Override
  public int setMaxSp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 8*dex+8*intel+2*str;
  }
}
