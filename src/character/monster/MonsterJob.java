package character.monster;

import character.Character;
import character.Job;
import character.JobType;

public abstract class MonsterJob extends Job {
  final MonsterJobType monsterJobType;

  public MonsterJob(MonsterJobType monsterJobType) {
    super(JobType.MONSTER);
    this.monsterJobType = monsterJobType;
  }

  public int setAtkSpd(Character character) {
    return setAttWeights(character, 0, 0, 1, 0, 1, 0);
  }

  public int setEva(Character character) {
    return setAttWeights(character, 0, 0, 1, 0, 1, 0);
  }

  public int setCri(Character character) {
    return setAttWeights(character, 0, 0, 0, 0, 0, 2);

  }

  public int setHit(Character character) {
    return setAttWeights(character, 0, 0, 0, 0, 0, 2);
  }

  public int setTen(Character character) {
    return setAttWeights(character, 1, 0, 0, 0, 0, 1);
  }

  public MonsterJobType getMonsterJobType() {
    return monsterJobType;
  }

  @Override
  public String toString() {
    return "MonsterJob{" +
            "monsterJobType=" + monsterJobType +
            '}';
  }
}
