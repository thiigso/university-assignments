package principal;

public class produto {

    private String descricao;
    private int codigo;
    private double preco;

    public produto(){
        this.codigo = 0;
        this.descricao = "";
        this.preco = 0;
    }

    public produto(String descricao, int codigo, double preco){
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public int getCodigo(){
        return codigo;
    }


}
