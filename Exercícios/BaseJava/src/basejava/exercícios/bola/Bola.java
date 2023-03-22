package basejava.exercícios.bola;

public class Bola {
    String cor;
    double circun;
    String material;
    
    public void trocaCor(String cor){
        this.cor = cor;
    }
    public String mostrarCor(){
        return this.cor;
    }
    public void trocaCircun(double circun){
        this.circun = circun;
    }
    public double mostrarCircun(){
        return this.circun;
    }
    public void trocaMaterial(String material){
        this.material = material;
    }
    public String mostrarMaterial(){
        return this.material;
    }
}
