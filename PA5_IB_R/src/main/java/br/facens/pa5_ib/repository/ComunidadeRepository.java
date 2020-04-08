package br.facens.pa5_ib.repository;

import java.util.ArrayList;

import br.facens.pa5_ib.model.Comunidade;

public class ComunidadeRepository {
    ArrayList<Comunidade> comunidades;
    int contador=0;

    public ComunidadeRepository ()
    {
       comunidades = new ArrayList<>();
    }

    public void addComunidades(Comunidade comunidade)
    {
        comunidade.setIDComunidade(contador);
        comunidades.add(comunidade);
        contador++;
    }

    public ArrayList<Comunidade> getComunidades(){
        return this.comunidades;
    }
}