package com.tt1.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoTest {
    @Test
    void guardaNombre(){
        ToDo tarea = new ToDo();
        tarea.setNombre("Práctica III");
        assertEquals("Práctica III",tarea.getNombre());
    }
    @Test
    void guardaDescripcion(){
        ToDo tarea = new ToDo();
        tarea.setDescripcion("IDEs: TDD en Java");
        assertEquals("IDEs: TDD en Java",tarea.getDescripcion());
    }
    @Test
    void guardaFechaLimite(){
        ToDo tarea = new ToDo();
        tarea.setFechaLimite();
    }
}
