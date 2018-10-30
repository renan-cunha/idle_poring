package items;

import character.Job;

// duvidas classe atributos
// duvidas type quipe
// duvidas Job

public abstract class Equipment {
  private String name;
  protected String type;
  private Job job;
  private int level;
  private int str;
  private int agi;
  private int sta;
  private int intel;
  private int dex;
  private int luk;
  //TODO: Adicionar gemas

  public Equipment(String name, Job job, int level, int str, int agi, int sta, int intel, int dex, int luk) {
    this.name = name;
    this.job = job;
    this.level = level;
    this.str = str;
    this.agi = agi;
    this.sta = sta;
    this.intel = intel;
    this.dex = dex;
    this.luk = luk;
  }

  public String getName() {
    return name;
  }

  public Job getJob() {
    return job;
  }

  public int getLevel() {
    return level;
  }

  public int getStr() {
    return str;
  }

  public int getAgi() {
    return agi;
  }

  public int getSta() {
    return sta;
  }

  public int getIntel() {
    return intel;
  }

  public int getDex() {
    return dex;
  }

  public int getLuk() {
    return luk;
  }

  @Override
  public String toString(){
    return "\nTipo: " + type+" |Lvl: "+Integer.toString(level);
  }
}
