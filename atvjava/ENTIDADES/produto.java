package atvjava.ENTIDADES;

import java.util.ArrayList;

public class produto {
    
    private int codigo;
    private String nome;
    private double valor;
    private ArrayList<fornecedor>  fornecedor;



public produto(int i, String string, double d, atvjava.ENTIDADES.fornecedor forn1){
       this.fornecedor = new ArrayList<fornecedor>();

}

public produto(int  codigo, String nome, float valor){
    
    this.codigo = codigo;
    this.nome = nome;
    this.valor = valor;
    this.fornecedor = new ArrayList<fornecedor>();
}










public int getCodigo() {
    return codigo;
}



public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getValor() {
    return valor;
}

public void setValor(float valor) {
    this.valor = valor;
}

public ArrayList<fornecedor> getFornecedor() {
    return fornecedor;
}

public void setFornecedor(ArrayList<fornecedor> fornecedor) {
    this.fornecedor = fornecedor;
}

public Object gefcnpj() {
    return null;
}















}
