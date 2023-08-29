
package menu_ivan;

public class Calculadora {
    private float n1, n2;
    
    public void setN1(float n1){
        this.n1 = n1;
    }
    
    public float getN1(){
        return this.n1;
    }

    public float getN2() {
        return this.n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public float sumar(){
        return n1 + n2;
    }
    
    public float restar(){
        return n1 - n2;
    }
    public float multiplicar(){
        return n1*n2;
    }
    
    
}
