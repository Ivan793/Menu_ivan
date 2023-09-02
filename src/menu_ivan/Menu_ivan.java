
package menu_ivan;

import javax.swing.JOptionPane;


public class Menu_ivan {

   //Clase principal
   //comentario
    public static void main(String[] args) {
        int opcion = 0; 
        String op="";
        op = JOptionPane.showInputDialog("seleccionar una opcion :\n"
               + "1. suma :\n"
               + "2. resta:\n"
               + "3. Multiplicación :\n"
               + "4. Division : \n");
        opcion = Integer.parseInt(op);
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el primer número"));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el segundo número"));
        
        Calculadora calculadora = new Calculadora();
             
        
        switch(opcion){
            case 1:
                calculadora.setN1(numero1);
                calculadora.setN2(numero2);
                JOptionPane.showMessageDialog(null,"El resultado de la suma es "+calculadora.sumar());break;
            case 2:
                calculadora.setN1(numero1);
                calculadora.setN2(numero2);
                JOptionPane.showMessageDialog(null,"El resultado de la resta es "+calculadora.restar());break;
            case 3:
                calculadora.setN1(numero1);
                calculadora.setN2(numero2);
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es "+calculadora.multiplicar());break;
            case 4:
                calculadora.setN1(numero1);
                calculadora.setN2(numero2);
                if(numero2 == 0){
                    JOptionPane.showMessageDialog(null,"no se puede dividir sobre cero ");
                }else{
                    JOptionPane.showMessageDialog(null,"El resultado de la division es "+calculadora.dividir());break;
                }
                 
        }
        
        
    }
    
}
