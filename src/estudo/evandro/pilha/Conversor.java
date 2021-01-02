package estudo.evandro.pilha;

public class Conversor {

	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);

		Pilha p = new Pilha();

		int resto;

		// fase 1 - empilhamento dos restos
		while (numero != 0) {
			resto = numero % 2;
			p.push(resto);
			numero = numero / 2;
		}

		// fase 2 - exibição dos restos
		while (!p.isEmpty()) {
			resto = p.pop();
			System.out.print(resto);
		}

		System.out.println("\nfim do programa");
	}

}
