package game;


import character.hero.Hero;

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
        switchToChoice(choice);
    }








    //utilitários:

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
    private static void switchToChoice(String choice) {
        switch (choice){
            case "1":
                //Vai para a luta aqui
                fight();
                break;
            case "2":
                //Página de pets aqui
                pets();
                break;
            case "3":
                //Mochila aqui
                bag();
                break;
            case "4":
                //Loja aqui
                store();
                break;
            case "5":
                //heroStatus();
                break;
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


    private static void saveHero(Hero myHero,String filename){
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





