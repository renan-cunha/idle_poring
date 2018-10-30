package bag;
import items.Equipment;
import java.util.ArrayList;


public class Bag {
    //A mochila onde os itens são aramzenados:
    ArrayList<Equipment> bag = new ArrayList();

    //Adiciona itens:
    public void addItem(Equipment item){
        this.bag.add(item);
        System.out.println("O item foi adicionado com sucesso na mochila");
    }

    //remove itens:
    public void removeItem(int p){
        try {
            // Remover o item na posição 'p':
            bag.remove(p);
        } catch (IndexOutOfBoundsException e){
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }
    }

    //retorna infomações sobre um item no console:
    public Equipment checkItem(int p){
        return this.bag.get(p);
    }

    //Lista no console todos os itens da mochila
    public void listBagItens(){
        int i = 0;
        System.out.println("\nA mochila está assim:");

        for (Equipment item : bag){
            System.out.printf("\n Item %d",i);
            System.out.println(item.toString());
            i++;
        }
    }



}




