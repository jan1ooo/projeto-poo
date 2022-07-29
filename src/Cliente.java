public class Cliente {

    public String nome;
    public String email;
    public long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    public Cliente(String nome, String email, int cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
}
