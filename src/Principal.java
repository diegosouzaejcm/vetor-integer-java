
public class Principal {

	/*Exercicio:
	 * 
	 * Criar uma classe Vetor de Inteiros (Integer): 
	 * 1) O construtor deve receber o tamanho inicial 
	 * 2) Todos os inteiros devem ser inicializados com null 
	 * 3) crie um m�todo que altere o tamanho do vetor (para mais ou para menos) 
	 * 4) Crie um m�todo que retorne o tamanho do vetor 
	 * 5) Crie m�todos para ler e escrever valores em uma determinada posi��o 
	 * 6) Se um �ndice fora do vetor for usado deve disparar uma exce��o
	 * ArrayIndexOutOfBounds dizendo qual o �ndice.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * Fa�a as seguintes altera��es na sua classe Vetor:
	 * 
	 * 1) Crie uma classe VetorIndexOutOfBoundsException. O cabe�alho dessa classe ser�:
	 * class VetorIndexOutOfBoundsException extends Exception {
	 * ...
	 * }
	 * 
	 * 2) Essa classe deve ter apenas um construtor que recebe uma mensagem (string) e armazena essa mensagem da seguinte forma:
	 * 
	 * public VetorIndexOutOfBoundsException( String msg ) {
	 *  super( msg );
	 * }
	 * super � uma forma de chamar um m�todo da classe "pai" (Exception). Nesse caso, o construtor.
	 * 
	 * 3) Troque as exce��es lan�adas pelo seu vetor por essa. O que acontece?
	 * 
	 * 4) Crie uma outra Exce��o, o VetorNullPointerException, da mesma forma. 
	 * 
	 * 5) Dispare essa exce��o sempre que um m�todo tentar ler uma posi��o que cont�m null.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * Criar os seguintes m�todos:
	 * 
	 * 1) v.find( 432 ) ==> retorna a posicao onde est� o valor 
	 * passado como parametro (432) vetor, ou -1 se esse elemento
	 * n�o est� no vetor.
	 * 
	 * 2) v.sort() => ordena o vetor (pode ser usando o buble sort, 
	 * quick sort, * sort  ou a biblioteca do Java)
	 * 
	 * 3) v1.intersecao( v2 ) => retorna um vetor contendo a  intersecao de v1 e v2.  
	 * Considere que h� elementos repetidos, e nesse caso a
	 * interse��o deve ser usando a seguinte conven��o: se um valor
	 * x se repete n vezes em v1 e m vezes em v2, na interse��o
	 * o ele deve aparecer min( m, n ) vezes.
	 */

	public static void main(String[] args) throws VetorNullPointerException, VetorIndexOutOfBoundsException {
		VectorInteger v = new VectorInteger(25);
		VectorInteger v2 = new VectorInteger(20);

		System.out.println("Tamanho do array: " + v.size());
		v.resize(20);
		System.out.println("Novo tamanho do array: " + v.size());
		
		v.mudaValor(1,696969);

		v.imprimeVetor();
			
		System.out.println("Valor na posi��o desejada: " + v.at(1));
	
		System.out.println("Posi��o do array em que o valor desejado se encontra: " + v.find(696969));
		
		v.sort();
			
		v.imprimeVetor();
		
		v2.mudaValor(4, 696969);
		
		v2.imprimeVetor();
			
//		v.intersecao(v2);
		
	}
}
