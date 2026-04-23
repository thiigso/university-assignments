import java.util.ArrayList;

public class Teste {


    public static void main(String[] args) {

        Ponto2D ponto1 = new Ponto2D(1,2);
        Ponto2D ponto2 = new Ponto2D(3, 7);

        ArrayList<Ponto2D> space = new ArrayList<>();
        space.add(ponto1);
        space.add(ponto2);

        Forma forma1 = Forma.geraForma(space);

        Espaco2D conjunto = new Espaco2D();
        conjunto.adicionarForma();
    }
}
