import character.*;
import character.Character;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano", 1, new Swordsman());
        System.out.println(fulano.showAttributes());
        System.out.println(fulano.showStats());
        System.out.println(fulano.job.getJobType());
        fulano.updateAtt(TypeAttribute.DEX, 5);
        System.out.println(fulano.showAttributes());
        System.out.println(fulano.showStats());

    }


}
