package item;

import util.Attributes;

public class Gem implements Item{
    String name = "Gem";
    int value = 1;
    private Attributes attributes;

    public Gem(Attributes attributes){
        this.attributes = attributes;
    }

    public Attributes getAttributes(){return this.attributes; }
    @Override
    public String getName(){return this.name;};

    @Override
    public int getValue() { return this.value; }

    @Override
    public void setValue(int value) { this.value = value;}
}
