package CalculadoraInterface;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("soma: "+calc.soma(5 , 5));
        System.out.println("subtracao: "+calc.subt(5 , 5));
        System.out.println("potencia: "+calc.potencia(9,2));
        System.out.println("raiz: "+calc.raiz(81));
        System.out.println("multiplicacao: "+calc.multp(4,3));
        System.out.println("divisao: "+calc.div(15 ,3));
    }

}
