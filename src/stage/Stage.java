package stage;
import java.util.*;
import character.monsters.MonsterJobType;
import character.monsters.Monster;
import character.monsters.SimpleFactoryMonster;


public class Stage {
  private LinkedList<MonsterJobType> monsterJobTypes = new
          LinkedList<MonsterJobType>();
  private LinkedList<Monster> monsters = new LinkedList<Monster>();
  private int lvl;
  private Random random = new Random();
  private int size;
  private Monster boss;

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
      this.monsterJobTypes.add(monsterJobTypes[i]);
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
            ", monsters=" + monsters +
            ", lvl=" + lvl +
            ", size=" + size +
            ", boss=" + boss +
            '}';
  }

  public String getMonsters() {
    return monsters.get(1).toString();
  }
}
