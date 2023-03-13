
package basejava;

public class Numero {
    int valor;    
    
    public String parImpar (){
        if(this.valor % 2 ==0){
            return "PAR";
        }else{
            return "IMPAR";
        }
    }
}