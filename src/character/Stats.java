package character;
import java.util.Map;
import java.util.HashMap;


public class Stats {
  //Hash table com os atributos:
  private Map stats = new HashMap();
  private Map attributes = new HashMap();
  private JobType job;

  // Construtor:
  public Stats(JobType job){
    //Atribuindo 0 como valor padrão aos atributos:
    for (TypeStats att : TypeStats.values()){
      stats.put(att, 0);
    }
    for (TypeAttribute att : TypeAttribute.values()){
      attributes.put(att, 0);
    }
    this.job=job;
  }

  private int get_value_att(TypeAttribute att){
    return (int) this.attributes.get(att);
  }


  //exemplo de definição de atributo dependente
  private void SetAtk(){
    int value=0;
    if (job== JobType.ARCHER) {
      value = 4 * get_value_att(TypeAttribute.DEX);
    }else if(job== JobType.SWORDSMAN){
      value = 4 * get_value_att(TypeAttribute.STR);
    }
    stats.replace(TypeStats.ATK, value);
  }

  public Map show_attributes(){
    return this.attributes;
  }

  public Map show_stats(){
    return this.stats;
  }

  private boolean test_value(int n){
    if (n>=0)
      return true;
    System.out.println("ERROR: Negative Value");
    return false;
  }

  //Método para atualizar um atributo, adicione os argumentos necessários
  public void update(TypeAttribute att, int increment){
    int old_value = (int) this.attributes.get(att);
    int new_value = old_value+increment;
    if(test_value(new_value))
      this.attributes.replace(att, old_value+increment);
    SetAtk(); //SetAtk coomo exemplo para teste
  }


}
