package character.monsters;

import character.Character;
import character.Job;
import character.JobType;

public class Orc extends MonsterJob {


  public Orc() {
    super(MonsterJobType.ORC);
  }

  @Override
  public int setAtk(Character character) {
    return weights(character, 2, 3, 0, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return weights(character, 3, 2, 0, 0, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return weights(character, 6, 3, 0, 0, 0, 0);
  }

  @Override
  public int setMaxSp(Character character) {
    return weights(character, 0, 0, 0, 1, 0, 0);
  }
}
