package character;

public class Character {

  //Atributos:
  private static int n_characters;
  private String name;
  private Jobs job; //Define a classe do personagem por meio de um enumerador

  //atributos independentes
  private int intel;
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
  private int tenacity;
  private int cri;
  private int hit;
  private int eva;

  //Construtor:
  public Character(String name) {
    this.job = Jobs.NOVICE; //Declara  job
    this.name = name;
    this.stats = new Stats(job); //Passa o job para a instancia da classe stats
    System.out.println("Personagem criado com sucesso!");
  }


  //Métodos auxiliares:
  public boolean isDead() {
    System.out.println(this.stats.get_status_value(TypeStats.HP));
    if (this.stats.get_status_value(TypeStats.HP) > 0) return false;
    return true;
  }

  //Setters:
  void set_name(String name){
    this.name = name;
  }

  /*void set_stats(Stats stats){
    this.stats = stats;
  }*/

  //Getters:
  public String get_status() {
    //Retorna algum tipo de dado com os status do personagem:
    String stats = "not defined yet";
    return stats; //precisamos definir como funionará este retorno
  }

  public String get_name(){
    return this.name;
  }

  public Jobs get_job(){
    return this.job;
  }
}
