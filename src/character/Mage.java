package character;

public class Mage extends Job {

  public Mage(){
    this.name = "Mage";
  }

  @Override
  public int setAtk(Character character) {
    return setMAtk(character);
  }

  @Override
  public int setMAtk(Character character) {
    return 4*character.getIntel();
  }

  @Override
  public int setDef(Character character) {
    return 2*character.getDex()+2*character.getSta()+2*character.getStr();
  }

  @Override
  public int setMDef(Character character) {
    return setDef(character);
  }

  @Override
  public int setMaxHp(Character character) {
    return 10*character.getLuk() +8*character.getDex()+4*character.getIntel()+
            16*character.getSta()+12*character.getAgi()+8*character.getStr();
  }

  @Override
  public int setMaxSp(Character character) {
    return 8*character.getStr()+2*character.getIntel()+8*character.getDex();
  }

}
