package character;

import Items.Equip;
import Items.TypeEquip;

public class Body {
  private TypeEquip typeEquip;
  private Equip equip;

  public Body(TypeEquip typeEquip){
    this.typeEquip = typeEquip;
  }

  public Body(TypeEquip typeEquip, Equip equip){
    if (TestTypeEquip(typeEquip, equip.getTypeEquip())) {
      this.typeEquip = typeEquip;
      this.equip = equip;
    }
  }

  public TypeEquip getTypeEquip(){
    return typeEquip;
  }

  public Equip getEquip(){
    return equip;
  }

  public void setEquip(Equip equip){
    if (TestTypeEquip(this.typeEquip, equip.getTypeEquip()))
      this.equip = equip;
  }

  private Boolean TestTypeEquip(TypeEquip a, TypeEquip b){
    if (a==b)
      return true;
    else {
      System.out.println("The Equipment does not suit this position");
      return false;
    }
  }
}
