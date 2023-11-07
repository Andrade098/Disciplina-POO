package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        String saudacao = pessoa.dizerOla();
        assertEquals("Olá, usuário. Seja bem-vindo!", saudacao);
    }
}
