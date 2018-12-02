package character.hero;

import character.Character;
import character.Job;
import character.hero.HeroJobType;

public class Swordsman extends HeroJob {


  public Swordsman(){
    super(HeroJobType.SWORDSMAN);
  }

  @Override
  public int setAtk(Character character) {
    return weights(character, 0, 4, 0, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return weights(character, 2, 0, 2, 2, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return weights(character, 16, 0, 8, 8, 12, 10);
  }

  @Override
  public int setMaxSp(Character character) {
    return weights(character, 0, 2, 8, 8, 0, 0);
  }
}
