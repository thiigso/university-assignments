public class Carta{
    private String naipe;
    private int valor;

    public Carta(){
        this.naipe = "";
        this.valor = 0;
    }

    public Carta(int valor, String naipe){
        this.naipe = naipe;
        this.valor = valor;
    }

    public Carta(Carta carta){
        this.naipe = carta.naipe;
        this.valor = carta.valor;
    }

    public int getValor(){
        return valor;
    }

    public String getNaipe(){
        return naipe;
    }


    public int comparaValor(Carta carta){

        if(carta.getValor() == this.valor)
            return 0;

        else if(carta.getValor() > this.valor)
            return 1;

        else
            return -1;
    }

    public int comparaNaipe(Carta carta){

        if(carta.getNaipe() == this.naipe)
            return 0;
        else 
            return 1;
    }


}

