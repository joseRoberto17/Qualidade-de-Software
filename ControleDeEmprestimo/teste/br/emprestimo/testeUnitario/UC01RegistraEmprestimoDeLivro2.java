package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;

public class UC01RegistraEmprestimoDeLivro2 {

	@Test
	public void CT01verificarSeAdataDeEntregaDomingo() {
		// cenario
		String data = "20/05/2018";
		Emprestimo e = new Emprestimo();
		
		//a��o
		boolean result = e.Domingo(data);
		
		//verifica��o
		assertTrue(result);
	}

}
