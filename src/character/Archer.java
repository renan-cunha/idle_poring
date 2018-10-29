package character;

public class Archer extends Job{

  public Archer(){
    this.name="Archer";
  }


  @Override
  int setAtk(Character character) {
    return weights(character, 0, 0, 4, 0, 0, 0);
  }

  @Override
  int setDef(Character character) {
    return weights(character, 2, 2, 0, 2, 0, 0);
  }

  @Override
  int setMaxHp(Character character) {
    return weights(character, 16, 8, 4, 8, 12, 10);
  }

  @Override
  int setMaxSp(Character character) {
    return weights(character, 0, 8, 2, 8, 0, 0);
    }
}
