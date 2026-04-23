import java.util.ArrayList;

public class Circulo extends Forma {

    private double raio;

    public Circulo(ArrayList<Ponto2D> pontos){
        super(pontos);
        this.raio = pontos.get(0).distancia(pontos.get(1));
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}


