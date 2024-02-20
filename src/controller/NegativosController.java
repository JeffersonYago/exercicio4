package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}
	public int negativosCont(int[]vet, int tamanho, int cont) {
		if(tamanho == 0) {
//é feita a interrupção da chamada pois tamanho é utilizado como parâmetro para acessar as posições do vetor, e não existem posições negativas
			return cont;
		}else {
			if(vet[tamanho] < 0) {
				cont = cont + 1;
			}
			return negativosCont(vet, tamanho - 1, cont);
//é subtraido 1 de tamanho para continuar percorrendo o vetor
		}
		
	}
}
