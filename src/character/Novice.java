package character;

public class Novice extends Job {
  public Novice(){
    this.name="Novice";
  }

  @Override
  int setAtk(Character character) {
    return weights(character, 0, 3, 3, 0, 0, 0);
  }

  @Override
  int setDef(Character character) {
    return weights(character, 2, 2, 0, 0, 0, 0);
  }

  @Override
  int setMaxHp(Character character) {
    return weights(character, 32, 16, 0, 0, 0, 0);
  }

  @Override
  int setMaxSp(Character character) {
    return weights(character, 0, 0, 0, 12, 0, 0);
  }

}
