package com.udesc.aeroporto.entity;

public class Especialidade {
    private int idEspecialidade;
    private Tecnico tecnico;
    private Aviao aviao;

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public Especialidade setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
        return this;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public Especialidade setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
        return this;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public Especialidade setAviao(Aviao aviao) {
        this.aviao = aviao;
        return this;
    }

    @Override
    public String toString() {
        return "especialidade{" +
                "idEspecialidade=" + idEspecialidade +
                ", tecnico=" + tecnico +
                ", aviao=" + aviao +
                '}';
    }
}
