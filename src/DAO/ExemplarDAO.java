
package DAO;
import java.util.ArrayList;
import model.Estoque;
public class ExemplarDAO {
   ArrayList <model.Estoque> estoques = new ArrayList(); 

    public ExemplarDAO() {
    }
    
    public void InserirEstoque(int QntProdutos, String Descrição, float Valor,String NomeFornecedor, String LocalFornecedor, String EmailFornecedor){
        model.Estoque novoEstoque = new model.Estoque();
        novoEstoque.Produto(Descrição, Valor,NomeFornecedor, LocalFornecedor, EmailFornecedor);
        novoEstoque.setQntProduto(QntProdutos);
        estoques.add(novoEstoque);
        
    }
    public void Remover(int x){
        estoques.remove(x);
    }
     public int getQntProdutos(int x){
        return estoques.get(x).getQntProduto();
    }
     public float getvalor(int x){
        return estoques.get(x).getValor();
    }
    public String getNomeFornecedor(int x){
        return estoques.get(x).getNomeFornecedor();
    }
    public String getDescriçãoEstoque(int x){
        return estoques.get(x).getDescricao();
    }
    public String getLocal(int x){
        return estoques.get(x).getLocalFornecedor();
    }
    public String getEmailFornecedor(int x){
        return estoques.get(x).getEmailFornecedor();
        
    }
    
}
