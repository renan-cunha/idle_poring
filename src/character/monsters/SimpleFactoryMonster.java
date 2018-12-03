package character.monsters;

import util.Attributes;

public class SimpleFactoryMonster {
  private static int weight = 10;
  private static MonsterJob createMonsterJob(MonsterJobType monsterJobType){
    if(monsterJobType == MonsterJobType.PORING){
      return new Poring();
    }else if (monsterJobType == MonsterJobType.ORC){
      return new Orc();
    }else{
      System.out.println("Error, This MonsterJob does not exist");
      System.exit(0);
    }
    return new Poring();
  }

  public static Monster createMonster(MonsterJobType monsterJobType) {
    return new Monster("Monster", createMonsterJob(monsterJobType));
  }

  public static Monster createMonster(MonsterJobType monsterJobType,
                                      Attributes attributes){
    return new Monster("Monster", createMonsterJob(monsterJobType),
            attributes);
    }

  public static Monster createMonster(MonsterJobType monsterJobType,
                                      int level, int dex, int sta, int str,
                                      int intel, int agi, int luk){
    return new Monster("Monster", createMonsterJob(monsterJobType), level,
            dex, sta, str, intel, agi, luk);
  }

  public static Monster createMonster(MonsterJobType monsterJobType, int level){
    Attributes attributes = new Attributes(level,weight);
    MonsterJob monsterJob = createMonsterJob(monsterJobType);
    return new Monster("Monster", monsterJob, attributes);
  }
}
