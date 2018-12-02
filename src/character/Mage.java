package character;

public class Mage extends Job {


  public Mage(){
    this.name = "Mage";
    this.type = JobType.MAGE;
  }

  @Override
  int setAtk(Character character) {
    return weights(character, 0, 0, 0, 4, 0, 0);
  }

  @Override
  int setDef(Character character) {
    return weights(character, 2, 2, 2, 0, 0, 0);
  }

  @Override
  int setMaxHp(Character character) {
    return weights(character, 10, 8, 8, 4, 12, 10);
  }

  @Override
  int setMaxSp(Character character) {
    return weights(character, 0, 8, 8, 2, 0, 0);
  }

}
