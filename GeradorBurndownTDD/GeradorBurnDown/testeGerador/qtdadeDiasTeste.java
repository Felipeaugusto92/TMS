package testeGerador;

import static org.junit.Assert.*;

import org.junit.Test;

public class qtdadeDiasTeste {
//Teste exemplifica quantos dias duraram os trabalhos 
	@Test
	public void qtdadeDiasteste() {
		MeuGeradorJunit junit = new MeuGeradorJunit();
		int result = junit.qtdadeDias(30,1);
		assertEquals(29,result);
	}

}

//Teste não passa pois o resultado não está de acordo com esperado (parâmetros 
//haviam sido alterados anteriomente para que o teste falhasse  ).