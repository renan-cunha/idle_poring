package character;

public class Archer extends Job{

  public Archer(){
    this.name="Archer";
  }

  @Override
  public int setAtk(Character character) {
    return 4*character.getDex();
  }

  @Override
  public int setMAtk(Character character) {
    return 0;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.getStr() + 2*character.getSta() + 2*character.getIntel();
  }

  @Override
  public int setMDef(Character character) {
    return setDef(character);
  }

  @Override
  public int setMaxHp(Character character) {
    return 8*character.getStr()+12*character.getAgi()+16*character.getSta()+
            8*character.getIntel()+4*character.getDex()+10*character.getLuk();
  }

  @Override
  public int setMaxSp(Character character) {
    return 8*character.getStr()+8*character.getIntel()+2*character.getDex();
  }
}
