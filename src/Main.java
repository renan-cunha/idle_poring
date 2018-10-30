
import battle.Battle;
import character.Character;
import character.Novice;
import character.Swordsman;
import items.Helmet;
import bag.Bag;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano",2, new Novice());
        Character ciclano = new Character("Ciclano",2, new Novice());

        //Equipando personangens:
        Helmet capacete = new Helmet("HelmetXX",new Novice(),1,2,1,2,1,1,1 );
        fulano.getBag().addItem(capacete);
        System.out.println(fulano.getMaxHp());
        fulano.setHelmet(capacete);
        System.out.println(fulano.getMaxHp());

        //Executando uma batalha entre os dois personagens criados e equipados:
        Battle battle = new Battle(fulano,ciclano);
        battle.startBattle();

    }
}
