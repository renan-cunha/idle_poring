package character.hero;

import character.Character;
import character.Job;
import character.hero.HeroJobType;

public class Novice extends HeroJob {

  public Novice(){
    super(HeroJobType.NOVICE);
  }

  @Override
  public int setAtk(Character character) {
    return weights(character, 0, 3, 3, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return weights(character, 2, 2, 0, 0, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return weights(character, 32, 16, 0, 0, 0, 0);
  }

  @Override
  public int setMaxSp(Character character) {
    return weights(character, 0, 0, 0, 12, 0, 0);
  }

}
