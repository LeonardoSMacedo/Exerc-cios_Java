package basejava.exercícios.pessoa;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome= nome;
        this.idade= idade;
        this.peso= peso;
        this.altura= altura;
    }
    public void envelhecer(int anos) {
        this.idade+= anos;
        if(this.idade< 21)crescer(0.5);
    }
    public void engordar(double peso) {
        this.peso+= peso;
    }
    public void emagrecer(double peso) {
        this.peso-= peso;
    }
    public void crescer(double altura) {
        this.altura+= altura;
    }
    public String toString() {
        return"Pessoa [nome= " +nome+ ", idade=" +idade+ ", peso=" +peso+ ", altura= " +altura+ "]";
    }
}
