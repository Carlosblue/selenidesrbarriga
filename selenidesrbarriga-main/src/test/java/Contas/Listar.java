package Contas;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Listar {

    SelenideElement btnListar = $(By.linkText("Listar"));

    SelenideElement btnEditar = $(".glyphicon-edit");

    SelenideElement inputNomeEdicao = $(".form-control");

    SelenideElement btnSalvarEdicao = $(".btn-primary");

    SelenideElement alertEdicao = $(".alert-success");

    public void editarConta(String Nome){
        btnListar.click();
        inputNomeEdicao.setValue(Nome);
        btnSalvarEdicao.click();
    }

    public String mensagemEdicao(){
         return alertEdicao.getText();
    }

}
