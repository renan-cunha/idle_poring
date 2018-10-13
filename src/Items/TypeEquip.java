package Items;

public enum TypeEquip {
Head("Head"), LeftHand("LeftHand"), RightHand("RightHand"),
  FootGear("FootGear"), Acessory("Acessory"), Armor("Armor"),
  Manteau("Manteau");

  public String name;

  TypeEquip(String acessory) {
    name = acessory;
  }
}
