package item;
import character.Character;

public class Food implements Item {
    private String name;
    private int value = 10;
    public Food(String name){
        this.name = name;
    }

    //Consumir um item do tipo comida te dá 10% de hp

    void use(Character dude) {
        int hp = dude.getHp();
        int foodHpBonus = (int) 0.10* hp;
        dude.setHp(hp+ foodHpBonus);
    }
    @Override
    public String getName(){ return this.name;}

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public void setValue(int value){
        this.value = value;
    }
    @Override
    public String toString() {
        return "Item{" + this.name + "}";

    }
}
