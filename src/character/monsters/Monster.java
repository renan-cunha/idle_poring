package character.monsters;

import character.Character;
import character.Job;
import character.hero.HeroJob;
import character.hero.HeroJobType;
import item.Equipment;
import item.EquipmentType;
import util.Attributes;

public class Monster extends Character {
  public Monster(String name, MonsterJob job) {
    super(name);
    this.job = job;
    updateStats();
  }

  public Monster(String name, MonsterJob job, Attributes attributes, int nCoins) {
    super(name, attributes);
    this.job = job;
    this.pouch.addCoins(nCoins);
    updateStats();
  }

  public Monster(String name, MonsterJob job, int level, int dex, int sta, int str, int intel, int agi, int luk) {
    super(name, level, dex, sta, str, intel, agi, luk);
    this.job = job;
    updateStats();
  }

  @Override
  public void setJob(Job job) {
    MonsterJob monsterJob = (MonsterJob) job;
    this.job = monsterJob;
  }

  public void setHelmet(Equipment helmet) {
    if (helmet.getEquipType() == EquipmentType.HELMET) {
        this.helmet = helmet;
        updateStats();
      }else
        System.out.println("It's not a Helmet");
  }

  public void setWeapon(Equipment weapon) {
    if (weapon.getEquipType() == EquipmentType.WEAPON) {
        this.weapon = weapon;
        updateStats();
      }else
        System.out.println("It's not a Weapon");
  }

  public void setArmor(Equipment armor) {
    if (armor.getEquipType() == EquipmentType.ARMOR) {
        this.armor = armor;
        updateStats();
      }else
        System.out.println(("Its' not an Armor"));
  }

  @Override
  public String toString() {
    return "Monster{" +
            "name="+getName()+
            ", attributes=" + getAttributes()+
            ", job=" + job +
            ", armor=" + armor +
            ", weapon=" + weapon +
            ", helmet=" + helmet +
            '}';
  }
}
