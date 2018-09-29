import character.Character;
import character.Novice;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano",2,new Novice());
        System.out.println(fulano.getAtkSpd());

    }


}
