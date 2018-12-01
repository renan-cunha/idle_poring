
import character.Character;
import character.Swordsman;
import item.*   ;
import bag.Bag;

public class Main {
    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano");
        Character ciclano = new Character("Ciclano");
        Helmet capacete = new Helmet("Capacete de ferro",2,1,2,1,1,1,1);
        //Cria uma mochila:
        Bag bag = new Bag();
        //Guarda itens nela:
        bag.addItem(new Food("lasanha"));
        bag.addItem(capacete);
        //Lista os itens da mochila:
        bag.listBagItens();

        //Retorna um item da mochila:
        Equipment capacetinho = (Equipment) bag.findItemByName("capacete de ferro");
        //Se retirou o único item q tinha agora a mochila tá vazia:
        bag.listBagItens();

        fulano.setJob(new Swordsman());
        //Battle.fight(fulano, ciclano);

    }
}
