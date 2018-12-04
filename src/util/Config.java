package util;

public enum Config {
  XP_TO_LVL_UP(100), AUTO_INCREMENT_ATT_LVL_UP(1),
  WEIGHT_RAND_ATT_EQUIP(1), NUMBER_ATT_POINTS_LVL_UP(6),
  NUMBER_ATT_POINTS_START(0), NUMBER_PETS(6),
  WEIGHT_RAND_ATT_MONSTER(10), WEIGHT_RAND_COINS_MONSTER(10),
  WEIGHT_DEFENSE(1), WEIGHT_CRITICAL_DAMAGE(2),
  WEIGHT_EVADED(3), BASE_CRITICAL_CHANCE(10),
  WEIGHT_CRITICAL_CHANCE(1);



  public int value;

  Config(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
