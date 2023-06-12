package org.example;

public class Jogador {

    private String nome;
    private JogadorEstado estado;

    public Jogador() {
        this.estado = JogadorEstadoContratado.getInstance();
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }
    public boolean Contratado() {
        return estado.Contratado(this);
    }

    public boolean Atuando() {
        return estado.Atuando(this);
    }

    public boolean Aposentado() {
        return estado.Aposentado(this);
    }
    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }


}
