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
            if (turn%2==0)
                hitOpponent(heroi, inimigo);
            else
                hitOpponent(inimigo, heroi);
        }
    }

    private void hitOpponent(Character attacker, Character defender){
        //TODO: Que tipos de exeções esse método pode levantar?

        int attack = attacker.getAtk();
        int defense = defender.getDef();
        System.out.printf("%n%s deu %d de dano em %s neste turno!",
                attacker.getName(),
                damage(attacker,defender),
                defender.getName());
        //subtrai do hp de outro:
        int newHp = defender.getHP() - damage(attacker,defender);

        if (newHp < 0){
            newHp=0;
        }
        defender.setHP(newHp);
    }


    private int damage(Character attacker, Character defender){
        int attack = attacker.getAtk();
        int defense = defender.getDef();

        int damage =  attack - (int) (0.10 * defense);
        //aplica o dano crítico:
        if (critical(attacker)) damage *= 2;
        //aplica a evasiva:
        if (!evaded(attacker,defender)) return 0;

        if(damage > 0){
            return damage;
        }
        else return 1;
    }

    private boolean evaded(Character attacker, Character defender){
        return Math.random() < 1.0*attacker.getHit()/(attacker.getHit()+defender.getEva());
    }

    static public boolean critical(Character attacker){
        // A chance de critico é 20% + 1.5* pontos_de_critico:
        float chance = (float)(20+1.5*attacker.getCri())/100;
        if(Math.random() < chance) return true;
        return false;
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
