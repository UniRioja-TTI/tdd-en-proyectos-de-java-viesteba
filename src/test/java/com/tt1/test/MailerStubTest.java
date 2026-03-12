package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailerStubTest {
	MailerStub mailer;
	String email, mensaje;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		mailer = new MailerStub();
		email = "lordOfTheStrings@domain.com";
		mensaje = "Another chance";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEnviarCorreo() {
		boolean resultado = mailer.enviarCorreo(email,mensaje);
		assertTrue(resultado, "El envío debería ser exitoso con datos válidos");
	}
	@Test
	void testEnviarCorreoDatosNulos() {
	    // Caso de error: Email nulo
	    assertFalse(mailer.enviarCorreo(null, mensaje), "No debería enviar con email nulo");
	    
	    // Caso de error: Mensaje nulo
	    assertFalse(mailer.enviarCorreo(email, null), "No debería enviar con mensaje nulo");
	}
	@Test
	void testEnviarCorreoDireccionVacia() {
	    // Caso de error: Email vacío
	    assertFalse(mailer.enviarCorreo("", mensaje), "No debería enviar con email vacío");
	}

}
