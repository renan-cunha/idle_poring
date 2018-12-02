package item;
import character.hero.HeroJobType;
import util.Attributes;

//TODO: Job restriction of equipment

public class Equipment implements Item{
  private String name;
  private int value;
  private HeroJobType heroJobType;
  private EquipmentType equipType;
  private util.Attributes attributes;

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

  public HeroJobType getHeroJobType() {
    return heroJobType;
  }

  public Attributes getAttributes() {
    return attributes;
  }

  @Override
  public String toString() {
    return "Equipment{" +
            "\nName=" + name + '\'' +
            "\nHeroJobType=" + heroJobType + '\''+
            ", \nItem Attributes=" + attributes +
            '}';

  }
}
