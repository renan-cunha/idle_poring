
import character.Character;
import character.hero.Swordsman;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.monsters.Monster;
import character.monsters.MonsterJobType;
import character.monsters.SimpleFactoryMonster;
import item.*;
import store.Store;

public class Main {
    public static void main(String[] args) {
        //utilizando simpleFactoryMonster
        Monster monster = SimpleFactoryMonster.createMonster(MonsterJobType.ORC);
        System.out.println(monster);
        //Fim utilizadação simpleFactoryMonster

        //Criando um personagem (exemplo):
        Hero fulano = new Hero("Fulano");
        Hero ciclano = new Hero("Ciclano");

        Equipment capacete = new Equipment("Capacete de ferro",
                HeroJobType.NOVICE, EquipmentType.HELMET,1,2,1,
                1,1,1,1 );

        //Guarda itens na mochila:
        fulano.bag.addItem(new Food("lasanha"));
        fulano.bag.addItem(capacete);
        //Lista os itens da mochila:
        fulano.bag.listItens();
        //Guarda moedas na pochete de moedas
        fulano.pouch.addCoins(5);
        System.out.println("Têm "+fulano.pouch.getBalance()+" moedas");

        //Retorna um item da mochila:
        Equipment capacetinho = (Equipment) fulano.bag.retrieveItemByName("capacete de ferro");
        //Se retirou o único item q tinha agora a mochila tá vazia:
        fulano.bag.listItens();

        fulano.setJob(new Swordsman());

         //Simula uma batalha:
        //Battle.fight(fulano, ciclano);

        Store lojinha = new Store(new Item[] {new Equipment("Capacete 1",HeroJobType.NOVICE, EquipmentType.HELMET,1,2,1,
                1,1,1,1 ), new Potion("Poção mágica 01")});

        lojinha.listItens();
        fulano.pouch.addCoins(50);
        System.out.println("Fulano tem "+ fulano.pouch.getBalance() +" moedas");
        //vende item da mochila:
        lojinha.sellItem(fulano, fulano.bag.getItemByName("lasanha") );
        System.out.println("Depois de vender o item fulano tem "+ fulano.pouch.getBalance() +" moedas");

    }
}
