
import character.Character;
import character.hero.Swordsman;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.hero.Swordsman;
import character.monsters.Orc;
import item.*;
import bag.Bag;

public class Main {
    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Hero("Fulano");
        Character ciclano = new Hero("Ciclano");
        Equipment capacete = new Equipment("Capacete de ferro",
                HeroJobType.NOVICE, EquipmentType.HELMET,1,2,1,
                1,1,1,1 );

        //Guarda itens na mochila:
        fulano.bag.addItem(new Food("lasanha"));
        fulano.bag.addItem(capacete);
        //Lista os itens da mochila:
        fulano.bag.listBagItens();
        //Guarda moedas na pochete de moedas
        fulano.pouch.addCoins(5);
        System.out.println("Têm "+fulano.pouch.getBalance()+" moedas");

        //Retorna um item da mochila:
        Equipment capacetinho = (Equipment) fulano.bag.retrieveItemByName("capacete de ferro");
        //Se retirou o único item q tinha agora a mochila tá vazia:
        fulano.bag.listBagItens();

        fulano.setJob(new Swordsman());
        //Battle.fight(fulano, ciclano);

    }
}
