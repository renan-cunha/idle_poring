package character;

public enum TypeAttribute {
    LVL("Level"), STA("Stamina"), AGI("Agility"), LUK("Lucky"),
    INT("Intelligence"), DEX("Dexterity"), STR("Strength");

    private String ind_att;

    TypeAttribute(String name){this.ind_att = name;};
}
