package character;

import items.*;
import util.Attributes;

public class Character {

  private String name;
  //atributos dependentes:
  private int atk;   private int def;
  private int maxHp; private int maxSp; private int atkSpd;
  private int ten;  private int cri;   private int hit;   private int eva;
  private util.Attributes attributes;
  private items.Equipment capacete;
  private items.Equipment weapon;
  private items.Equipment helmet;

  //TODO: Add Job, and the formulas of stats
  //TODO: Hp and SP should be on Battle class or in Character class?


  public Character(String name) {
    this.name = name;
    this.attributes = new Attributes(1, 1, 1, 1,
            1, 1, 1);
    this.capacete = new Equipment("Empty", 1, 0, 0, 0,
            0, 0, 0);
    this.weapon = new Equipment("Empty", 1, 0, 0, 0,
            0, 0, 0);
    this.helmet = new Equipment("Empty", 1, 0, 0, 0,
            0, 0, 0);
  }

  public Character(String name, Attributes attributes, Equipment helmet,
                   Equipment weapon, Equipment armor) {
    this.name = name;
    this.attributes = attributes;
    this.capacete = helmet;
    this.weapon = weapon;
    this.helmet = armor;
  }

  @Override
  public String toString() {
    return "Character{" +
            "name='" + name + '\n' +
            "Stats={" +
            "atk=" + atk +
            ", def=" + def +
            ", maxHp=" + maxHp +
            ", maxSp=" + maxSp +
            ", atkSpd=" + atkSpd +
            ", ten=" + ten +
            ", cri=" + cri +
            ", hit=" + hit +
            ", eva=" + eva +
            "}\n" +
            "Attributes=" + attributes +
            "\nEquipamentos={"+
            "\n\tcapacete=" + capacete +
            "\n\tweapon=" + weapon +
            "\n\thelmet=" + helmet +
            "}}";
  }

  public void setCapacete(Equipment capacete) {
    this.capacete = capacete;
  }

  public void setWeapon(Equipment weapon) {
    this.weapon = weapon;
  }

  public void setHelmet(Equipment helmet) {
    this.helmet = helmet;
  }

  public String getName() {
    return name;
  }

  public int getAtk() {
    return atk;
  }


  public int getDef() {
    return def;
  }


  public int getMaxHp() {
    return maxHp;
  }

  public int getMaxSp() {
    return maxSp;
  }

  public int getAtkSpd() {
    return atkSpd;
  }

  public int getTen() {
    return ten;
  }

  public int getCri() {
    return cri;
  }

  public int getHit() {
    return hit;
  }

  public int getEva() {
    return eva;
  }

  public Attributes getAttributes() {
    return attributes;
  }

  public Equipment getCapacete() {
    return capacete;
  }

  public Equipment getWeapon() {
    return weapon;
  }

  public Equipment getHelmet() {
    return helmet;
  }
}
