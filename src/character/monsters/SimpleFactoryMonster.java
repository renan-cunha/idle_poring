package character.monsters;

import util.Attributes;

public class SimpleFactoryMonster {
  public static Monster createMonster(MonsterJobType monsterJobType) {
    if (monsterJobType == MonsterJobType.PORING) {

      return new Monster("Monster", new Poring());
    }
    else if (monsterJobType == MonsterJobType.ORC) {
      return new Monster("Monster", new Orc());

    }
    else {
      System.out.println("Error, This monster is not implemented yet");
      System.exit(0);
    }
    return new Monster("Monster", new Poring());
  }

  public static Monster createMonster(MonsterJobType monsterJobType,
    Attributes attributes){
    if (monsterJobType == MonsterJobType.PORING)
      return new Monster("Monster", new Poring(), attributes);
    else if (monsterJobType == MonsterJobType.ORC)
      return new Monster("Monster", new Orc(), attributes);
    else {
      System.out.println("Error, This monster is not implemented yet");
      System.exit(0);
    }
    return new Monster("Monster", new Poring());
    }

  public static Monster createMonster(MonsterJobType monsterJobType,
                                      int level, int dex, int sta, int str,
                                      int intel, int agi, int luk){
    if (monsterJobType == MonsterJobType.PORING)
      return new Monster("Monster", new Poring(), level, dex, sta, str,
              intel, agi, luk);
    else if (monsterJobType == MonsterJobType.ORC)
      return new Monster("Monster", new Orc(), level, dex, sta, str,
              intel, agi, luk);
    else {
      System.out.println("Error, This monster is not implemented yet");
      System.exit(0);
    }
    return new Monster("Monster", new Poring());
  }




}
