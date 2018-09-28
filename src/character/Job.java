package character;

public abstract class Job {
    private String name;

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

    public abstract int setAtkSpd(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setEva(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setCri(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setHit(int dex, int sta, int str,
                               int intel, int agi, int luk);

    public abstract int setTen(int dex, int sta, int str,
                               int intel, int agi, int luk);

}
