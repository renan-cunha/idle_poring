package character.monsters;

import item.Equipment;
import util.Attributes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    Attributes attributes = Attributes.randomAttributes(level,weight);
    MonsterJob monsterJob = createMonsterJob(monsterJobType);
    Equipment equipment = Equipment.randomEquipment(level);
    int nCoins = random.nextInt(level*10);
    String name = getNameFromSeed();
    Monster monster = new Monster(name, monsterJob, attributes, nCoins);
    monster.setEquipment(equipment);
    return monster;
  }


  private static String getNameFromSeed() {
    BufferedReader reader;
    Random generator = new Random();
    int nLines = 29; //retirado do arquivo
    String line = null;
    try {
      reader = new BufferedReader(new FileReader(
              "/home/marcelo/idle_poring/src/util/enemyNames.txt"));
      line = reader.readLine();

      for (int i = 0; i <= generator.nextInt(nLines); i++) {
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return line;

  }
}
