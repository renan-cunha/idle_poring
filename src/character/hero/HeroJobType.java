package character.hero;
import java.util.Random;

public enum HeroJobType {
  SWORDSMAN, ARCHER, MAGE, NOVICE;

  public static HeroJobType randomHeroJobType(){
    Random random = new Random();
    HeroJobType[] heroJobTypes = HeroJobType.values();
    int index = random.nextInt(heroJobTypes.length);
    return heroJobTypes[index];
  }


}
