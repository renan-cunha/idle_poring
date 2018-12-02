package character;

public class Swordsman extends Job {


  public Swordsman(){
    this.name="Swordsman";
    this.type = JobType.SWORDSMAN;
  }

  @Override
  int setAtk(Character character) {
    return weights(character, 0, 4, 0, 0, 0, 0);
  }

  @Override
  int setDef(Character character) {
    return weights(character, 2, 0, 2, 2, 0, 0);
  }

  @Override
  int setMaxHp(Character character) {
    return weights(character, 16, 0, 8, 8, 12, 10);
  }

  @Override
  int setMaxSp(Character character) {
    return weights(character, 0, 2, 8, 8, 0, 0);
  }
}
