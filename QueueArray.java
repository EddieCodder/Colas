
public class QueueArray<E> implements TDAQueue<E>{
	private int primero;
	private int ultimo;
	private E[] array;
	private int numElementos;
	private int espaciosDisponibles;
	
	public QueueArray(int n) {
		this.array = (E[]) new Object[n];
		// Ambos empiezan en el mismo índice
		this.primero = -1;
		this.ultimo = -1;
		this.numElementos = this.array.length;
		this.espaciosDisponibles = this.array.length; // valor que irá cambiando
	}

	public void enqueue(E x) {
		// Si la cola está vacía, el primero y el último se incrementan
		if (this.isEmpty()) {
			this.array[++primero] = x; //Primero incrementamos y luego usamos
			ultimo++;
			espaciosDisponibles--;
		} else {
			if (espaciosDisponibles == 0) // Si la cola está llena
				System.out.println("Cola llena");
			else {
				// Para que la cola sea circular
				ultimo = ( ultimo + 1 ) % numElementos; 
				this.array[ultimo] = x; 
				espaciosDisponibles--;
			}	
		}		
	}

	public E dequeue() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Cola vacía ...");
		E item = this.array[primero];
		this.array[primero] = null;
		// Para que la cola sea circular
		primero = ( primero + 1 ) % numElementos;
		espaciosDisponibles++;
		return item;
	}

	public E front() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Cola vacía ...");
		return this.array[primero];
	}

	public E back() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Cola vacía ...");
		return this.array[ultimo];
	}

	public boolean isEmpty() {
		return this.espaciosDisponibles == this.array.length;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < numElementos; i++)
			if (this.array[i] != null)
				str += "[" + this.array[i] + "], ";
			else
				str += "[   ], ";
		str += "\t---> Primero = " + this.array[primero] + "(pos:" + this.primero+")" + 
			   ", Último = "+ this.array[ultimo] + "(pos:" + this.ultimo+")" +
			   ", Espacios disponibles = " + espaciosDisponibles;
		return str;
	}
	
	
}
