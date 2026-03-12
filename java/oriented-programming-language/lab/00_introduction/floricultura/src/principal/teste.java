package principal;

public class teste {
    public static void main(String[] args) {
        produto flor = new produto();
        flor.setDescricao("violeta");
        flor.setPreco(2.00);
        flor.setCodigo(1);


        System.out.println("O codigo do produto e: "+flor.getCodigo());
        System.out.println("A descricao do produto e: "+flor.getDescricao());
        System.out.println("O preco do produto e: "+flor.getPreco());
        
    }

}
