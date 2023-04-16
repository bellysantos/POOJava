public class Aula6 {

public static void main(String[] args) {

Motor motor = new Motor("Motorzinho basico", 300);
Bateria bateria = new Bateria("Bateria daora", 200);
Carro carro = new Carro("Uno", motor, bateria);

Autor autor = new Autor("Neil Gaiman", 42);

System.out.println(carro.getNome());
System.out.println(motor.getDescricao());
System.out.println(bateria.getDescricao());
System.out.println(carro.getBateria().getDescricao());

Livro livro = new Livro(1300, "Coraline", "Intríseca", autor);
System.out.println(livro.getAutor().getNome() +  " - " + livro.getNome());
	}
}