package exercicioVoo;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeVoos {

    private List<Voo> listagemDevoos = new ArrayList<>();

    public void adicionaVoo(Voo voo) {
        listagemDevoos.add(voo);
    }

    public ArrayList<Voo> saindoDe(String saida){

        ArrayList<Voo> listaSaida = new ArrayList<>();

        for (Voo voo: listagemDevoos){
            if (saida.equals(voo.getOrigem())){
                listaSaida.add(voo);
            }
        }

        return listaSaida;
    }

    public ArrayList<Voo> chagandoEm(String chegada){
        ArrayList<Voo> listaChegada = new ArrayList<>();

        for (Voo voo: listagemDevoos) {
            if(chegada.equals(voo.getDestino() )){
                listaChegada.add(voo);
            }
        }

        return listaChegada;
    }

    public ArrayList<Voo> operadoPor(String equipamento){
        ArrayList<Voo> listaEquipamento = new ArrayList<>();

        for (Voo voo: listagemDevoos) {
            if(equipamento.equals(voo.getEquipamento())){
                listaEquipamento.add(voo);
            }
        }

        return listaEquipamento;
    }

}
