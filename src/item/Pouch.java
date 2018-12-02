package item;

public class Pouch implements Item {
    String name = "Pochete de Moedas";
    //Uma polchete serve pra guardar moedas:
    private int nCoins = 0;
    //Um polchet ede moedas não tem valor (Loja)
    final private int value = 0;


    @Override
    public String getName() { return "Pochete com "+this.nCoins+"moedas"; }

    @Override
    public int getValue() { return this.value; }

    //retorna o saldo da bolsa
    public int getBalance() { return this.nCoins; }

    public void addCoins(int nNewCoins){if(nNewCoins >=0) this.nCoins += nNewCoins;}
    public void withdrawCoins(int nWCoins){if(nWCoins >=0) this.nCoins += nWCoins;}

}
