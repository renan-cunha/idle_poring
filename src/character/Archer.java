package character;

public class Archer extends Job{

  public Archer(){
    this.name="Archer";
  }

  @Override
  public int setAtk(Character character) {
    return 4*character.dex;
  }

  @Override
  public int setMAtk(Character character) {
    return 0;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.str + 2*character.sta + 2*character.intel;
  }

  @Override
  public int setMDef(Character character) {
    return setDef(character);
  }

  @Override
  public int setMaxHp(Character character) {
    return 8*character.str+12*character.agi+16*character.sta+
            8*character.intel+4*character.dex+10*character.luk;
  }

  @Override
  public int setMaxSp(Character character) {
    return 8*character.str+8*character.intel+2*character.dex;
  }
}
