package com.tt1.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RepositorioTest {
	ToDo tarea;
	DBStub db;
	Repositorio repositorio;
	String email;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tarea = new ToDo("CTAN","Buscar paquetes",System.currentTimeMillis()+1000,false);
		email = "lordOfTheStrings@domain.com";
		db = new DBStub();
		repositorio = new Repositorio(db);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAlmacenarTarea() {
		repositorio.almacenarTarea(tarea);
		assertEquals(1,repositorio.listarTodas().size());
	}
	@Test
	public void testTareaCompletada() {
		repositorio.almacenarTarea(tarea);
		repositorio.tareaCompletada(tarea);
		assertTrue(repositorio.encontrarTarea(tarea).isCompletado());
	}
	@Test
	public void testEncontrarTarea() {
		repositorio.almacenarTarea(tarea);
		assertEquals(tarea,repositorio.encontrarTarea(tarea));
		repositorio.tareaCompletada(tarea);
		assertTrue(repositorio.encontrarTarea(tarea).isCompletado());
	}
	@Test
	public void testAlmacenarEmail() {
		repositorio.almacenarEmail(email);
		assertTrue("El email está en la agenda", db.getAgenda().contains(email));
		assertEquals("La agenda tiene exactamente 1 email", 1, db.getAgenda().size());
		repositorio.almacenarEmail(email);
		assertEquals("La agenda tiene exactamente 1 email", 1, db.getAgenda().size());
	}

}
