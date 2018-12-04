//Classe que serve de base abstrativa para qualquer Job do joguinho (Arqueiro, Mago, Guerreiro, etc)

package character;


import util.Attributes;

public abstract class Job {
    final JobType jobType;

    public Job(JobType jobType) {
      this.jobType = jobType;
    }

    public int weights(Character character, int staWeight, int strWeight,
                       int dexWeight, int intelWeight, int agiWeight,
                       int lukWeight){

      Attributes att = character.getAllAttributes();

      return  staWeight * att.getSta() +
              strWeight * att.getStr() +
              dexWeight * att.getDex() +
              intelWeight * att.getIntel() +
              agiWeight * att.getAgi() +
              lukWeight * att.getLuk();
    }

    //Abaixo estão os métodos para setar um atributo dependente:
    public abstract int setAtk(Character character);

    public abstract int setDef(Character character);

    public abstract int setMaxHp(Character character);

    public abstract int setMaxSp(Character character);

    public abstract int setAtkSpd(Character character);

    public abstract int setEva(Character character);

    public abstract int setCri(Character character);

    public abstract int setHit(Character character);

    public abstract int setTen(Character character);

    public JobType getJobType() {
      return jobType;
    }

}
