
package model;


public class Fornecedor {
   
    private String Nome;
    private String Local;
    private String Email;

    public Fornecedor() {
    }

    public void Fornecedor(String Nome, String Local, String Email) {
        this.Nome = Nome;
        this.Local = Local;
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


    
}
