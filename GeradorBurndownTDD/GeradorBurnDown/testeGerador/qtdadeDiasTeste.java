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

//Teste n�o passa pois o resultado n�o est� de acordo com esperado (par�metros 
//haviam sido alterados anteriomente para que o teste falhasse  ).