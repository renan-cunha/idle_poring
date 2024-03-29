package character.hero;

import character.Character;

public class Mage extends HeroJob {


  public Mage() {
    super(HeroJobType.MAGE);
  }

  @Override
  public int setAtk(Character character) {
    return setAttWeights(character, 0, 0, 0, 4, 0, 0);
  }

  @Override
  public int setDef(Character character) {
    return setAttWeights(character, 2, 2, 2, 0, 0, 0);
  }

  @Override
  public int setMaxHp(Character character) {
    return setAttWeights(character, 10, 8, 8, 4, 12, 10);
  }

  @Override
  public int setMaxSp(Character character) {
    return setAttWeights(character, 0, 8, 8, 2, 0, 0);
  }

}
