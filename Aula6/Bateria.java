public class Bateria {

private String Descricao;
private int Voltagem;

public Bateria(String descricao, int voltagem) {
	super();
	Descricao = descricao;
	Voltagem = voltagem;
}

public String getDescricao() {
	return Descricao;
}

public void setDescricao(String descricao) {
	Descricao = descricao;
}

public int getVoltagem() {
	return Voltagem;
}

public void setVoltagem(int voltagem) {
	Voltagem = voltagem;
	}
}