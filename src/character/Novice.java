package character;

public class Novice extends Job {
  public Novice(){
    this.name="Novice";
  }

  @Override
  public int setAtk(Character character) {
    return 2*character.getStr()+character.getDex();
  }

  @Override
  public int setMAtk(Character character) {
    return 0;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.getStr() + 2*character.getSta();
  }

  @Override
  public int setMDef(Character character) {
    return 0;
  }

  @Override
  public int setMaxHp(Character character) {
    return 16*character.getStr()+32*character.getSta();
  }

  @Override
  public int setMaxSp(Character character) {
    return 12*character.getIntel();
  }

}
