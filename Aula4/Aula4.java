public class Aula4 {
	public static void main(String[] args) {
		OvoPascoa ovo = new OvoPascoa(100.00f, "Ao Leite"); // Endereço de memória
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
		
	}

}