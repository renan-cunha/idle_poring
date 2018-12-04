package inventory;
import item.Item;
import java.util.ArrayList;

public class Inventory {
    //A mochila onde os itens são aramzenados:
    ArrayList<Item> inventory = new ArrayList();

    int i;

    //Adiciona itens:
    public void addItem(Item item){ this.inventory.add(item); }

    //Adiciona multiplos itens:
    public void addItens(Item[] initial_itens){
        for(Item item : initial_itens) {
            addItem(item);
        }
    }

    //remove item baseado na posição:
    public void removeItem(int p){
        try {
            // Remover o item na posição 'p':
            this.inventory.remove(p);
        } catch (IndexOutOfBoundsException e){
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }
    }

    //retorna infomações sobre um item no console:
    public Item checkItem(int p){
        return this.inventory.get(p);
    }

    //Lista no console todos os itens da mochila:
    public void listItens(){
        i = 0;
        for (Item item : this.inventory){
            System.out.printf("\n Item %d - ",i);
            System.out.println(item.toString());
            i++;
        }
    }


    //Retira um item da mochila pelo field 'nome':
    //se n achar nada retorna vazio
    public Item retrieveItemByName(String name){
        i=0;
        for(Item item : this.inventory) {
            if(item.getName().equalsIgnoreCase(name)) {
                Item resultado = item;
                removeItem(i);
                return item;
            }
            i++;
        }
        return null;
    }

    //retorna item da mochila pelo nome:
    public Item getItemByName(String name){
        for(Item item : this.inventory){
            if(item.getName().equalsIgnoreCase(name)) return item;
            }
        return null;
        }


}




