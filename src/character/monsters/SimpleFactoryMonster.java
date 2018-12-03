package character.monsters;

import item.Equipment;
import util.Attributes;

import java.util.Random;


public class SimpleFactoryMonster {
  private static int weight = 10;
  private static Random random = new Random();
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


  public static Monster createMonster(MonsterJobType monsterJobType, int level){
    Attributes attributes = new Attributes(level,weight);
    MonsterJob monsterJob = createMonsterJob(monsterJobType);
    Equipment equipment = Equipment.randomEquipment(level);
    int nCoins = random.nextInt(level*10);
    Monster monster = new Monster("Monster", monsterJob, attributes, nCoins);
    monster.setEquipment(equipment);
    return monster;
  }
}
