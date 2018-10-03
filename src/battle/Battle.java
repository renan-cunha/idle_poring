package battle;
import character.Character;
//TODO: definir níveis de acesso aos métodos e atributos desta classe
//TODO: Pensar sobre como tornar este um razoável sistema de batalhas
public class Battle {
    Character fighter_1, fighter_2;
    int turn;
    //construtor:
    public Battle(Character fighter_1, Character fighter_2){
        //Inicia a batalha:
        this.fighter_1 = fighter_1;
        this.fighter_2 = fighter_2;
        this.turn = 1;
        System.out.printf("Uma batalha entre %s e %s foi inciada %n", fighter_1.getName(), fighter_2.getName());

    }
    //executa a batalha:
    public void battle(){
        //Somente para prósitos de teste do sistema de batalhas:
        fighter_1.setHP(10); fighter_2.setHP(8);
        battleStatus();
        //TODO: Como definir quem começa a batalha? aleatorizar quem começa?
        System.out.printf("%n%s começará atacando!",fighter_1.getName());
        hitOpponent(fighter_1,fighter_2);
        battleStatus();
        //TODO: é preciso dar continuidade a batalha e finalizá-la, quando necessário
    }

    public static void hitOpponent(Character attacker, Character defender){
        //TODO: Que tipos de exeções esse método pode levantar?
        System.out.printf("%n%s atacou %s neste turno!",attacker.getName(),defender.getName());
        //pega o ataque de um:
        int attack = attacker.getAtk();
        //subtrai do hp de outro:
        defender.setHP(defender.getHP()-attack);

    }

    public void battleStatus(){
        System.out.printf("%n%s tem %d HPs e %s tem %d HPs",
                          fighter_1.getName(),fighter_1.getHP(),fighter_2.getName(),fighter_2.getHP());
    }

}
