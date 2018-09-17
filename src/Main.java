import character.Character
public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano");

        if(!fulano.is_dead()){
            System.out.println("Tá morto");
        }

    }


}
