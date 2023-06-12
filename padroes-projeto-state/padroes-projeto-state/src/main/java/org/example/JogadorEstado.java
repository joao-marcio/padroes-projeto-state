package org.example;

public abstract class JogadorEstado {
    public abstract String getEstado();

    public boolean Contratado(Jogador jogador) {
        return false;
    }

    public boolean Atuando(Jogador jogador) {
        return false;
    }

    public boolean Aposentado(Jogador jogador) {
        return false;
    }
}
