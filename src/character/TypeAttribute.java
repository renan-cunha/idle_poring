package character;

public enum TypeAttribute {
    LVL("Level"), STA("Stamina"), AGI("Agility"), LUK("Lucky"),
    INT("Inteligence"), DEX("Dexterity"), STR("Strenght");

    private String ind_att;

    TypeAttribute(String name){this.ind_att = name;};
}
