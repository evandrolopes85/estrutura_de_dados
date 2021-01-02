package estudo.evandro.pilha;

public class Pilha {
	private int valores[];
	private int topo;
	
	public Pilha() {
		valores = new int[10];
		topo    = -1;
	}
	
	public void push(int elemento) {
		topo++;
		valores[ topo ] = elemento;
	}
	
	public int pop() {
		int elemento = valores[ topo ];
		topo--;
		return elemento;
	}
	
	
	public boolean isEmpty() {
		return (topo == -1);
	}
	
	public boolean isFull() {
		return (topo == 9);
	}
}
