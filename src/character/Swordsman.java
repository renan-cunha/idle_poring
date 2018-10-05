package character;

public class Swordsman extends Job {

  public Swordsman(){
    this.name="Swordsman";
  }

  @Override
  public int setAtk(Character character) {
    return 4*character.str;
  }

  @Override
  public int setMAtk(Character character) {
    return 0;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.sta+2*character.intel+2*character.dex;
  }

  @Override
  public int setMDef(Character character) {
    return setDef(character);
  }

  @Override
  public int setMaxHp(Character character) {
    return 12*character.agi+16*character.sta+8*character.intel+
            8*character.dex+10*character.luk;
  }

  @Override
  public int setMaxSp(Character character) {
    return 8*character.dex+8*character.intel+2*character.str;
  }
}
