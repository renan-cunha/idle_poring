package item;
import character.hero.HeroJob;
import character.hero.HeroJobType;
import character.hero.Novice;
import util.Attributes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

//TODO: Job restriction of equipment

public class Equipment implements Item{
  private String name;
  private int value;
  private HeroJobType heroJobType;
  private EquipmentType equipType;
  private Attributes attributes;
  private static final Random random = new Random();
  private static int weight=1;
  private Gem gem;


  public Equipment(EquipmentType equipmentType){
    this.name = "Empty";
    this.heroJobType = HeroJobType.NOVICE;
    this.equipType = equipmentType;
    this.attributes = new Attributes(0,0,0,0,0,0,
            0);
  }

  public Equipment(String name, HeroJobType heroJobType,
                   EquipmentType equipmentType, Attributes attributes){
    this.name = name;
    this.heroJobType = heroJobType;
    this.equipType = equipmentType;
    this.attributes = attributes;
  }

  public Equipment(String name,
                   HeroJobType heroJobType,
                   EquipmentType equipType,
                   int level,
                   int str,
                   int agi,
                   int sta,
                   int intel,
                   int dex,
                   int luk) {
    this.name = name;
    this.heroJobType = heroJobType;
    this.equipType = equipType;
    this.attributes = new Attributes(level,dex,sta,str,intel,agi,luk);
  }

  public EquipmentType getEquipType() {
    return equipType;
  }

  public String getName() {
    return name;
  }
  public int getValue() {
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }
  public void setGem(Gem gem) {this.gem = gem;}

  public HeroJobType getHeroJobType() {
    return heroJobType;
  }

  public Attributes getAttributes() {

    if(gem == null) return attributes;
    else return attributes.add(new Attributes[]{gem.getAttributes()});
  }


  public static Equipment randomEquipment(int level){
    EquipmentType equipmentType = EquipmentType.randomEquipmentType();
    Attributes attributes = Attributes.randomAttributes(level, weight);
    HeroJobType heroJobType = HeroJobType.randomHeroJobType();
    Equipment equipment = new Equipment("Equipamentos", heroJobType,
            equipmentType, attributes);
    return equipment;
  }

  public void setXp(int xp){
    if (getAttributes().getXp() + xp >= 100){
      this.getAttributes().lvlUp();
    }
    getAttributes().setXp(xp);
  }

  @Override
  public String toString() {
    return "Equipment{" +
            "\nName=" + name + '\'' +
            "\nEquipmentType=" + equipType + '\''+
            "\nHeroJobType=" + heroJobType + '\''+
            ", \nItem Attributes=" + attributes +
            '}';

  }

}
