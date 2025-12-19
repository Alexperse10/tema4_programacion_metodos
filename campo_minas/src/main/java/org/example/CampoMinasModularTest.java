package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CampoMinasModularTest {

    @Test
    void ableroSinMinas() {
        char[][] tablero = {
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };

        int resultado = CampoMinasModular.contarCeldas(tablero, 3, 3);

        assertEquals(0, resultado);
    }

    @Test
    void tableroTodoMinas() {
        char[][] tablero = {
                {'*','*','*'},
                {'*','*','*'},
                {'*','*','*'}
        };

        int resultado = CampoMinasModular.contarCeldas(tablero, 3, 3);

        assertEquals(0, resultado);
    }

    @Test
    void casoEjemploEnunciado() {
        char[][] tablero = {
                {'*','-','-','*','*'},
                {'-','-','-','*','-'},
                {'-','-','-','*','*'},
                {'*','*','*','-','-'}
        };

        int resultado = CampoMinasModular.contarCeldas(tablero, 4, 5);

        assertEquals(0, resultado);
    }

    @Test
    void celdasRodeadasDeMinas() {
        char[][] tablero = {
                {'*','*','*','*'},
                {'*','-','-','*'},
                {'*','*','*','*'},
                {'*','*','*','*'}
        };

        int resultado = CampoMinasModular.contarCeldas(tablero, 4, 4);

        assertEquals(2, resultado);
    }
}
