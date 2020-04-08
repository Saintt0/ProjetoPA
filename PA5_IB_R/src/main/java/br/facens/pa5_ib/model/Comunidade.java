package br.facens.pa5_ib.model;

/**
 * Comunidade
 */
public class Comunidade {

    private int IDComunidade;
    private String Nome;
    private String Cidade;
    private double DimensaoEspaco;

    public Comunidade(int iDComunidade, String nome, String cidade, double dimensaoEspaco) {
        IDComunidade = iDComunidade;
        Nome = nome;
        Cidade = cidade;
        DimensaoEspaco = dimensaoEspaco;
    }

    public Comunidade() {}

    public int getIDComunidade() {
        return IDComunidade;
    }

    public void setIDComunidade(int iDComunidade) {
        IDComunidade = iDComunidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public double getDimensaoEspaco() {
        return DimensaoEspaco;
    }

    public void setDimensaoEspaco(double dimensaoEspaco) {
        DimensaoEspaco = dimensaoEspaco;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Cidade == null) ? 0 : Cidade.hashCode());
        long temp;
        temp = Double.doubleToLongBits(DimensaoEspaco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + IDComunidade;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Comunidade other = (Comunidade) obj;
        if (Cidade == null) {
            if (other.Cidade != null)
                return false;
        } else if (!Cidade.equals(other.Cidade))
            return false;
        if (Double.doubleToLongBits(DimensaoEspaco) != Double.doubleToLongBits(other.DimensaoEspaco))
            return false;
        if (IDComunidade != other.IDComunidade)
            return false;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Comunidade [Cidade=" + Cidade + ", DimensaoEspaco=" + DimensaoEspaco + ", IDComunidade=" + IDComunidade
                + ", Nome=" + Nome + "]";
    }

    
    

    
}