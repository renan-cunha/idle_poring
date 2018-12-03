
import character.Character;
import character.hero.Swordsman;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.monsters.Monster;
import character.monsters.MonsterJobType;
import character.monsters.SimpleFactoryMonster;
import item.*;
import store.Store;
import inventory.*;
import stage.Stage;
import util.Attributes;


public class Main {
    public static void main(String[] args) {
        //simple factory gera personagens com equipamentos aleatorios
        Monster monster = SimpleFactoryMonster.createMonster(MonsterJobType.ORC,
                5);
        System.out.println(monster);
        System.exit(0);


        //Utilizando Mapas
        Stage stage1 = new Stage(1,3);
        System.out.println(stage1);
        //size é o numero de inimigos e lvl é lvl dos inimigos do mapa, o boss
        // tem lvl = lvl do mapa + 1. Os tipos e atributos do inimigo são
        // escolhidos aleatoriamente, os atributos dependem do nivel do mapa


        //utilizando attributos aleatorios a partir do stage e weight
        Attributes attributes = new Attributes(2,2);
        System.out.println(attributes);
        //Fim utilizaação atributos aleatorios, o valor maximmo de um atributo
        // é o weight vezes o stage, achei necessario um weight para dar atributos
        // maiores para o personagem e menores para equipamentos e pets
        // o valor minimo é 1 para cada atributo




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
