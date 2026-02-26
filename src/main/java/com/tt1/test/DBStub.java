package com.tt1.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DBStub {
    private Map<ToDo,Integer> tareas; //autogenerar id autoincremental
    public Set<String> agenda;
    //El email ya es clave primaria
    public ToDo crearTarea(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public ToDo actualizarTarea(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public ToDo devolverTarea(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public ToDo eliminarTarea(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

}
