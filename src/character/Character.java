package character;

public class Character {

  //Atributos:
  private static int n_characters;
  private String name;
  public Stats stats; //instância da classe Stats que possui todos os status do personagem
  private Jobs job; //Define a classe do personagem por meio de um enumerador

  //Construtor:
  public Character(String name) {
    this.job = Jobs.NOVICE;
    this.name = name;
    this.stats = new Stats(Jobs.SWORDSMAN); //classe swordsman apenas para teste
    System.out.println("Personagem criado com sucesso!");
  }


  //Métodos auxiliares:
  public boolean is_dead() {
    //if (this.stats. < 1) return true;
    return false;
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
