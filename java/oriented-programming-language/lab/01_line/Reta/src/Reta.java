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

        double y = m*x+b;

        return new Ponto2D(x,y);

    }

    public boolean adicionarPonto(Ponto2D ponto){

        for(int i=0; i< pontos.length; i++){
            if(pontos[i] == null){
                pontos[i] = ponto;
                return true;
            }
        }
        return false;

    }

    public boolean removerPonto(Ponto2D ponto){

        for(int i=pontos.length-1; i>0 ; i--){
            if(pontos[i].getX() == ponto.getX() && pontos[i].getY() == ponto.getY()){
                pontos[i] = null;
                return true;
            }
        }
        return false;

    }

    public String imprimirPonto(){

        String resultado = "";

        for(int i=0; i<pontos.length; i++){
            if(pontos[i] != null){
                resultado += "(" + pontos[i].getX() + ", " + pontos[i].getY() + ")" +"\n";
            }
        }
        return resultado;

    }

}
