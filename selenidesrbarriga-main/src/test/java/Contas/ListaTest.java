package Contas;

import org.junit.jupiter.api.BeforeEach;

public class ListaTest {

    Conta conta = new Conta();
    Login login = new Login();

    @BeforeEach
    public void setupBefore() {
        login.logarNoSistema();

    }




}
