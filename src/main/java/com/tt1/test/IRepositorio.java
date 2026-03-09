package com.tt1.test;

public interface IRepositorio {
    public void tareaCompletada(ToDo tarea);
    public ToDo encontrarTarea (String nombre);
    public void almacenarTarea (ToDo tarea);
    public void almacenarEmail ();
}
