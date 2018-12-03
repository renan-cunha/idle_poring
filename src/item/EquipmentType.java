package item;

import java.util.LinkedList;
import java.util.Random;

public enum EquipmentType {
  ACESSORY, ARMOR, FOOT_GEAR, HELMET, MANTEAU, WEAPON;

  public static EquipmentType randomEquipmentType(){
    Random random = new Random();
    EquipmentType[] equipmentTypes = EquipmentType.values();
    int index = random.nextInt(equipmentTypes.length);
    return equipmentTypes[index];
  }
}


