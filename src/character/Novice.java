package character;

public class Novice extends Job {
  public Novice(){
    this.name="Novice";
  }

  @Override
  public int setAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 2*str+dex;
  }

  @Override
  public int setMAtk(int dex, int sta, int str, int intel, int agi, int luk) {
    return 0;
  }

  @Override
  public int setDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return 2*str + 2*sta;
  }

  @Override
  public int setMDef(int dex, int sta, int str, int intel, int agi, int luk) {
    return 0;
  }

  @Override
  public int setMaxHp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 16*str+32*sta;
  }

  @Override
  public int setMaxSp(int dex, int sta, int str, int intel, int agi, int luk) {
    return 12*intel;
  }

}
