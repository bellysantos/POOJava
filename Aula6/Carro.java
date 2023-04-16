public class Carro {

private String Nome;
private Motor Motor;
private Bateria Bateria;

public Carro(String nome, Motor motor, Bateria bateria) {
	super();
	Nome = nome;
	Motor = motor;
	Bateria = bateria;
}

public String getNome() { // Acessar
	return Nome;
}

public void setNome(String nome) { // Mudar
	Nome = nome;
}

public Motor getMotor() {
	return Motor;
}

public void setMotor(Motor motor) {
	Motor = motor;
}

public Bateria getBateria() {
	return Bateria;
}

public void setBateria(Bateria bateria) {
	Bateria = bateria;
	}
}