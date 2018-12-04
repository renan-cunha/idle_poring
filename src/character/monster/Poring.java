package character.monster;

import character.Character;

public class Poring extends MonsterJob {


  public Poring() {
    super(MonsterJobType.PORING);
  }

  @Override
  public int setAtk(Character character) {
    return setAttWeights(character, 1, 2, 0, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return setAttWeights(character, 2, 2, 0, 0, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return setAttWeights(character, 4, 2, 0, 0, 0, 0);
  }

  @Override
  public int setMaxSp(Character character) {
    return setAttWeights(character, 0, 0, 0, 2, 0, 0);
  }
}
