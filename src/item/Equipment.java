package item;
import character.hero.HeroJob;
import character.hero.HeroJobType;
import util.Attributes;

import javax.smartcardio.ATR;
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
  private util.Attributes attributes;
  private static final Random random = new Random();
  private static int weight=1;

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

  public HeroJobType getHeroJobType() {
    return heroJobType;
  }

  public Attributes getAttributes() {
    return attributes;
  }


  public static Equipment randomEquipment(int level){
    EquipmentType equipmentType = randomEquipmentType();
    Attributes attributes = new Attributes(level, weight);
    HeroJobType heroJobType = HeroJobType.randomHeroJobType();
    Equipment equipment = new Equipment("Equipamentos", heroJobType,
            equipmentType, attributes);
    return equipment;
  }


  public static EquipmentType randomEquipmentType(){
    EquipmentType[] equipmentTypes = EquipmentType.values();
    int index = random.nextInt(equipmentTypes.length);
    return equipmentTypes[index];
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
