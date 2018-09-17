//fazer construtor e as funções abaixo:

public class Character {

  private String name;
  private Stats stats;

  public Character(String name, String clss) {
    this.name = name;
    this.stats = new Stats(clss);
    System.out.println("Personagem criado com sucesso!");
  }


  public boolean is_dead() {
    if (this.stats.hp < 1) return true;
    return false;
  }


  public String get_status() {
    //Retorna uma string com as informações do personagem:

  }
}
