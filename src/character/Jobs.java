package character;

public enum Jobs {
    //Default new Character Job:
    NOVICE("Novice"),
    // 1st improvements:
    ARCHER("Archer"), SWORDSMAN("Swordsman"), MAGICIAN("Magician"),
    // 2nd improvements:
    HUNTER("Hunter"), KNIGHT("Knight"), WIZARD("Wizard");

    private String job;

    Jobs(String job){
        this.job = job;
    }


    public String get_Job(){
        return job;
    }
}
