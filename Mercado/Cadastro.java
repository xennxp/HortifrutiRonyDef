
package Mercado;


public class Cadastro {

    String nome, setor, fornecedor;
    int estoque, id;
    int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    Cadastro(String nome, String setor, String fornecedor, int estoque, int preco) {
        this.nome = nome;
        this.setor = setor;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
        this.preco = preco;
    }

}
