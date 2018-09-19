package CalculadoraInterface;

public class Calculadora implements Operacoes{

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subt(int a, int b) {
        return a - b;
    }

    @Override
    public double potencia(float a, float b) {
        return Math.pow(a , b);
    }

    @Override
    public double raiz(float a) {
        return Math.sqrt(a);

    }

    @Override
    public int multp(int a, int b) {
        return a * b;
    }

    @Override
    public float div(float a, float b) {
        return a/b;
    }
}
