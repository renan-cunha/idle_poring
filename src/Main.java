
import battle.Battle;
import character.hero.*;
import character.monster.Monster;
import character.monster.MonsterJobType;
import character.monster.Orc;
import character.monster.SimpleFactoryMonster;
import game.Game;
import item.*;
import store.Store;
import stage.Stage;
import util.Attributes;
import pets.Pet;

import javax.smartcardio.ATR;

//import game.*;


public class Main {
    public static void main(String[] args) {
        //Batalha com boleano
        Hero hero = new Hero("Joaozinh");
        Game.stages(hero);
    }
}
