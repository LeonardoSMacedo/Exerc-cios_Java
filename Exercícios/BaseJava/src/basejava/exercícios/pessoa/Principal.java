package basejava.exercícios.pessoa;

public class Principal {
        public static void main(String[] args) {
        Pessoa P = new Pessoa("Leonardo", 16, 86, 180);
        System.out.println(P.toString());
        P.engordar(10);
        System.out.println(P.toString());
        P.emagrecer(5);
        System.out.println(P.toString());
        P.crescer(3);
        System.out.println(P.toString());
        P.envelhecer(5);
        System.out.println(P);
    }
}