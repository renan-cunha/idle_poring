package bag;
import item.Item;
import java.util.ArrayList;


public class Bag {
    //A mochila onde os itens são aramzenados:
    ArrayList<Item> bag = new ArrayList();
    int i;

    //Adiciona itens:
    public void addItem(Item item){
        this.bag.add(item);
        System.out.printf("%s foi adicionado[a] na mochila",item.getName());
    }

    //remove item baseado na posição:
    public void removeItem(int p){
        try {
            // Remover o item na posição 'p':
            this.bag.remove(p);
        } catch (IndexOutOfBoundsException e){
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }
    }

    //retorna infomações sobre um item no console:
    public Item checkItem(int p){
        return this.bag.get(p);
    }

    //Lista no console todos os itens da mochila:
    public void listBagItens(){
        i = 0;
        System.out.println("\nA mochila está assim:");

        for (Item item : this.bag){
            System.out.printf("\n Item %d - ",i);
            System.out.println(item.toString());
            i++;
        }
    }


    //Pesquisa um item na mochila pelo field 'nome' e retorna ele se encontrado:
    public Item findItemByName(String name){
        i=0;
        for(Item item : this.bag) {
            if(item.getName().equalsIgnoreCase(name)) {
                Item resultado = item;
                removeItem(i);
                return item;
            }
            i++;
        }
        return null;
    }


}




