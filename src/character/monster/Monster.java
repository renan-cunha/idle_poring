package character.monster;

import character.Character;
import character.Job;
import util.Attributes;

public class Monster extends Character {

  public Monster(String name, MonsterJob job, Attributes attributes, int nCoins) {
    super(name, attributes);
    this.job = job;
    this.pouch.addCoins(nCoins);
    updateStats();
  }

  @Override
  public void setJob(Job job) {
    MonsterJob monsterJob = (MonsterJob) job;
    this.job = monsterJob;
  }
}
