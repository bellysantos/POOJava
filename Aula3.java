import java.util.Scanner;

public class Aula3 {
	public static void main(String[] args) {
		/*
		 * Implemente um programa que receba a idade digitada pelo usuário, se a idade
		 * for menor ou igual a 10, apresenta a mensagem "Crianca", se a idade for menor
		 * ou igual a 17, mostre a mensagem "Adolescente", se a mensagem for maior ou
		 * igual a 18, apresenta a mensagem, "Adulto".
		 * 
		 * 
		 * int idade = 10; if(idade >= 18) { System.out.println("Sua idade é" + idade);
		 * } else { System.out.println("Você é menor de idade!"); }
		 */

		/*
		 * Encadeado
		 * 
		 * int idade = 15; if (idade > 0 && idade <= 10) {
		 * System.out.println("Criança"); }
		 * 
		 * if (idade > 10 && idade <= 17) { System.out.println("Adolescente"); }
		 * 
		 * if (idade >= 18) { System.out.println("Adulto"); }
		 */

		/*
		 * Cascata
		 * 
		 * int idade = new Scanner(System.in).nextInt(); if (idade > 0 && idade <= 10) {
		 * System.out.println("Criança"); } else if (idade > 10 && idade <= 17) {
		 * System.out.println("Adolescente"); } else if (idade >= 18) {
		 * System.out.println("Adulto"); } else {
		 * System.out.println("Digite uma idade válida:"); }
		 */

		
		//Estruturas de repetição/Vetor e Matriz
		
		/* while
		
		int acc = 0; // Condição inicial
		do {
			System.out.println(acc);
			acc++; // Incremento - passo
		} while(acc < 10); 
	} // Condição de parada
	*/
		/*
		int menu;
		do {
			System.out.println("Digite 1 para new game\n"
					+ "Digite 2 para load game\n"
					+ "Digite 3 para sair");
			menu = new Scanner(System.in).nextInt();
			switch (menu) {
			case 1: 
				System.out.println("Novo jogo!");
				break;
				
			case 2: 
				System.out.println("Jogo carregado");
			}
		} while(menu != 3); */
	
		/*
		for(int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
			System.out.println(i + " " + j);
		} */
		
		//int []numeros = new int[2];
		//int [] [] mat = new int[2] [2];


	    int[]numeros = {3, 4, 5, 19};
	    mostrarVetor(numeros);
		
	
		// Estático em tempo de compilação é definido o tamanho
	}
	
    public static void mostrarVetor(int vet[]) {
        for(int i = 0; i < vet.length; i++) 
        {
            System.out.println(vet[i]);
	    }
    }
}