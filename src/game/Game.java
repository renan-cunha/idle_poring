package game;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.monster.MonsterJobType;
import item.*;
import stage.Stage;
import store.Store;
import java.io.*;
import java.util.Scanner;

public class Game {
    static String filename = "/home/marcelo/idle_poring/src/util/myHero.ser";

    public static void runGame(){
        Scanner reader = new Scanner(System.in);
        intro(reader);
        //Hero hero = loadHero();
        p("\nQual o nome do herói que você quer criar?\n");
        String name = reader.next();
        Hero hero = new Hero(name);
        mainMenu(hero, reader);
        //saveHero(hero);
        reader.close();
        return;
    }

    private static void setEquipMenu(Hero hero, Scanner reader){
        System.out.println("\nInsira o nome do item para equipar");
        String name = scan(reader);
        hero.setEquipment((Equipment) hero.bag.getItemByName(name));
    }


    private static void equipmentsMenu(Hero hero, Scanner reader){
        while(true) {
            System.out.println("\nEscolha uma opção");
            System.out.println("\n(0) Sair");
            System.out.println("\n(1) Ver mocihla");
            System.out.println("\n(2) Equipar um item");
            String n = scan(reader);
            if (n.equals("1"))
                hero.getBag().listItens();
            else if (n.equals("2"))
                setEquipMenu(hero, reader);
            else if (n.equals("0"))
                break;
        }
    }

    public static void battleMenu(Hero hero, Scanner reader){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nEscolha uma opção");
            System.out.println("\n(0) Sair");
            System.out.println("\n(1) Ver equipamentos");
            String n = scanner.next();
            if (n.equals("1"))
                equipmentsMenu(hero,reader);
            else if (n.equals("0"))
                break;
        }

        //mais coisas a se adicionar
    }

    public static void stages(Hero myHero, Scanner reader){
        Stage stage1 = new Stage(new MonsterJobType[]{MonsterJobType.ORC},
                1, 3);
        Stage stage2 = new Stage(new MonsterJobType[]{MonsterJobType.PORING},
            2, 5);

        Stage stage3 = new Stage(new MonsterJobType[]{MonsterJobType.PORING},
            3, 10);
        stage1.startBattle(myHero);
        battleMenu(myHero, reader);
        stage2.startBattle(myHero);
        battleMenu(myHero, reader);
        stage3.startBattle(myHero);
    }


    //Tela de introdução do jogo:
    private static void intro(Scanner reader){
        p("===== Bem vindo ao Idle Poring =====\n\n\n");
        p("== Autores:  == \n");
        p("Renan Cunha & João Almeida");
        p("Enter para continuar ");
        scan(reader);
        clr();
    }

    //Mostra o estado atual do seu personagem:
    private static void heroStatus(Hero myHero){
        p("O seu herói está assim:\n");
        //TODO: Implementar o resto
    }
    //Menu principal do jogo:
    private static void mainMenu(Hero hero, Scanner reader){
        while(true){
            p("Escolha uma das opções a seguir:\n");
            p("1- Ir para um mapa\n");
            p("2- Pets\n");
            p("3- Mochila\n");
            p("4 - Loja\n");
            p("5 - Sair do jogo\n");
            p("Qual você deseja escolher: ");
            String choice = scan(reader);
            clr();
            switch (choice){
                case "1":
                    //Vai para a luta aqui
                    stages(hero, reader);
                    break;
                case "2":
                    //Página de pets aqui
                    //getpets();
                    break;
                case "3":
                    //Mochila aqui
                    equipmentsMenu(hero, reader);
                    break;
                case "4":
                    //Loja aqui
                    store(hero, reader);
                    break;
                case "5":
                    p("Saindo!");
                    //savehero();
                    System.exit(0);
                    break;
            }
        }
    }

    //Carrega uma loja
    public static void store(Hero hero, Scanner reader){
        Item[] preDefinedItens = {
                new Equipment("Capacete", HeroJobType.NOVICE, EquipmentType.HELMET, 1, 2, 1,
                        1, 1, 1, 1),
                new Equipment("Machado", HeroJobType.NOVICE, EquipmentType.WEAPON, 1, 2, 1,
                        1, 1, 1, 1),
                new Equipment("Armadura", HeroJobType.NOVICE, EquipmentType.ARMOR, 1, 2, 1,
                        1, 1, 1, 1),

                new Potion("Poção"),
                new Food("Mantimentos"),
        };
        Store store = new Store(preDefinedItens);
        while(true){
            p("Bem vindo a loja, escolha uma das opções a seguir:\n");
            p("1 - Listar itens disponíveis para compra");
            p("2 - Vender Item do seu inventário");
            p("3 - Sair da loja");
            String choice = scan(reader);
            switch (choice){
                case "1":
                    //lista os items da loja:
                    store.listItens();
                    p("Qual o nome do item você deseja comprar?");
                    String escolha = reader.next();
                    store.sellItem(hero,escolha);
                    clr();
                    break;
                case "2":
                    clr();
                    //Vender itens do inventário do herói:
                    p("Escolha o item do seu inventário você quer vender:");
                    hero.getBag().listItens();
                    String entrada = scan(reader);
                    Item item = hero.getBag().checkItem(Integer.parseInt(entrada));
                    store.buyItem(hero,item);
                    p("Você vendeu o item com sucesso! ");
                    break;
                case "3":
                    clr();
                    return;
            }
            clr();
        }

    }

    //Limpa a tela:
    private static void clr(){
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }
    //printa na tela:
    private static void p(String conteudo){
        System.out.println(conteudo);
    }

    //Enter para prosseguir:
    private static String scan(Scanner reader){
        return reader.next();

    }


    private static Hero loadHero(String filename) {
        //Recupera o estado do herói principal:
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            Hero myHero = (Hero) in.readObject();

            in.close();
            file.close();
            System.out.println("Os dados do seu personagem foram carregados com sucesso!");
            return myHero;
        }

        catch(IOException ex) {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }


    return null;
    }



    private static void saveHero(Hero myHero, String filename){
        //Salva o herói anets de finalizar a execução:
        try {
            //Salvando o objeto em uma arquivo
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Serializando o objeto:
            out.writeObject(myHero);
            out.close();
            file.close();
            System.out.println("Seu personagem foi salvo com successo !");

        }

        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
    }
}






