package basejava.exercícios.CC;

public class Principal {
    public static void main(String[] args) {
        cc L = new cc (123, "Leonardo", 100.0);
        System.out.println(L.toString());
        L.setNome("Rodnei");
        L.deposito(150);
        System.out.println(L.toString());
        L.saque(110);
        System.out.println(L.toString());
    }
}
