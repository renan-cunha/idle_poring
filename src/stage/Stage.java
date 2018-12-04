package stage;
import java.util.*;

import battle.Battle;
import character.monster.MonsterJobType;
import character.monster.Monster;
import character.monster.SimpleFactoryMonster;
import character.hero.Hero;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Stage {
  private LinkedList<MonsterJobType> monsterJobTypes = new
          LinkedList<MonsterJobType>();
  private LinkedList<Monster> monsters = new LinkedList<Monster>();
  private int lvl;
  private Random random = new Random();
  private int size;
  private Monster boss;
  private Boolean bossWin=false;

  public Stage(int lvl, int size) {
    this.lvl = lvl;
    this.size = size;
    for (MonsterJobType type: MonsterJobType.values()){
      this.monsterJobTypes.add(type);
    }
    fillStageWithMonsters();
    this.boss = createBoss();
  }

  public Stage(MonsterJobType[] monsterJobTypes, int lvl, int size) {
    this.lvl = lvl;
    this.size = size;
    for(int i=0;i<monsterJobTypes.length;i++){
      this.monsterJobTypes.add(monsterJobTypes[i])  ;
    }
    fillStageWithMonsters();
    this.boss = createBoss();
  }

  public Stage(Monster[] monsters, int lvl, int size) {
    this.lvl = lvl;
    this.size = size;
    for(int i=0;i<monsters.length;i++){
      this.monsters.add(monsters[i]);
    }
    fillStageWithMonsters();
    this.boss = createBoss();
  }

  //MonsterJobType aleatorio de acordo com a fase
  //talvez essas funções deveriam ir para simpleFactoryMonster
  private MonsterJobType randomMonsterJobType(){
    int sizeMonsterJobTypes = monsterJobTypes.size();
    int index = random.nextInt(sizeMonsterJobTypes);
    return monsterJobTypes.get(index);
  }

  private void fillStageWithMonsters(){
    for (int i=0; i<this.size; i++){
      MonsterJobType monsterJobType = randomMonsterJobType();
      Monster monster = SimpleFactoryMonster.createMonster(monsterJobType,
              this.lvl);
      this.monsters.add(monster);
    }
  }

  private Monster createBoss(){
    MonsterJobType monsterJobType = randomMonsterJobType();
    Monster boss = SimpleFactoryMonster.createMonster(monsterJobType,
            this.lvl+1);
    return boss;
  }

  @Override
  public String toString() {
    return "Stage{" +
            "monsterJobTypes=" + monsterJobTypes +
            ", monster=" + monsters +
            ", lvl=" + lvl +
            ", size=" + size +
            ", boss=" + boss +
            '}';
  }

  public void startBattle(Hero hero){
    int i = 0;
    String n;
    Scanner reader = new Scanner(System.in);
    while(true) {
      Battle.fight(hero, this.monsters.get(i));

      System.out.println(getBossWin());
      System.out.println("\nChallenge the boss? (y/n) ");

      System.out.println("efef");
      if(reader.next().equals("y")) {
        challengeBoss(hero);
        if (getBossWin())
          break;
      }

      //reader.close();

      if(i==this.size-1)
        i = 0;
    }
  }

  public String getMonsters() {
    return monsters.toString();
  }

  public void challengeBoss(Hero hero){
    Boolean bool = Battle.fight(hero, this.boss);
    if(bool)
      this.bossWin=true;
  }

  public LinkedList<MonsterJobType> getMonsterJobTypes() {
    return monsterJobTypes;
  }

  public int getLvl() {
    return lvl;
  }

  public int getSize() {
    return size;
  }

  public Monster getBoss() {
    return boss;
  }

  public Boolean getBossWin() {
    return bossWin;
  }
}
