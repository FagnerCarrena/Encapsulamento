package exercicio01;

public class Usuario {
    private String senha;
    private String email;
    public Usuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }
}
