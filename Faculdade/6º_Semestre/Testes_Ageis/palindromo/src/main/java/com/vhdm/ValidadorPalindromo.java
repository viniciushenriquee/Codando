package com.vhdm;

public class ValidadorPalindromo {
    public boolean ehPalindromo(String frase) {
        if (frase == null || frase.isBlank()) {
            return false;
        }

        String normalizada = frase
                .replaceAll("[\\W_]", "")     // Remove tudo que não for letra ou número
                .toLowerCase();               // Converte para minúsculas

        String invertida = new StringBuilder(normalizada).reverse().toString();

        return normalizada.equals(invertida);
    }
}

