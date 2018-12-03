
import character.Character;
import character.hero.Swordsman;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.hero.Swordsman;
import character.monsters.Monster;
import character.monsters.MonsterJobType;
import character.monsters.Orc;
import character.monsters.SimpleFactoryMonster;
import item.*;
import bag.Bag;
import util.Attributes;

public class Main {
    public static void main(String[] args) {
        //utilizando attributos aleatorios a partir do level e weight
        Attributes attributes = new Attributes(2,2);
        System.out.println(attributes);
        System.exit(0);
        //Fim utilizaação atributos aleatorios, o valor maximmo de um atributo
        // é o weight vezes o level, achei necessario um weight para dar atributos
        // maiores para o personagem e menores para equipamentos e pets
        // o valor minimo é 1 para cada atributo


        //utilizando simpleFactoryMonster
        Monster monster = SimpleFactoryMonster.createMonster(MonsterJobType.ORC);
        System.out.println(monster);
        //Fim utilizadação simpleFactoryMonster

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
