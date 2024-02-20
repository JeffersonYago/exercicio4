package main;

import controller.NegativosController;

public class Main {

	public static void main(String[] args) {
		NegativosController nController = new NegativosController();
		int[] vet = {1, -2, 3, -4, 5, -6, 7};
		int tamanho = vet.length-1;
		int cont = 0;
		System.out.println(nController.negativosCont(vet, tamanho, cont));

	}

}
