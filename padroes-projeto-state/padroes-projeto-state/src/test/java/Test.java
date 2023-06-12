import org.example.Jogador;
import org.example.JogadorEstadoAtuando;
import org.example.JogadorEstadoAposentado;
import org.example.JogadorEstadoContratado;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    @org.junit.jupiter.api.Test
    public void deveAtuarJogadorContratado() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertTrue(jogador.Contratado());
        assertEquals(JogadorEstadoAtuando.getInstance(), jogador.getEstado());
    }

    @org.junit.jupiter.api.Test
    public void deveContinuarContratadoJogadorEmAtuacao() {
        jogador.setEstado(JogadorEstadoAtuando.getInstance());
        assertTrue(jogador.Contratado());
        assertEquals(JogadorEstadoContratado.getInstance(), jogador.getEstado());
    }

    @org.junit.jupiter.api.Test
    public void deveAposentarJogadorEmAtuacao() {
        jogador.setEstado(JogadorEstadoAtuando.getInstance());
        assertTrue(jogador.Aposentado());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarContratadoJogadorContratadoForaDeAtuacao() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertFalse(jogador.Aposentado());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarContratadoJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.Contratado());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarEmAtuacaoJogadorAtuando() {
        jogador.setEstado(JogadorEstadoAtuando.getInstance());
        assertFalse(jogador.Atuando());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarEmAtuacaoJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.Atuando());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveFicarAposentadoJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.Aposentado());
    }
    @org.junit.jupiter.api.Test
    public void naoDeveContratarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.Contratado());
    }
}
