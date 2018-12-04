package pets;
import util.Attributes;

public class Pet {
  String name;
  private Attributes attributes;


  public Pet(String name, Attributes attributes) {
    this.name = name;
    this.attributes = attributes;
  }

  public Pet(String name,int level, int dex, int sta, int str, int intel,
             int agi, int luk) {
    this.name = name;
    this.attributes = new Attributes(level, dex, sta, str, intel, agi, luk);
  }

  public String getName() {
    return name;
  }

  public Attributes getAttributes() {
    return attributes;
  }

  @Override
  public String toString() {
    return "Pet{" +
            "name='" + name + '\'' +
            ", attributes=" + attributes +
            '}';
  }

  public void setXp(int xp){
    if (getAttributes().getXp() + xp >= 100){
      this.getAttributes().lvlUp();
    }
    getAttributes().setXp(xp);
  }
}
