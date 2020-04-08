package br.facens.pa5_ib.repository;

import java.util.ArrayList;

import br.facens.pa5_ib.model.EstadoConservacao;

public class EstadoConservacaoRepository {
    ArrayList<EstadoConservacao> ec = new ArrayList<>();
    int cont = 0;

    public EstadoConservacaoRepository (){
       ec.add(new EstadoConservacao(1, "Extinta"));
       ec.add(new EstadoConservacao(2, "Extinta na natureza"));
       ec.add(new EstadoConservacao(3, "Criticamente em perigo"));
       ec.add(new EstadoConservacao(4, "Em perigo"));
       ec.add(new EstadoConservacao(5, "vunerável"));
       ec.add(new EstadoConservacao(6, "Quase ameaçada"));
       ec.add(new EstadoConservacao(7, "Pouco preocupante"));
    }

    public ArrayList<EstadoConservacao> getEstadoConservacaos(){
        return this.ec;
    }


}