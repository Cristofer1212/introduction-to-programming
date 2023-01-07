package E3;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class mainClass {
    public static void main(String[] args) {
    }
}

// Función por valor

class function_by_value{
    public static void main(String[] args) {
        int param1 = 20;
        int param2 = 80;
        var valor = suma(param1, param2);
        System.out.println(valor);
    }
    public static int suma (int a , int b){ //  create the function
        return (a + b); // we return what the function will do
    }
}

// Función por Referencia

class function_by_reference {
    public static void main(String[] args) {
        Potato myPotato = new Potato(); // create the instance
        myPotato.remove_arm(); // we call the function of the created instance
        myPotato.add_leg();
        System.out.println(myPotato.arm); // print the property of the created instance
        System.out.println(myPotato.leg);
    }
    static class Potato {
        public int arm; // property
        public int leg; // property

        public void remove_arm(){ // function
            this.arm--; // property decreases, reference property
        }
        public void add_leg (){
            this.leg++;
        }
    }
}

// Función Recursiva

class recursive_function {  // returns a value and calls itself
    public static void main(String[] args) {
    suma( 1 , 2);
    }
     public static int suma(int a, int b){
        int result = a + b;
        System.out.println(result);

        return suma( a, b);
 }
}

// Función CallBack

class Function_CallBack {
// Assign a function name to a variable and call that function
// by the variable name
}

