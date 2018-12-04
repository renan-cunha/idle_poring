package util;

public enum Config {
  XP_TO_LVL_UP(100), AUTO_INCREMENT_ATT_LVL_UP(1),
  WEIGHT_RAND_ATT_EQUIP(1), NUMBER_ATT_POINTS_LVL_UP(6),
  NUMBER_ATT_POINTS_START(0), NUMBER_PETS(6)
  ;

  public int value;

  Config(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
