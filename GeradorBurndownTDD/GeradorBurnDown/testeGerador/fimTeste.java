package testeGerador;

import static org.junit.Assert.*;

import org.junit.Test;

public class fimTeste {
//Teste verifica se trabalhos s�o iguais (terminaram no tempo esperado)
	@Test
	public void fimteste() {
		MeuGeradorJunit junit = new MeuGeradorJunit();
		int result = junit.inicio(30);
		assertEquals(30,result);	
	}

}

// Teste passa, pois tempos (valores) s�o iguais