package character;

public class Archer extends Job{

  public Archer(){
    this.name="Archer";
  }

  @Override
  public int setAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 4*dex;
  }

  @Override
  public int setMAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 0;
  }

  @Override
  public int setDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return 2*str + 2*sta + 2*intel;
  }

  @Override
  public int setMDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return setDef(dex,sta,str,intel,agi,luk);
  }

  @Override
  public int setMaxHp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 8*str+12*agi+16*sta+8*intel+4*dex+10*luk;
  }

  @Override
  public int setMaxSp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 8*str+8*intel+2*dex;
  }
}
