import Items.Equip;
import Items.TypeEquip;
import character.Character;
import character.Novice;
import battle.Battle;

public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano",2, new Novice());

        Character ciclano = new Character("Ciclano",2, new Novice());

        Equip capacete = new Equip("HellmetX", TypeEquip.Head, new Novice(),1,1, 1, 1, 1, 1);
        fulano.getHead().setEquip(capacete);
        System.out.println(fulano.getHead().getEquip().getName());
    }


}
