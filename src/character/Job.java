//Classe que serve de base abstrativa para qualquer Job do joguinho (Arqueiro, Mago, Guerreiro, etc)

package character;


import util.Attributes;

//#import javax.smartcardio.ATR; Dá um erro ao fazer esse import

public abstract class Job {
    final JobType jobType;

    public Job(JobType jobType) {
      this.jobType = jobType;
    }

    public int weights(Character character, int sta, int str, int dex,
                     int intel, int agi, int luk){

      Attributes[] att_item = character.getAttItens();
      Attributes att = character.getAttributes();
      att = att.add(att_item);

      return  sta * att.getSta() +
              str * att.getStr() +
              dex * att.getDex() +
              intel * att.getIntel() +
              agi * att.getAgi() +
              luk * att.getLuk();
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
