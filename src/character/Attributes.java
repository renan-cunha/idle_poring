package character;

public enum Attributes {
    LVL("Level"), HP("Health Points"), SP("Skill Points"),
    ATK("Attack"), DEF("Defense"), M_ATK("Magical Attack"), M_DEF("Magical Defense"),
    ACC("Accuracy"), CRT("Critical"), TEN("Tenacity"), EVA("Evasion"), ATK_SPD("Attack Speed");

    private String attribute;

    Attributes(String attribute){this.attribute = attribute;};

    //public String getAttribute(){return attribute};
}
