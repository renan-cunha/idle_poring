import character.Character;
import character.TypeAttribute;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano");

        //Cria um personagem e atribui a ele umm job:
        System.out.println("O job de "+fulano.get_name()+" é: "+ fulano.get_job());

        //Adiciona 5 pontos no atributo força:
        fulano.stats.update(TypeAttribute.STR, 5);
        System.out.println("Fulano recebeu 5 pontos de força");

        //Exibe os status, genial!
        System.out.println(fulano.stats.show_stats());

        //testa a função isDead():
        if (fulano.isDead()) System.out.println("O cara tá vivo, bicho!");

    }


}
