package character;

public abstract class Job {
    public String name;

    public abstract int setAtk(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setMAtk(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setDef(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setMDef(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setMaxHp(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setMaxSp(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public int setAtkSpd(int dex, int sta, int str, int intel, int agi, int luk) {
      return 2*agi;
    }

    public int setEva(int dex, int sta, int str, int intel, int agi, int luk) {
      return 2*agi;
    }

    public int setCri(int dex, int sta, int str, int intel, int agi, int luk) {
      return 2*luk;
    }

    public int setHit(int dex, int sta, int str, int intel, int agi, int luk) {
      return 2*luk;
    }

    public int setTen(int dex, int sta, int str, int intel, int agi, int luk) {
      return 2*luk;
    }

}
