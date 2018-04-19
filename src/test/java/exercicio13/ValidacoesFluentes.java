package exercicio13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class ValidacoesFluentes {

    @Test
    public void validacaoEqualsTo() {
        String produto = "TV 40 Polegadas";
        assertThat(produto, equalTo("TV 40 Polegadas"));
    }

    @Test
    public void validacaoIs() {
        int codigo = 50;
        assertThat(codigo, is(50));
    }

    @Test
    public void validacaoAnyOf() {
        String resultadoObtido = "A cor selecionada foi vermelha.";
        assertThat(resultadoObtido,
                anyOf(containsString("vermelho"), containsString("vermelha")));
    }

    @Test
    public void validacaoHasItems() {
        List<String> listaProdutos = new ArrayList<String>();
        listaProdutos.add("Iphone 8 Plus 64GB");
        listaProdutos.add("Mouse sem FIO - Logitech");
        listaProdutos.add("Apple TV 4 Geracao");

        assertThat(listaProdutos, hasItem("Iphone 8 Plus 64GB"));
    }

}
