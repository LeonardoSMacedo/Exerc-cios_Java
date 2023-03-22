package basejava.exercícios.CC;

public class cc {
    int numero;
    String nome;
    double saldo;
    public cc(int numero, String nome, double saldo) {
        this.numero= numero;
        this.nome= nome;
        this.saldo= saldo;
    }
    public cc(int numero, String nome) {
        this.numero= numero;
        this.nome= nome;
        this.saldo= 0.0;
    }
    public void setNome(String nome) {
        this.nome= nome;
    }
    public void deposito(double valor) {
        this.saldo+= valor;
    }
    public void saque(double valor) {
        if(this.saldo>= valor) {
            this.saldo-= valor;
        }
    }
    public String toString() {
        return "cc [numero="+ numero+ ", nome="+ nome+ ", saldo="+ saldo+ "]";
    }
}
