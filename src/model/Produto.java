
package model;

import java.util.ArrayList;

public abstract class Produto{
    //atributos
private String Descrição; 
 private float Valor;
Fornecedor novoFornecedor= new Fornecedor();

    public Produto() {
    }

    public void Produto(String Descrição, float Valor,String NomeFornecedor, String LocalFornecedor, String EmailFornecedor) {
        this.Descrição = Descrição;
        this.Valor = Valor;
        novoFornecedor.setNome(NomeFornecedor);
        novoFornecedor.setLocal(LocalFornecedor);
        novoFornecedor.setEmail(EmailFornecedor);
    }
    
public String getDescricao(){
    return Descrição;
} 

    //metodos
    public float getValor() {
        return Valor;
    }

    public String getNomeFornecedor() {
        return novoFornecedor.getNome();
    }
public String getLocalFornecedor(){
    return novoFornecedor.getLocal();
} 
 public String getEmailFornecedor(){
    return novoFornecedor.getEmail();
}  
      
}
