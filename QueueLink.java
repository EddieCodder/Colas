
public class QueueLink<E> implements TDAQueue<E>{
	private Node<E> primero;
	private Node<E> ultimo;
	
	public QueueLink() {
		this.primero = null;
		this.ultimo = null;
	}

	public void enqueue(E x) {
		Node<E> newNode = new Node<E>(x);
		// Si la cola está vacía
		if (this.isEmpty()) {
			// El nuevo nodo es el primer y último elemento
			this.primero = this.ultimo = newNode;
		} else {
			this.ultimo.setNext(new Node<E> (x)); // Agregamos un elemento después de último
			this.ultimo = this.ultimo.getNext(); // El elemento agregado es el nuevo último
		}
	}

	public E dequeue() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Cola vacía ...");
		// Para el caso de solo un elemento
		if(this.primero == this.ultimo)
			this.ultimo = null;
		E item = this.primero.getData(); // Alamacena el valor del primero	
		this.primero = this.primero.getNext(); // Actualiza el primero de la fila
		return item;
	}

	public E front() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Cola vacía ...");
		return this.primero.getData();
	}

	public E back() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Cola vacía ...");
		return this.ultimo.getData();
	}

	public boolean isEmpty() {
		return this.primero == null;
	}
	
	public String toString() {
		String str = "";
		Node<E> aux = this.primero;
		while(aux != null) {
			str += aux.getData() + ", ";
			aux = aux.getNext();
		}
		// Si existen elementos que mostrar en la cola
		if (this.primero != null)
			str += "   --> Primero = " + this.primero.getData() +
			       ", Último = " + this.ultimo.getData();
		else
			System.out.println("Cola vacía");
		return str;
	}
}
