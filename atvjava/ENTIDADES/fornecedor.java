package atvjava.ENTIDADES;

import java.util.ArrayList;


public class fornecedor {
    private String cnpj;
    private String nome;
    private String telefone;
    private ArrayList<produto> Produto;



public fornecedor(){
    this.Produto = new ArrayList<produto>();
}



public fornecedor(String cnpj,String nome,String telefone){

    this.cnpj = cnpj;
    this.nome = nome;
    this.telefone = telefone;
    this.Produto = new ArrayList<produto>();

}


public  boolean inserirproduto(produto prodnovo){
     return this.Produto.add(prodnovo);

}


public produto buscarproduto(String cnpj){
   for(produto produto : Produto){
    if(produto.gefcnpj().equals(cnpj)){
        return produto;
    }
   }
    return null;
}


public boolean removerproduto(String cnpj){
    for(produto produto : Produto){
     if(produto.gefcnpj().equals(cnpj)){
         return this.Produto.remove(produto);
     }
    }
     return false;
 }






public boolean atualizarproduto(produto produto){
     for(produto prod : Produto  ){
        if(prod.gefcnpj().equals(produto.gefcnpj())){
            this.Produto.set(this.Produto.indexOf(prod),produto);
            return true;
        }
     }
     return false;
}


public String getCnpj() {
    return cnpj;
}







public String getNome() {
    return nome;
}





public void setNome(String nome) {
    this.nome = nome;
}





public String getTelefone() {
    return telefone;
}





public void setTelefone(String telefone) {
    this.telefone = telefone;
}



public ArrayList<produto> getProduto() {
    return Produto;
}



public void setProduto(ArrayList<produto> produto) {
    this.Produto = produto;
}






}