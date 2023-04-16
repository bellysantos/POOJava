public class Motor {

private String Descricao; // String não é um tipo de dado primitivo
private int Potencia; // int é um tipo de dado primitivo

public Motor(String descricao, int potencia) {
	super();
	Descricao = descricao;
	Potencia = potencia;
}

public String getDescricao() {
	return Descricao;
}

public void setDescricao(String descricao) {
	Descricao = descricao;
}

public int getPotencia() {
	return Potencia;
}

public void setPotencia(int potencia) {
	Potencia = potencia;
	}
}