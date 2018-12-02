package character.hero;

import character.Character;
import character.Job;
import character.JobType;

public abstract class HeroJob extends Job {
  final HeroJobType heroJobType;

  public HeroJob(HeroJobType heroJobType) {
    super(JobType.HERO);
    this.heroJobType = heroJobType;
  }

  public int setAtkSpd(Character character) {
    return weights(character, 0, 0, 0, 0, 2, 0);
  }

  public int setEva(Character character) {
    return weights(character, 0, 0, 0, 0, 2, 0);
  }

  public int setCri(Character character) {
    return weights(character, 0, 0, 0, 0, 0, 2);

  }

  public int setHit(Character character) {
    return weights(character, 0, 0, 0, 0, 0, 2);
  }

  public int setTen(Character character) {
    return weights(character, 0, 0, 0, 0, 0, 2);
  }

  public HeroJobType getHeroJobType() {
    return heroJobType;
  }
}
