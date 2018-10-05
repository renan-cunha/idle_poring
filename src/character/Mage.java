package character;

public class Mage extends Job {

  public Mage(){
    this.name = "Mage";
  }

  @Override
  public int setAtk(Character character) {
    return 0;
  }

  @Override
  public int setMAtk(Character character) {
    return 4*character.intel;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.dex+2*character.sta+2*character.str;
  }

  @Override
  public int setMDef(Character character) {
    return setDef(character);
  }

  @Override
  public int setMaxHp(Character character) {
    return 10*character.luk +8*character.dex+4*character.intel+
            16*character.sta+12*character.agi+8*character.str;
  }

  @Override
  public int setMaxSp(Character character) {
    return 8*character.str+2*character.intel+8*character.dex;
  }

}
