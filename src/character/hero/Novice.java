package character.hero;

import character.Character;

public class Novice extends HeroJob {

  public Novice(){
    super(HeroJobType.NOVICE);
  }

  @Override
  public int setAtk(Character character) {
    return setAttWeights(character, 0, 3, 3, 0, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return setAttWeights(character, 2, 2, 0, 0, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return setAttWeights(character, 32, 16, 0, 0, 0, 0);
  }

  @Override
  public int setMaxSp(Character character) {
    return setAttWeights(character, 0, 0, 0, 12, 0, 0);
  }

}
