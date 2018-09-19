package CalculadoraInterface;

public class Main {
    public static void main(String[] args) {
 Calculadora calc = new Calculadora();

        System.out.println(calc.soma(5 , 5));
        System.out.println(calc.subt(5 , 5));
        System.out.println(calc.potencia(9,2));
        System.out.println(calc.raiz(81));
        System.out.println(calc.multp(4,3));
        System.out.println(calc.div(15 ,3));
    }

}
