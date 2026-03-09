package com.tt1.test;

import java.util.Date;

public class ToDo implements IToDo{
    private String nombre;
    private String descripcion;
    private long fechaLimite;
    private boolean completado;

    //Constructor vació explícito
    public ToDo(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public ToDo(String nombre, String descripcion, long fecha, boolean completado) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void setNombre(String nombre){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public void setDescripcion (String descripcion){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public void setFechaLimite (long fecha){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public void setCompleta (boolean completado){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public String getNombre(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public String getDescripcion(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public long getFechaLimite(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public String getCompleta(){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
