package items;

import character.Job;

public class Armor extends Equipment {
  public Armor(String name, Job job, int level, int str, int agi, int sta, int intel, int dex, int luk) {
    super(name, job, level, str, agi, sta, intel, dex, luk);
    this.type = "Acessory";
  }

}
