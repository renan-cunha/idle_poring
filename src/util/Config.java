package util;

public enum Config {
  XP_TO_LVL_UP(100), AUTO_INCREMENT_ATT_LVL_UP(1)
  ;

  public int value;

  Config(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}