package com.tt1.test;

public interface IToDo {
    public void setNombre(String nombre);
    public void setDescripcion (String descripcion);

    public void setFechaLimite (long fecha);
    public void setCompleta (boolean completado);

    public String getNombre();
    public String getDescripcion();
    public long getFechaLimite();
    public String getCompleta();
}
