import java.util.logging.Logger;

public class BancoDeDados {
    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //Fez algo
        LOGGER.info("Iniciou Conexão");
    }

    public static void finalizarConexao() {
        //Fez algo
        LOGGER.info("Finalizou Conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no BD
        LOGGER.info("Inseriu Dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //insere pessoa no BD
        LOGGER.info("Removeu Dados");
    }
}
