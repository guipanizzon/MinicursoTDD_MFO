
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {
	//Calculadora calculadora; -> Ignore

	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 3;
		double soma = 0;
		Calculadora calculadora = new Calculadora();
		soma = calculadora.soma(valorA, valorB);
		assertEquals(4, soma, 0.00001);
	}

	/*  @Test
        public void nomeDoMetodoParaRealizarAOperacaoMultiplicacao() throws Exception{
        	//Implementação da função multiplicação
        }

        @Test void nomeDoMetodoParaRealizarAOperacaoSubtracao() throws Exception{
        	//Implementação da função subtração
        }

       @Test
       public void nomeDoMetodoParaRealizarAOperacaoDivisao() throws Exception{
    	   //Implementação da função divisão
       }
       @Test
       public void nomeDoMetodoParaCasoAcontecerUmaDivisaoPorZero() throws Exception{

       }
	 */


	/*	Exemplo do uso da anotação @before
	 *  @Before
             public void inicializa(){
             	this.calculadora = new Calculadora();
             }*/
}
