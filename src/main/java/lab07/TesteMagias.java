package main.java.lab07;

public class TesteMagias {

    public static String testeEnvenenamento() {

        Personagem policarpo = new Personagem("Policarpo Quaresma", 100, 100);

        Magia veneno = new Envenenamento();

        veneno.aplica(policarpo);

        return policarpo.toString();

    }

    public static String testeCura() {

        Personagem joanaDarc = new Personagem("Joana D'Arc", 90, 100);

        Magia cura = new Cura();

        cura.aplica(joanaDarc);

        return joanaDarc.toString();
    }

    public static String testeSono() {
        Personagem rosinhaDeValenca = new Personagem("Rosinha de Valenca", 100, 100);

        Magia sono = new Sono();

        sono.aplica(rosinhaDeValenca);

        return rosinhaDeValenca.toString();
    }
}
