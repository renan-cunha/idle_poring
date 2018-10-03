import character.Character;
import character.Novice;
import battle.Battle;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano",2, new Novice());

        Character ciclano = new Character("Ciclano",2, new Novice());

        //Exemplos de chamadas para checar valores de atributos do personagem:
        System.out.println("O level desse cara é: "+fulano.getLvl());
        System.out.println(fulano.getAtkSpd()); //Exemplo de chamada indivudual de get de atributo
        System.out.println(fulano.toString()); //Retorna um agrupado de informações sobre o personagem

        //Instanciando uma batalha:
        Battle exemploDeBatalha = new Battle(fulano,ciclano);

        //iniciando a batalha:
        exemploDeBatalha.battle();

    }


}
