package com.tt1.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServicioTest {
	ToDo tarea;
	DBStub db;
	Repositorio repo;
	MailerStub mailer;
	Servicio serv;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tarea = new ToDo("CTAN","Buscar paquetes",System.currentTimeMillis()+1000,false);
		db = new DBStub();
		repo = new Repositorio(db);
		mailer = new MailerStub();
		serv = new Servicio(repo,mailer);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testServicio() {
		String nombre; 
	}

	@Test
	public void testAnadirTarea() {
		fail("Not yet implemented");
	}

	@Test
	public void testAnadirDireccion() {
		fail("Not yet implemented");
	}

	@Test
	public void testMarcarCompletada() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarPendientes() {
		fail("Not yet implemented");
	}

}
