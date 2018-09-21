package character;
import java.util.Map;
import java.util.HashMap;

public class Character {

  //Atributos:
  private static int n_characters;
  private String name;
  private int lvl;
  private Map stats = new HashMap(); //variaveis dependentes
  private Map attributes = new HashMap(); //variaveis independentes
  public Job job; //Personagem tem uma classe

  //Construtor
  public Character(String name, int lvl, Job job) {
    this.name = name;
    this.lvl = lvl;
    for (TypeStats att : TypeStats.values()){
      stats.put(att, 0);
    }

    for (TypeAttribute att : TypeAttribute.values()){
      attributes.put(att, 1);
    }
    this.job =job;
    updateStats();
  }


  public Map showStats() {
    return stats;
  }

  public Map showAttributes() {
    return attributes;
  }

  public String getName(){
    return this.name;
  }

  public void updateAtt(TypeAttribute att, int increment){
    attributes.replace(att,((int)attributes.get(att))+increment);
    updateStats();
  }

  public void updateStats(){
    job.updateStats(this.attributes, this.stats);
  }
}
