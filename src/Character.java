//fazer construtor e as funções abaixo

public class Character {
  private String name;
  private Stats stats;

  public Character(String name, int hp, int dano) {
  }

  public boolean is_dead() {
    //retorna verdadeiro se personagem tiver morto
    return false;
  }

  public void attack(Character character) {
    //hp do inimigo(paramento character) é diminuido pelo dano do atacante
  }

  public String impressao() {
    //Retorna umqa string com as informações do personagem
    return null;
  }
}
