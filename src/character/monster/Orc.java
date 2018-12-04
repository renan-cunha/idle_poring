package character.monster;

import character.Character;

public class Orc extends MonsterJob {

  public Orc() {
    super(MonsterJobType.ORC);
  }

  @Override
  public int setAtk(Character character) {
    return setAttWeights(character, 2, 3, 0, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return setAttWeights(character, 3, 2, 0, 0, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return setAttWeights(character, 6, 3, 0, 0, 0, 0);
  }

  @Override
  public int setMaxSp(Character character) {
    return setAttWeights(character, 0, 0, 0, 1, 0, 0);
  }
}
