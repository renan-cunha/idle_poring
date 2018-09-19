package character;
import java.util.Map;
import java.util.HashMap;


public class Stats {
  //Hash table com os atributos:
  private Map attributes = new HashMap();

  // Construtor:
  public Stats(){
    //Atribuindo 0 como valor padrão aos atributos:
    for (Attributes att : Attributes.values()){
      attributes.put(att, 0);
    }
  }

  //Método para atualizar um atributo, adicione os argumentos necessários
  public static void update(){

  }


}
