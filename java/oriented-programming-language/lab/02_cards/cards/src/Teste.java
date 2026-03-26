public class Teste {
    public static void main(String[] args) {

        Carta carta1 = new Carta(7,"diamond");
        Carta carta2 = new Carta(carta1);
        Carta carta3 = new Carta(8,"spades");

        System.out.println(carta1.comparaValor(carta2));
        System.out.println(carta1.comparaValor(carta3));

        System.out.println(carta1.comparaNaipe(carta2));
        System.out.println(carta1.comparaNaipe(carta3));

    }
}

