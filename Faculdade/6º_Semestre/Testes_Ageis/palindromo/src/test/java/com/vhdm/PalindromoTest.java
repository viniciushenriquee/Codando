package com.vhdm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    ValidadorPalindromo validador = new ValidadorPalindromo();

    @Test
    void deveRetornarTrueParaPalavrasSimples() {
        assertTrue(validador.ehPalindromo("ana"));
        assertTrue(validador.ehPalindromo("Ovo"));
    }

    @Test
    void deveRetornarTrueParaFrasesComEspacosEAcentos() {
        assertTrue(validador.ehPalindromo("Ame a ema"));
        assertTrue(validador.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(validador.ehPalindromo("Olá mundo"));
        assertFalse(validador.ehPalindromo("OpenAI é incrível"));
    }

    @Test
    void deveRetornarFalseParaNullOuVazio() {
        assertFalse(validador.ehPalindromo(null));
        assertFalse(validador.ehPalindromo("   "));
    }
}
