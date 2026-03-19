public class Reta {

    private static double m;
    private static double b;
    private Ponto2D pontos[];

    public Reta(int tam){
        this.pontos = new Ponto2D[tam];
    }

    public static void getM(double m1){
        m = m1;
    }

    public static void getB(double b1){
        b = b1;
    }

    public static void setM(double m1){
        m = m1;
    }

    public static void setB(double b1){
        b = b1;
    }

    public static Ponto2D calcularPontoNaReta(double x){

        Ponto2D return =  new Ponto2D();

        double y = m*x+b;

        return.setX(x);
        return.setY(y);

    }

    public boolean adicionarPonto(Ponto2D ponto){

    }

    public boolean removerPonto(Ponto2D ponto){

    }

    public boolean imprimirPonto(Ponto2D ponto){

    }


    Reta r = new Reta();

    for(i=1; i<7; i++){
        double aux = Reta.calcularPontoNaReta(double x);

    }




}
