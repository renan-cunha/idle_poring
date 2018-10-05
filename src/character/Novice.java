package character;

public class Novice extends Job {
  public Novice(){
    this.name="Novice";
  }

  @Override
  public int setAtk(Character character) {
    return 2*character.str+character.dex;
  }

  @Override
  public int setMAtk(Character character) {
    return 0;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.str + 2*character.sta;
  }

  @Override
  public int setMDef(Character character) {
    return 0;
  }

  @Override
  public int setMaxHp(Character character) {
    return 16*character.str+32*character.sta;
  }

  @Override
  public int setMaxSp(Character character) {
    return 12*character.intel;
  }

}
