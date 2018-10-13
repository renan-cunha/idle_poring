package Items;

import character.Job;

// duvidas classe atributos
// duvidas type quipe
// duvidas Job

public class Equip {
  private String name;
  private TypeEquip TypeEquip;
  private Job job;
  private int str;
  private int agi;
  private int sta;
  private int intel;
  private int dex;
  private int luk;
  //TODO: Adicionar gemas

  public Equip(String name, Items.TypeEquip typeEquip, Job job, int str, int agi, int sta, int intel, int dex, int luk) {
    this.name = name;
    TypeEquip = typeEquip;
    this.job = job;
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

  public TypeEquip getTypeEquip() {
    return TypeEquip;
  }

  public Job getJob() {
    return job;
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
}
