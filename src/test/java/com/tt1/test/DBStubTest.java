package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DBStubTest {
	
	DBStub db;
	ToDo tarea;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		tarea = new ToDo("CTAN","Buscar paquetes",System.currentTimeMillis()+1000,false);
		db = new DBStub();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCrearTarea() {
		db.crearTarea(tarea);
		assertEquals(1,db.listarTodas().size());
	}
	@Test
	void testDevolverTarea() {
		db.crearTarea(tarea);
		ToDo tareaDevuelta = db.devolverTarea(1);
		assertEquals(tareaDevuelta,tarea);
	}
	@Test
	void testActualizarTarea() {
		db.crearTarea(tarea);
		tarea.setDescripcion("Actualizar latexmk");
		db.actualizarTarea(tarea);
		assertEquals(db.devolverTarea(1),tarea);
	}
	@Test
	void testEliminarTarea() {
		db.crearTarea(tarea);
		db.eliminarTarea(1);
		assertNull(db.devolverTarea(1));
	}

}
