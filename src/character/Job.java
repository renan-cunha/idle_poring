//Classe que serve de base abstrativa para qualquer Job do joguinho (Arqueiro, Mago, Guerreiro, etc)

package character;


import util.Attributes;

import javax.smartcardio.ATR;

//#import javax.smartcardio.ATR; Dá um erro ao fazer esse import

public abstract class Job {
    public String name;
    JobType type;

    public String getName() {
    return name;
  }

    @Override
    public String toString() {
      return "Job{" +
            "name='" + name + '\'' +
            '}';
    }

    int weights(Character character, int sta, int str, int dex,
                          int intel, int agi, int luk){

      Attributes[] att_equip = character.getAttEquip();
      Attributes att = character.getAttributes().add(att_equip);
      Attributes[] att_pets = character.getAttPets();
      att = att.add(att_pets);

      return  sta * att.getSta() +
              str * att.getStr() +
              dex * att.getDex() +
              intel * att.getIntel() +
              agi * att.getAgi() +
              luk * att.getLuk();
    }

  //Abaixo estão os métodos para setar um atributo dependente:
    abstract int setAtk(Character character);

    abstract int setDef(Character character);

    abstract int setMaxHp(Character character);

    abstract int setMaxSp(Character character);


    int setAtkSpd(Character character) {
      return weights(character, 0, 0, 0, 0, 2, 0);
    }

    int setEva(Character character) {
      return weights(character, 0, 0, 0, 0, 2, 0);
    }

    int setCri(Character character) {
      return weights(character, 0, 0, 0, 0, 0, 2);

    }

    int setHit(Character character) {
      return weights(character, 0, 0, 0, 0, 0, 2);
    }

    int setTen(Character character) {
      return weights(character, 0, 0, 0, 0, 0, 2);
    }

  public JobType getType() {
    return type;
  }
}
