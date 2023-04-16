import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(200, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(200, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
