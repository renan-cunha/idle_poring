package store;
import inventory.Inventory;
import character.hero.Hero;
import item.*;

public class Store {
    private String name = "Loja Idle Poring";
    private Inventory shelf = new Inventory();

    //Pode ser criado com alguns itens:
    public Store(Item[] initial_itens){
        this.shelf.addItens(initial_itens);
    }

    //Ou sem nenhum
    public Store(){

    }

    //LIsta os itens disponíveis para compra na loja:
    public void listItens(){
        System.out.println("Estes são os itens disponíveis para venda:\n");
        this.shelf.listItens();
    }

    //COmpra itens do herói:
    public void sellItem(Hero seller, Item item){
        //Retira o item da mochila do Herói:
        Item soldItem = seller.bag.retrieveItemByName(item.getName());
        //Adiciona o item ao shelf da loja:
        this.shelf.addItem(soldItem);
        //Adiona as moedas correspondentes ao valor do item vendido ao Hero:
        seller.pouch.addCoins(item.getValue());

    }
    //Vende itens para o herói:
    public void buyItem(){

    }
}
