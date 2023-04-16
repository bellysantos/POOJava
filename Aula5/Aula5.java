// Main

public class Aula5 {
	public static void main(String[] args) {
		OvoPascoa ovo = new OvoPascoa(100.00f, Sabor.BRANCO); // New = Cria objeto na memória e chama o metódo construtor. Parâmetros garante que seja um método seja definido.
		
		// Estado do objeto = valores definidos
		
		System.out.println(ovo.getPreco());
		ovo.aplicarDescontoComPorcentagem(35);
		// ovo.aplicar20porcentoDesconto();
		System.out.println(ovo.getPreco());
		
		// System.out.printf("O novo valor é %.2f", ovo.getPreco());
		
		/*
		ovo.preco = 100.00f;
		ovo.sabor = "Ao leite";
		
		OvoPascoa ovo2 = new OvoPascoa();
		ovo2.preco = 15.00f;
		ovo2.sabor = "Branco";
		*/ 

		OvoPascoa ovo2 = new OvoPascoa(50, Sabor.AOLEITE);
		OvoPascoa ovo3 = new OvoPascoa(60, Sabor.MEIOAMEIO);
		
		System.out.println(OvoPascoa.getqtdOvos());
		System.out.println(ovo.getSabor());
	}
}

/* OvoPascoa ovo = new OvoPascoa(100.00, "Ao Leite")
	
OvoPascoa = Tipo da variável
ovo = Nome da variável
new OvoPascoa = Guarda o endereço de memória do objeto que foi criado, no caso objeto OvoPascoa */

//static = Pertence a classe (forma) e não aos objetos em si

/* Atributos e métodos static

   System.out.print(Math.pow(2, 3)); 
   System.out.print(Math.PI); - Os métodos são únicos, ou seja, não é necessário criar objetos para algo que existe
  
 */