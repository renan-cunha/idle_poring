
import battle.Battle;
import character.Character;
import character.Novice;
import character.Swordsman;
import items.Helmet;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano",2, new Novice());

        Character ciclano = new Character("Ciclano",2, new Novice());

        Helmet capacete = new Helmet("HelmetXX",new Novice(),1,2,1,2,1,1,1 );
        System.out.println(fulano.getMaxHp());
        fulano.setHelmet(capacete);
        System.out.println(fulano.getAtkSpd());

        Battle battle = new Battle(fulano,ciclano);
        battle.startBattle();

    }
}
