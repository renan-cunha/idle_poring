package item;
import character.Character;

public class Potion implements Item {
    String name;
    int value = 10;

    public Potion(String name){
        this.name= name;
    }

    void use(Character dude) {
        int hp = dude.getHp();
        int potionHpBonus = (int) 0.15* hp;
        dude.setHp(hp + potionHpBonus);
    }

    public String getName(){ return this.name;}
    public int getValue(){ return this.value;}
    public String toString(){ return "Item{" + this.name + "}"; }

}
