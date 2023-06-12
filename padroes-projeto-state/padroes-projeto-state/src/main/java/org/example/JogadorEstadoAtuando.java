package org.example;

public class JogadorEstadoAtuando extends JogadorEstado {
    private JogadorEstadoAtuando() {};

    private static JogadorEstadoAtuando instance = new JogadorEstadoAtuando();
    public static JogadorEstadoAtuando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atuando";
    }

    public boolean Contratado(Jogador jogador) {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        return true;
    }

    public boolean Aposentado(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }
}
