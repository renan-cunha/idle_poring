package character;

public class Character {

  //Atributos:
  private static int n_characters;
  private String name;
  private Jobs job; //Define a classe do personagem por meio de um enumerador

  //level
  private int lvl;

  //atributos independentes
  private int intelligence;
  private int strenght;
  private int stamina;
  private int agility;
  private int dexterity;
  private int luck;

  //atributos dependentes
  private int atk;
  private int mAtk;
  private int def;
  private int mDef;
  private int maxHp;
  private int maxSp;
  private int atkSpd;
  private int ten;
  private int cri;
  private int hit;
  private int eva;

  //Construtor:

  public Character(String name, int lvl) {
    this.name = name;
    this.lvl = lvl;
    System.out.println("Personagem criado com sucesso!");
  }

  public Character(String name) {
    new Character(name,1);
  }

  //Métodos auxiliares:

  public static int getN_characters() {
    return n_characters;
  }

  public String getName() {
    return name;
  }

  public Jobs getJob() {
    return job;
  }

  public int getLvl() {
    return lvl;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getStrenght() {
    return strenght;
  }

  public int getStamina() {
    return stamina;
  }

  public int getAgility() {
    return agility;
  }

  public int getDexterity() {
    return dexterity;
  }

  public int getLuck() {
    return luck;
  }

  public int getAtk() {
    return atk;
  }

  public int getmAtk() {
    return mAtk;
  }

  public int getDef() {
    return def;
  }

  public int getmDef() {
    return mDef;
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

  public void setJob(Jobs job) {
    this.job = job;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setStrenght(int strenght) {
    this.strenght = strenght;
  }

  public void setStamina(int stamina) {
    this.stamina = stamina;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }

  public void setLuck(int luck) {
    this.luck = luck;
  }
}
