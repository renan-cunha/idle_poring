package battle;
import character.Character;
import character.hero.*;
import character.monster.*;
import item.Equipment;
import util.Config;

//TODO: definir níveis de acesso aos métodos e atributos desta classe
//TODO: Aumentar a complexidade da batalha, levar em conta outros atributos como sorte, agilidade etc
public class Battle {
    static int turn = 0;
    //executa a batalha:
    static public void fight(Hero heroi, Monster inimigo){
        System.out.printf("Uma batalha entre %s e %s foi iniciada %n", heroi.getName(), inimigo.getName());
        //Armazena informações do turno:
        turn = 1;
        //armazena o dano acumulado do turno;
        int turn_damage = 0;
        heroi.setHp(heroi.getMaxHp());
        inimigo.setHp(inimigo.getMaxHp());

        while (!isDead(heroi) && !isDead(inimigo)) {
            if (turn%2==0) {
                for (int i = 0; i < n_hits(heroi, inimigo); i++) {
                    int damage = damage(heroi, inimigo);
                    hitOpponent(heroi, inimigo, damage);
                    turn_damage += damage;
                }
                battleStatus(heroi,inimigo,turn_damage);
            }
            else {
                for(int i = 0; i < n_hits(inimigo, heroi); i++){
                    int damage = damage(inimigo, heroi);
                    hitOpponent(inimigo, heroi, damage);
                    turn_damage += damage;
                }
                battleStatus(inimigo,heroi,turn_damage);
            }
            turn_damage = 0;
            turn +=1;

            if(isDead(heroi))
                return;
            else if(isDead(inimigo)){
                passEquipmentsToHero(heroi, inimigo);
                int xp = heroi.getAttributes().getXp();
                heroi.setXp(xp+10);
                return;
            }

            //Pausa a execução em alguns ms por turno:
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }
        }

    }

    //Desfere um golpe no inimigo:
    public static void hitOpponent(Character heroi, Character inimigo, int damage){
        int attack = heroi.getAtk();
        int defense = inimigo.getDef();
        //Subtrai do HP o dano recebido:
        int newHp = inimigo.getHp() - damage;
        if (newHp < 0) newHp=0;
        inimigo.setHp(newHp);

    }


    public static int damage(Character attacker, Character defender){
        int attack = attacker.getAtk();
        int defense = defender.getDef();

        //O dano é diminuido em 10% pela defesa do inimigo (Arbitrário)
        int damage =  attack - (int) (Config.WEIGHT_DEFENSE.getValue()
                *0.10 * defense);
        //aplica o dano crítico:
        if (critical(attacker)) damage *= Config.WEIGHT_CRITICAL_DAMAGE.getValue();
        //aplica a evasiva:
        if (!evaded(attacker,defender)) {
            return 0;}

        if(damage > 0){
            return damage;
        }
        else return 1;
    }

    //define se esquivou de um ataque:
    public static boolean evaded(Character attacker, Character defender){
        return Math.random() < Config.WEIGHT_EVADED.getValue()*
                attacker.getHit()/(attacker.getHit()+defender.getEva());
    }

    //Define se houve dano crítico:
    public static boolean critical(Character attacker){
        float chance = (float)(Config.BASE_CRITICAL_CHANCE.getValue()+
                Config.WEIGHT_CRITICAL_CHANCE.getValue()*attacker.getCri())/100;
        if(Math.random() < chance) return true;
        return false;
    }

    //define quantos ataques por turno haverão:
    public static int n_hits(Character attacker, Character defender){
      //Para definir quantos hits o atacante fará, utilizamos a proporção entre seu atkSpd e o atkSpd do defensor
      int atk_speed_ratio = attacker.getAtkSpd() / defender.getAtkSpd();
      if (atk_speed_ratio<1) return 1;
      return atk_speed_ratio;
    }

    public static void battleStatus(Character one, Character another, int turn_damage){
        //Após acertar o oponente, o dano causado na rodada é printado
        System.out.printf("\n\nTurno %d: %n%s causou %d danos em %s nesse turno!",
                turn,
                one.getName(),
                turn_damage,
                another.getName());
        turn_damage = 0;

        System.out.printf("%n%s tem %d Hps e %s tem %d Hps",
                            one.getName(),one.getHp(),
                            another.getName(), another.getHp());


    }

    public static boolean isDead(Character defender){

        if (defender.getHp() == 0){

            System.out.println("\n\n"+ defender.getName() +" morreu");
            return true;
        } else {
            return false;
        }
    }

    private static void passEquipmentsToHero(Hero hero, Monster monster){
        Equipment[] equipments = monster.getEquipments();
        for(int i=0; i<equipments.length; i++){
            if(! equipments[i].getName().equals("Empty")){
                hero.getBag().addItem(equipments[i]);
            }
        }
    }

    private static void passCoinsToHero(Hero hero, Monster monster){
        int nCoins = monster.getPouch().getBalance();
        hero.getPouch().addCoins(nCoins);
    }
}
