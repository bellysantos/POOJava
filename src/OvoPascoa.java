// Classe

public class OvoPascoa {
	private float preco;
	private Sabor sabor;
	
	private static int qtdOvos; // Se deixar público alguém pode zerar os valores
	
	
	public OvoPascoa(float preco, Sabor sabor) { 
		this.preco = preco; // this significa o contexto, escopo no qual o comando se encontra. Ex. OvoPascoa.preco
		this.sabor = sabor;
		this.qtdOvos ++; // Incrementa os new Ovos de Pascoa 
		
		// Compilador define um método construtor vazio, método é uma função 
	}
	
	public void aplicarDescontoComPorcentagem(int porcentagem) {
		float desconto = this.preco / 100 * porcentagem;
		this.preco = this.preco - desconto;
	}
	
	public void aplicar20porcentoDesconto() { 
		this.preco = this.preco * 0.8f; // Valor com novo desconto
		}
	
	public float getPreco() {
		return this.preco; // Retorna o preço atual ou retorna o valor
	}
	
	static int getqtdOvos() {
		return qtdOvos;
	}
	
	public Sabor getSabor() {
		return this.sabor;
	}
}

// Enumerador = Rótulos: Todo enumerador pertence ao conjunto dos inteiros.