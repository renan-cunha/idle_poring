//Classe que serve de base abstrativa para qualquer Job do joguinho (Arqueiro, Mago, Guerreiro, etc)
package character;

public abstract class Job {
    public String name;

  public String getName() {
    return name;
  }

  @Override
  public String toString(){
    return this.name;
  }

  //Abaixo estão os métodos para setar um atributo dependente:
    public abstract int setAtk(Character character);

    public abstract int setMAtk(Character character);

    public abstract int setDef(Character character);

    public abstract int setMDef(Character character);

    public abstract int setMaxHp(Character character);

    public abstract int setMaxSp(Character character);

    public int setAtkSpd(Character character) {
      return 2*character.getAgi();
    }

    public int setEva(Character character) {
      return setAtkSpd(character);
    }

    public int setCri(Character character) {
      return 2*character.getLuk();
    }

    public int setHit(Character character) {
      return setCri(character);
    }

    public int setTen(Character character) {
      return setCri(character);
    }

}
