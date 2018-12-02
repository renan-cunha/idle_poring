package item;

import character.JobType;

public class Weapon extends Equipment {
  public Weapon(String name, JobType type, int level, int str, int agi, int sta, int intel, int dex, int luk) {
    super(name, type, level, str, agi, sta, intel, dex, luk);
  }
}
