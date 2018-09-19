package exercicioVoo;

public class Main {

    public static void main(String[] args) {

        FiltroDeVoos fv = new FiltroDeVoos();

        Voo v1 = new Voo("poa", "Arj", "boing 747", 190);
        Voo v2 = new Voo("asp", "Acr", "boing 457", 188);
        Voo v3 = new Voo("ale", "Afp", "boing 787", 145);

        fv.adicionaVoo(v1);
        fv.adicionaVoo(v2);
        fv.adicionaVoo(v3);

        System.out.println(fv.saindoDe("poa"));
        System.out.println(fv.chagandoEm("Acr"));
        System.out.println(fv.operadoPor("boing 787"));

    }
}
