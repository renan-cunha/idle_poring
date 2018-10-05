package character;

public class Swordsman extends Job {

  public Swordsman(){
    this.name="Swordsman";
  }

  @Override
  public int setAtk(Character character) {
    return 4*character.getStr();
  }

  @Override
  public int setMAtk(Character character) {
    return 0;
  }

  @Override
  public int setDef(Character character) {
    return 2*character.getSta()+2*character.getIntel()+2*character.getDex();
  }

  @Override
  public int setMDef(Character character) {
    return setDef(character);
  }

  @Override
  public int setMaxHp(Character character) {
    return 12*character.getAgi()+16*character.getSta()+8*character.getIntel()+
            8*character.getDex()+10*character.getLuk();
  }

  @Override
  public int setMaxSp(Character character) {
    return 8*character.getDex()+8*character.getIntel()+2*character.getStr();
  }
}
