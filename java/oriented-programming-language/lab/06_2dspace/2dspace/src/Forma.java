import java.util.ArrayList;

public abstract class Forma {

    private ArrayList<Ponto2D> pontos;

    public Forma(ArrayList<Ponto2D> pontos){
        this.pontos = pontos;
    }

    public static Forma geraForma(ArrayList<Ponto2D> pontos){
        Forma forma = null;

        if(pontos.size() == 2){
            forma = new Circulo(pontos);
        }
        else if(pontos.size() == 3){
            forma = new Triangulo(pontos);
        }
        else{
            forma = new Quadrado(pontos);
        }


        return forma;
    }

}
