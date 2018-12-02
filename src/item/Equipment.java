package item;
import character.JobType;
import util.Attributes;

//TODO: Job restriction of equipment

public class Equipment implements Item{
  private String name;
  private int value;
  private JobType jobType;
  private EquipmentType equipType;
  private util.Attributes attributes;

  public Equipment(String name,
                   JobType jobType,
                   EquipmentType equipType,
                   int level,
                   int str,
                   int agi,
                   int sta,
                   int intel,
                   int dex,
                   int luk) {
    this.name = name;
    this.jobType = jobType;
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

  public JobType getJobType() {
    return jobType;
  }

  public Attributes getAttributes() {
    return attributes;
  }

  @Override
  public String toString() {
    return "Equipment{" +
            "\nName=" + name + '\'' +
            "\nJobType=" + jobType + '\''+
            ", \nItem Attributes=" + attributes +
            '}';

  }
}
