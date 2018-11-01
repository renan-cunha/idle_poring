
import battle.Battle;
import character.Character;
import character.Novice;
import character.Swordsman;
import items.Helmet;
import bag.Bag;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano");
        Character ciclano = new Character("Ciclano");

        Helmet capacete = new Helmet("HelmetXX",2,1,2,1,1,1,1);
        fulano.setJob(new Swordsman());
        Battle battle = new Battle(fulano, ciclano);

        battle.startBattle();

    }
}
