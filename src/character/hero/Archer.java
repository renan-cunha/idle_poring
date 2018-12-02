package character.hero;

import character.Character;
import character.Job;

public class Archer extends HeroJob{


  public Archer() {
    super(HeroJobType.ARCHER);
  }

  @Override
  public int setAtk(Character character) {
    return weights(character, 0, 0, 4, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return weights(character, 2, 2, 0, 2, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return weights(character, 16, 8, 4, 8, 12, 10);
  }

  @Override
  public int setMaxSp(Character character) {
    return weights(character, 0, 8, 2, 8, 0, 0);
    }
}
