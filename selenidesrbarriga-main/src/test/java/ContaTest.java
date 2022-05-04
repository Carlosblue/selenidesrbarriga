import Contas.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {
    Conta conta = new Conta();
    Login login = new Login();

    @BeforeEach
    public void setupBefore() {
        login.logarNoSistema();

    }


    @Test
    public void adicionarContas(){
        conta.adicionarConta();
        conta.inserirConta("Gustavo Chagas");
        conta.salvar();
        Assertions.assertEquals("Conta adicionada com sucesso!", conta.alerta());
    }
    @Test
    public void adicionarContaExistente(){
        conta.adicionarConta();
        conta.inserirConta("Gustavo Chagas");
        conta.salvar();
        Assertions.assertEquals("Já existe uma conta com esse nome!", conta.alertadanger());
    }





}


