package character;

import java.util.Map;

public class Swordsman extends Job {

    public Swordsman() {
        super(JobType.SWORDSMAN);
    }

    @Override
    public void updateStats(Map attributes, Map stats) {
        int atk = 4*(int)attributes.get(TypeAttribute.DEX);
        stats.replace(TypeStats.ATK, atk);

        //um igual ao de cima para cada atributo dependente
    }
}
