package org.example;

public class JogadorEstadoContratado extends JogadorEstado {
    private JogadorEstadoContratado() {};
    private static JogadorEstadoContratado instance = new JogadorEstadoContratado();
    public static JogadorEstadoContratado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratado";
    }

    public boolean Contratado(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAtuando.getInstance());
        return true;
    }
}
