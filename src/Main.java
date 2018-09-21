import character.Character;
import character.TypeAttribute;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano");

        if(!fulano.is_dead()){
            System.out.println("Tá morto");
        }

        System.out.println("O job de "+fulano.get_name()+" é: "+ fulano.get_job());
        fulano.stats.update(TypeAttribute.STR, 5);
        System.out.println(fulano.stats.show_stats());

    }


}
