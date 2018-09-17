public class Main {

    public static void main(String[] args) {
        //Criando um personagem (exemplo):
        Character fulano = new Character("Fulano","Archer");
        System.out.println(fulano.get_status());
        if(!fulano.is_dead()){
            System.out.println(fulano.get_status());
        }

    }


}
