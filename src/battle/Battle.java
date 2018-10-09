package battle;
import character.Character;
//TODO: definir níveis de acesso aos métodos e atributos desta classe
//TODO: Pensar sobre como tornar este um razoável sistema de batalhas
//TODO: Aumentar a complexidade da batalha, levar em conta outros atributos como sorte, agilidade etc
public class Battle {
    Character heroi, inimigo;
    private int turn;
    //construtor:
    public Battle(Character heroi, Character inimigo){
        //Inicia a batalha:
        this.heroi = heroi;
        this.inimigo = inimigo;
        this.turn = 1;
        System.out.printf("Uma batalha entre %s e %s foi inciada %n", heroi.getName(), inimigo.getName());
    }

    //executa a batalha:
    public void start(){
        heroi.setHP(heroi.getMaxHp());
        inimigo.setHP(inimigo.getMaxHp());
        //TODO: Set sp igual a spMax
        while (!isDead(heroi) && !isDead(inimigo)) {
            battleStatus();
            //TODO: Como definir quem começa a batalha? aleatorizar quem começa?
            //System.out.printf("%n%s começará atacando!",fighter_1.getName());
            if (turn%2==0)
                hitOpponent(heroi, inimigo);
            else
                hitOpponent(inimigo, heroi);
        }
    }

    private void hitOpponent(Character attacker, Character defender){
        //TODO: Que tipos de exeções esse método pode levantar?
        int attack = attacker.getAtk();
        System.out.printf("%n%s deu %d de dano em %s neste turno!",
                attacker.getName(),
                attack,
                defender.getName());
        //pega o ataque de um
        //subtrai do hp de outro:
        int newHp = defender.getHP()-attack;
        if (newHp < 0){
            newHp=0;
        }
        defender.setHP(newHp);
    }


    //TODO: Isso provavelmente vai passar para a GUI, junto com os outros prints
    private void battleStatus(){
        System.out.printf("\n\nTurno %d: %n%s tem %d HPs e %s tem %d HPs",
                            this.turn,heroi.getName(),heroi.getHP(),
                            inimigo.getName(), inimigo.getHP());
        this.turn+=1;
    }

    private boolean isDead(Character defender){
        if (defender.getHP() == 0){
            System.out.println("\n"+defender.getName() +" morreu");
            return true;
        } else {
            return false;
        }
    }

    public int getTurn() {
        return turn;
    }
}
