package basejava.exercícios.bola;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Bola bolinha = new Bola();
        bolinha.trocaCor("vermelho");
        bolinha.trocaCircun(10.5);
        bolinha.trocaMaterial("metal");

        JOptionPane.showMessageDialog(null, "" 
            + "Cor: " + bolinha.mostrarCor() + "\n"
            + "Circunferencia: " + bolinha.mostrarCircun() + "\n" 
            + "Material: " + bolinha.mostrarMaterial() + "\n");
    }
}
