//fazer codigo do construtor e criar getters e setters

public class Stats {
  //Status base:
  private String clss; //Classe
  private int lvl = 0; // Nível
  protected int hp = 0; //Pontos de vida
  private int sp = 0; //Pontos de skills
  private int atk = 0; // Pontos de ataque
  private int def = 0; // Pontos de defesa
  private int m_atk = 0; // Pontos de ataque mágico
  private int m_def = 0; //pontos de defesa mágica
  private int acc = 0; // chance de acerto (accuracy)
  private int crit = 0; //chance de acerto crítico
  private int tena = 0; //Pontos de tencidade
  private int eva = 0; // Chance de esquivar (evasion)
  private int atk_spd = 0; //Velocidade de ataque

  //Atributos base:
  private int str = 0; // Força
  private int agi = 0; // Agilidade
  private int sta = 0; //Vitalidade (Stamina)
  private int intt = 0; // Iteligência
  private int dex = 0; //Detreza
  private int luk = 0; //Sorte

  // Construtor
  public Stats(String clss){
    this.clss = clss;
  }


  //Exemplo de função que adiciona pontos aos stats:
  //Se o personagem recebe um ponto de atributo tipo 'Força' os seguintes pontos serão adicionados aos stats:
  void add_str(){
    if(this.clss.equals("Archer")){
      this.atk += 4;
      this.hp += 2;
      this.sp += 2;
    }

    else if(this.clss.equals("Swordsman")){
      this.hp += 8;
      this.sp += 8;
      this.def += 2;
      this.m_def += 2;
    }

    else if(this.clss.equals("Magician")){
      this.hp += 8;
      this.def += 2;
      this.m_def += 2;
    }

  }


}
