package br.com.tpa.brackets;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest  {
	
	@Test
	public void caracteresCorrespondentes() {
		assertTrue(BracketValidator.validarOrdemCaracteres("(){}[]"));
	}
	
	@Test
	public void caracteresAninhadosCorrespondentes() {
		assertTrue(BracketValidator.validarOrdemCaracteres("[{()}](){}"));
	}
	
	@Test
	public void caracteresNaoCorrespontes() {
		assertFalse(BracketValidator.validarOrdemCaracteres("[]{()"));
	}
	
	@Test
	public void caracteresAninhadosNaoCorrespondentes() {
		assertFalse(BracketValidator.validarOrdemCaracteres("[{)]"));
	}
    
	@Test
	public void caracteresInvalidos() {
		assertFalse(BracketValidator.validarOrdemCaracteres("(a){1}[]"));
	}
	
	@Test
	public void entradaSomenteEspaco() {
		assertFalse(BracketValidator.validarOrdemCaracteres(" "));
	}
	
	@Test
	public void entradaNula() {
		assertFalse(BracketValidator.validarOrdemCaracteres(null));
	}
}
