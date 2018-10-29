package items;

import character.Job;
import util.Attributes;

//TODO: Job restriction of equipment
//TODO: Position restriction of equipment
//TODO: Level should be in or out of class attribute:

public  class Equipment {
  private String name;
  private util.Attributes attributes;


  public Equipment(String name,
                   int level,
                   int str,
                   int agi,
                   int sta,
                   int intel,
                   int dex,
                   int luk) {
    this.name = name;
    this.attributes = new Attributes(level,dex,sta,str,intel,agi,luk);
  }

  public String getName() {
    return name;
  }

  public Attributes getAttributes() {
    return attributes;
  }

  private void lvlUpDex() {
    int new_value = getAttributes().getDex() + 1;
    getAttributes().setDex(new_value);
  }


  public void lvlUp(){
    int old = getAttributes().getLevel();
    int new_level = old + 1;
    getAttributes().setLevel(new_level);

    int new_att;
    new_att = getAttributes().getDex() + 1;
    getAttributes().setDex(new_att);

    new_att = getAttributes().getSta() + 1;
    getAttributes().setSta(new_att);

    new_att = getAttributes().getStr() + 1;
    getAttributes().setStr(new_att);

    new_att = getAttributes().getAgi() + 1;
    getAttributes().setAgi(new_att);

    new_att = getAttributes().getIntel() + 1;
    getAttributes().setIntel(new_att);

    new_att = getAttributes().getLuk() + 1;
    getAttributes().setLuk(new_att);

  }

  @Override
  public String toString() {
    return "Equipment{" +
            "name='" + name + '\'' +
            ", attributes=" + attributes +
            '}';
  }
}
