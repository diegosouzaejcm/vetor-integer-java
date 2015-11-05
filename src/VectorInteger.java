
public class VectorInteger {
	
	//-------------------------------CONSTRUTOR---------------------------------

  private Integer[] vetor;

  public VectorInteger( int tamanhoInicial ) {
    vetor = new Integer[tamanhoInicial];

    for( int i = 0; i < vetor.length; i++ )
        vetor[i] = 0;
    
  }
  
	//--------------------------------------------------------------------------

	//-----------------------------MÉTODO SIZE----------------------------------
  	//----------------------retorna o tamanho do array--------------------------
  
  public int size() { 
	  return vetor.length; 
  } 
  
	//--------------------------------------------------------------------------

	//----------------------------MÉTODO RESIZE---------------------------------
  	//----------------------altera o tamanho do array---------------------------
  
  public void resize( int novoTamanho ) {
	  Integer[] novoVetor = new Integer[novoTamanho];
	  int menor = (novoTamanho < vetor.length ? novoTamanho : vetor.length);

	  for( int i = 0; i < menor; i++ )
	    novoVetor[i] = vetor[i];

	  vetor = novoVetor;
	}
  
	//--------------------------------------------------------------------------
  
	//----------------------------MÉTODO IMPRIME--------------------------------
  	//---------------------------imprime o array--------------------------------
  
  public void imprimeVetor (){	  
	  for( int i = 0; i < vetor.length; i++ )
		  System.out.println("posicão " + i + " - " + vetor[i]);
  }
  
	//--------------------------------------------------------------------------
  
	//----------------------------MÉTODO MUDA-----------------------------------
  	//-------------muda o valor de determinada posição do array-----------------
  
  public void mudaValor (int posicao, int valor) throws VetorIndexOutOfBoundsException{	  
	  if (posicao >= 0 && posicao<vetor.length)
		  vetor[posicao] = valor;
	else
			 throw new VetorIndexOutOfBoundsException("A posição não existe no array!"); 
	  }
  
	//--------------------------------------------------------------------------
  
	//----------------------------MÉTODO LOCAL----------------------------------
  	//-------------------mostra o valor naquela posição-------------------------

	public Integer at (int posicao) throws  VetorNullPointerException {

		if (vetor[posicao] != null)
			return vetor[posicao];
		else
			 throw new VetorNullPointerException("A posição " + posicao + " está definida como null!");
	}
	
	//--------------------------------------------------------------------------
	  
	//----------------------------MÉTODO FIND----------------------------------
  	//----------procura o valor no array e retorna a posição-------------------

	public Integer find(int valor) {
		int posicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				posicao = i;
				return posicao;
			} 
			else
				posicao = -1;
		}
		return posicao;
	}
	
	//--------------------------------------------------------------------------
	  
	//----------------------------MÉTODO SORT----------------------------------
  	//-----------------ordena o  array de forma crescente----------------------

	public void sort() {
		int aux = 0;
		for(int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}
	
	//--------------------------------------------------------------------------
	  
	//-------------------------MÉTODO INTERSEÇÃO--------------------------------
  	//--------------retorna a interseção entre 2 vetores------------------------

//	public void intersecao(VectorInteger v2) {
//		int numero;
//		int posicao=0;
//		int tamanhoMaximo;
//		
//		if(vetor.length > v2.vetor.length){
//			tamanhoMaximo = v2.vetor.length;
//			Integer[] vetorIntersecao = new Integer[tamanhoMaximo];
//			
//			for(int i = 0; i < vetor.length; i++){
//				for(int j = 0; j < v2.vetor.length; j++){
//					if(vetor[i] == v2.vetor[j]){
//						numero = vetor[i];
//						vetorIntersecao[posicao] = numero;
//						posicao++;
//					} else
//						vetorIntersecao[posicao] = 0;
//				}
//			}
//			
//			for (int k=0; k < vetorIntersecao.length; k++){
//				  System.out.println(vetorIntersecao[k]);
//			}
//		}
//		
//		else{
//			tamanhoMaximo = vetor.length;
//			Integer[] vetorIntersecao = new Integer[tamanhoMaximo];
//		
//			for(int i = 0; i < v2.vetor.length; i++){
//				for(int j = 0; j < vetor.length; j++){
//					if(v2.vetor[i] == vetor[j]){
//						numero = vetor[i];
//						vetorIntersecao[posicao] = numero;
//						posicao++;
//						
//					} else
//						vetorIntersecao[posicao] = 0;
//				}
//			}
//			
//			for (int k=0; k < vetorIntersecao.length; k++){
//				  System.out.println(vetorIntersecao[k]);
//			}
//		}
//			
//	}
	
	//--------------------------------------------------------------------------
  
}
