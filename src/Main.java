
import battle.Battle;
import character.hero.Novice;
import character.hero.Swordsman;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.monster.Monster;
import character.monster.MonsterJobType;
import character.monster.SimpleFactoryMonster;
import item.*;
import store.Store;
import stage.Stage;
import util.Attributes;
import pets.Pet;


public class Main {
    public static void main(String[] args) {
        //aumento de xp
        Hero hero = new Hero("Joaozinho");
        Equipment pet = new Equipment("Biscoito",HeroJobType.NOVICE,
                EquipmentType.ARMOR, 1, 1, 1, 1,
                1, 1, 1);
        pet.setXp(110);
        System.out.println(pet.getAttributes());
        System.exit(0);


        //soma atributos
        Attributes attributes = new Attributes(1,1,1,1,
                1,1,1);
        Attributes attributes1 = new Attributes(10,10,10,10,
                10,10,10);
        System.out.println(attributes.add(new Attributes[]{attributes1}));
        System.exit(0);

        //criar monstros com money
        Monster monster = SimpleFactoryMonster.createMonster(MonsterJobType.ORC,
                10);
        System.out.println(monster.getPouch().getBalance());
        //desafiar boss
        hero = new Hero("Joaozinho");
        Stage stage1 = new Stage(1,10);
        stage1.startBattle(hero);



        // há um novo field em hero, attributes_points, e metodos para
        // incrementar os atributos de acordo com esse field
        hero = new Hero("Joaozinho");
        System.out.println(hero.getAttributPoints());
        System.out.println(hero.getAttributes());
        hero.setXp(100);
        hero.increaseAgi();
        System.out.println(hero.getAttributPoints());
        System.out.println(hero.getAttributes());

        //
        Hero heroi = new Hero("Joaozinho");

        monster = SimpleFactoryMonster.createMonster(MonsterJobType.ORC,1);
        Equipment equipment = new Equipment("armadura de fogo",
                HeroJobType.NOVICE, EquipmentType.ARMOR, 1, 1, 1,
                1, 1, 1, 1);
        monster.setEquipment(equipment);
        System.out.println(monster);
        Battle.fight(heroi, monster);
        heroi.getBag().listItens();

        //simple factory gera personagens com equipamentos aleatorios
        monster = SimpleFactoryMonster.createMonster(MonsterJobType.ORC,
                5);
        System.out.println(monster);
        System.exit(0);


        //Utilizando Mapas
        stage1 = new Stage(1,3);
        System.out.println(stage1);
        //size é o numero de inimigos e lvl é lvl dos inimigos do mapa, o boss
        // tem lvl = lvl do mapa + 1. Os tipos e atributos do inimigo são
        // escolhidos aleatoriamente, os atributos dependem do nivel do mapa


        //utilizando attributos aleatorios a partir do stage e weight
        attributes = Attributes.randomAttributes(2,2);
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
        fulano.getPouch().addCoins(5);
        System.out.println("Têm "+fulano.getPouch().getBalance()+" moedas");

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
        fulano.getPouch().addCoins(50);
        System.out.println("Fulano tem "+ fulano.getPouch().getBalance() +" moedas");
        //vende item da mochila:
        lojinha.sellItem(fulano, fulano.bag.getItemByName("lasanha") );
        System.out.println("Depois de vender o item fulano tem "+ fulano.getPouch().getBalance() +" moedas");



        //Adiciona uma gem a um equipamento:
        capacete.setGem(new Gem(Attributes.randomAttributes(1,3)));
        //habilita a gem no capacete:
    }
}
