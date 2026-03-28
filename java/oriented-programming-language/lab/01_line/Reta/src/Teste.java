import java.util.Scanner;


public class Teste {

    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);

        Reta r = new Reta(7);

        System.out.println("Informe a inclinacao da reta");
        double m = entrada.nextDouble();
        Reta.setM(m);

        System.out.println("Informe o valor da constante");
        double b = entrada.nextDouble();
        Reta.setB(b);

        for(int i=0; i<7; i++){

            r.adicionarPonto(Reta.calcularPontoNaReta(i));

        }

        /* Teste de remover o ponto

        Ponto2D p1 = new Ponto2D(1,3);

        r.removerPonto(p1);
        
        p1.setX(0);
        p1.setY(0);
        
        r.adicionarPonto(p1);

        */

        System.out.println(r.imprimirPonto());

        entrada.close();
    }


}
