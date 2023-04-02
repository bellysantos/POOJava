import java.util.Scanner;

public class Aula2 {
	public static void main(String [] args) {
		
		/* Este é um exemplo de declaração de variáveis em Java. Existem diferentes tipos de variáveis, como int, 
		boolean, float, double, String, char, entre outros. Uma variável é um espaço reservado na memória que é usado para 
		armazenar um valor. Analogamente, podemos comparar uma variável a uma caixa, onde seu tamanho é definido pelo tipo 
		de dado que ela pode armazenar. Quanto maior o valor armazenado na variável, maior a "caixa" necessária para armazená-lo. */
		
		int valor = 10; // Exemplo de variável do tipo inteiro
		
		boolean ehVerdade = false; // Exemplo de variável do tipo booleano
		
		float valor2 = 1.2f; // Exemplo de variável do tipo float
		
		double valor3 = 2.0; // Exemplo de variável do tipo double
		
		String nome = "Fulano"; // Exemplo de variável do tipo String, que gerencia vetores de caracteres. Exemplo: char nome2[] = {'i', 's', 'a'};
		
		char c = 'f'; // Exemplo de variável do tipo char, que armazena um único caractere.
	
		Scanner s = new Scanner(System.in); // Criação de um objeto Scanner para ler a entrada do usuário.
		nome = s.nextLine(); // Lê uma linha de texto da entrada do usuário e armazena na variável nome.
		System.out.println("Seja bem vindo: " + nome); // Exibe uma mensagem de boas-vindas com o nome informado pelo usuário.
		
		/* Estruturas de Controle: As estruturas de controle permitem controlar o fluxo de execução do programa. 
		Existem diferentes tipos de estruturas de controle, como a decisão simples, composta, podendo ser encadeada e cascateada. 
		
		int idade = 10;
		if(idade >= 18) { // Exemplo de estrutura de decisão simples. Se a idade for maior ou igual a 18, exibe a mensagem de que a idade é válida.
			System.out.println("Sua idade é" + idade);
		} else { // Caso contrário, exibe a mensagem de que a pessoa é menor de idade.
			System.out.println("Você é menor de idade!");
		} */
	}
}

/*
	O método main inicia o programa em Java.
	
	Em Java, desenvolvemos classes e métodos que podem ser utilizados dentro do método main para resolver problemas específicos.
	
	O array de strings args é um parâmetro do método main que permite passar argumentos para o programa por meio de sua execução binária.
	
	I/O significa "input/output", que se refere à entrada e saída de dados do programa. 
	Isso inclui tanto o teclado quanto o console.

	O objeto Scanner é uma ferramenta em Java que permite a leitura de dados inseridos pelo usuário através do teclado, e é equivalente ao scanf em C.

	O atalho de teclado Ctrl + Shift + O é utilizado para importar automaticamente as bibliotecas necessárias para o código, como a biblioteca java.util.Scanner neste exemplo.
*/