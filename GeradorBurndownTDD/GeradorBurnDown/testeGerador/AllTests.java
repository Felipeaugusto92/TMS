package testeGerador;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//Testa todas as classes ao mesmo tempo
@RunWith(Suite.class)
@SuiteClasses({ fimTeste.class, inicioTeste.class, qtdadeDiasTeste.class })
public class AllTests {

}

//Teste n�o passa, pois par�metro da classe "fim teste" foi colocado de forma inadequada 
//para que teste falhasse.