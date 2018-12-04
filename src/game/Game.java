package game;


import battle.Battle;
import character.hero.Hero;
import character.hero.HeroJobType;
import character.monster.MonsterJobType;
import item.*;
import stage.Stage;
import store.Store;
import util.Attributes;
import java.io.*;
import java.util.Scanner;

public class Game {
    static String filename = "/home/marcelo/idle_poring/src/util/myHero.ser";

    public static void runGame(){
        intro();
        //saveHero();

        //Hero hero = loadHero(filename);
        //heroStatus();

        mainMenu();
        //loop da batalha abaixo:


    }

    public static void setEquipMenu(Hero hero){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nName of item to equip?");
        String name = scanner.next();
        hero.setEquipment((Equipment) hero.bag.getItemByName(name));
    }


    public static void equipmentsMenu(Hero hero){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nChoose an option");
            System.out.println("\n(0) Exit");
            System.out.println("\n(1) See Bag");
            System.out.println("\n(2) Equip Item");
            String n = scanner.next();
            if (n.equals("1"))
                hero.getBag().listItens();
            else if (n.equals("2"))
                setEquipMenu(hero);
            else if (n.equals("0"))
                break;
        }
    }

    public static void intraBattleMenu(Hero hero){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nChoose an option");
            System.out.println("\n(0) Exit");
            System.out.println("\n(1) See Equipments");
            String n = scanner.next();
            if (n.equals("1"))
                equipmentsMenu(hero);
            else if (n.equals("0"))
                break;
        }

        //mais coisas a se adicionar
    }

    public static void stages(Hero myHero){
        Stage stage1 = new Stage(new MonsterJobType[]{MonsterJobType.ORC},
                1, 3);
        Stage stage2 = new Stage(new MonsterJobType[]{MonsterJobType.PORING},
            2, 5);

        Stage stage3 = new Stage(new MonsterJobType[]{MonsterJobType.PORING},
            3, 10);
        stage1.startBattle(myHero);
        intraBattleMenu(myHero);
        stage2.startBattle(myHero);
        intraBattleMenu(myHero);
        stage3.startBattle(myHero);
    }


    //Tela de introdução do jogo:
    private static void intro(){
        p("===== Bem vindo ao Idle Poring =====\n\n\n");
        p("== Autores:  == \n");
        p("Renan Cunha & João Almeida");
        p("Enter para continuar ");
        scanner();
    }

    //Mostra o estado atual do seu personagem:
    private static void heroStatus(Hero myHero){
        p("O seu herói está assim:\n");

    }
    //Menu principal do jogo:
    private static void mainMenu(){
        p("Escolha uma das opções a seguir:\n");
        p("1- Ir para um mapa\n");
        p("2- Pets\n");
        p("3- Mochila\n");
        p("4 - Loja\n");
        p("5 - Herói\n\n");
        p("Qual você deseja escolher: ");
        String choice = scanner();
        clr();
        switchMainMenu(choice);
    }

    //Carrega uma loja
    public static void Store(){
        Item[] preDefinedItens = {
                new Equipment("Capacete Poderoso", HeroJobType.NOVICE, EquipmentType.HELMET, 1, 2, 1,
                        1, 1, 1, 1),
                new Equipment("Machado Forte", HeroJobType.NOVICE, EquipmentType.WEAPON, 1, 2, 1,
                        1, 1, 1, 1),
                new Equipment("ARmadura de Couraça", HeroJobType.NOVICE, EquipmentType.ARMOR, 1, 2, 1,
                        1, 1, 1, 1),

                new Potion("Poção mágica"),
                new Food("Mantimentos Básicos"),
        };
        Store store = new Store(preDefinedItens);
        p("Bem vindo a loja, escolha uma das opções a seguir:\n");
        p("1 - Listar itens disponíveis para compra");
        p("1 - Vender Item do seu inventário");
        p("3 - Sair da loja");
        String choice = scanner();
        clr();
        switchStore(choice);
        return;
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
    private static String scanner(){
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        reader.close();
        return input;
    }

    //Escolhe qual parte do jogo executar:
    private static void switchMainMenu(String choice) {
        switch (choice){
            case "1":
                //Vai para a luta aqui
                //Battle.fight();
                break;
            case "2":
                //Página de pets aqui
                //getpets();
                break;
            case "3":
                //Mochila aqui
                //bag();
                break;
            case "4":
                //Loja aqui
                //store();
                break;
            case "5":
                //heroStatus();
                break;
        }
    }

    private static void switchStore(String choice){
        switch (choice){
            case "1":
                //lista os items da loja:

                break;
            case "2":
                //Vender itens do inventário do herói:
                break;
            case "3":
                return;
    }
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






