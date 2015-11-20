package testeGerador;

import static org.junit.Assert.*;

import org.junit.Test;

public class inicioTeste {
//teste que mostra o início do dia de trabalho
	@Test
	public void inicioteste() {
		MeuGeradorJunit junit = new MeuGeradorJunit();
		int result = junit.inicio(1);
		assertEquals(1,result);
	}

}


//Teste passa, pois o dia de início é o dia em que o trabalho realmente começou.