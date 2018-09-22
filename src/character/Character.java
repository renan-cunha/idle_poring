package character;

public class Character {

  //Atributos:
  private static int n_characters;
  private String name;
  public Stats stats; //instância da classe Stats que possui todos os status do personagem
  private Jobs job; //Define a classe do personagem por meio de um enumerador

  //Construtor:
  public Character(String name) {
    this.job = Jobs.SWORDSMAN; //Declara  job
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
