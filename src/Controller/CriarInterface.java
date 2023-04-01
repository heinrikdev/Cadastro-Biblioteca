
package Controller;
import View.Tela;
public class CriarInterface {
   
private View.Tela novatela;

    public CriarInterface() {
        this.novatela= new View.Tela();      
        novatela.rodar();  
    }
  
public static void main(String[] args) {       
CriarInterface nova= new CriarInterface();
    }
    
}
