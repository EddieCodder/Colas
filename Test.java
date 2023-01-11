public class Test {
	
	public static void main(String[] args) {
//		// QUEUE - ARREGLOS
//		TDAQueue<Integer> queue_array = new QueueArray<Integer>(5);
//		queue_array.enqueue(23);
//		System.out.println(queue_array);
//		queue_array.enqueue(15);
//		System.out.println(queue_array);
//		queue_array.enqueue(4);
//		System.out.println(queue_array);
//		queue_array.enqueue(17);
//		System.out.println(queue_array);
//		queue_array.enqueue(21);
//		System.out.println(queue_array);
//	
//		// Cola llena
//		queue_array.enqueue(45);
//		System.out.println(queue_array);
//		
//		
//		try {
//		
//		System.out.println("\nUSANDO ENQUEUE\nValor extraído: " + queue_array.dequeue());
//		System.out.println(queue_array);
//		System.out.println("\nUSANDO ENQUEUE\nValor extraído: " + queue_array.dequeue());
//		System.out.println(queue_array);
//		
//		//ENCOLANDO DE NUEVO 
//		System.out.println("\nENCOLANDO DE NUEVO");
//		queue_array.enqueue(100);
//		System.out.println(queue_array);
//		queue_array.enqueue(200);
//		System.out.println(queue_array);
//		queue_array.enqueue(300);
//		System.out.println(queue_array);
//
//		// MOSTRANDO FRONT Y BACK
//		System.out.println("\nUSANDO FRONT\nPrimero en la cola : " + queue_array.front());
//		System.out.println(queue_array);
//		System.out.println("\nUSANDO BACK\nÚltimo en la cola: " + queue_array.back());
//		System.out.println(queue_array);
//
//		} catch (ExceptionIsEmpty e) {
//			System.out.println(e.getMessage());
//		}
		
		// QUEUE - LISTAS ENLAZADAS
		TDAQueue<Integer> queue_link = new QueueLink<Integer>();
		queue_link.enqueue(23);
		System.out.println(queue_link);
		queue_link.enqueue(15);
		System.out.println(queue_link);
		queue_link.enqueue(4);
		System.out.println(queue_link);
		queue_link.enqueue(17);
		System.out.println(queue_link);
		queue_link.enqueue(21);
		System.out.println(queue_link);
		
		try {
		
//		System.out.println("\nUSANDO ENQUEUE\nValor extraído: " + queue_link.dequeue());
//		System.out.println(queue_link);
//		System.out.println("\nUSANDO ENQUEUE\nValor extraído: " + queue_link.dequeue());
//		System.out.println(queue_link);
//		
//		//ENCOLANDO DE NUEVO 
//		System.out.println("\nENCOLANDO DE NUEVO");
//		queue_link.enqueue(100);
//		System.out.println(queue_link);
//		queue_link.enqueue(200);
//		System.out.println(queue_link);
//		queue_link.enqueue(300);
//		System.out.println(queue_link);
//
//		// MOSTRANDO FRONT Y BACK
//		System.out.println("\nUSANDO FRONT\nPrimero en la cola : " + queue_link.front());
//		System.out.println(queue_link);
//		System.out.println("\nUSANDO BACK\nÚltimo en la cola: " + queue_link.back());
//		System.out.println(queue_link);
			
			TDAQueue<Character> q = new QueueArray<Character>(11);
			for(int i=65;i<73;i++)
			     q.enqueue((char)i);
			System.out.println(q.dequeue());//------ ---- //A
			q.dequeue();
			q.enqueue('j');
			q.enqueue((char)(100+7));
			System.out.println(q.front());
			System.out.println(q.dequeue());
			for(int i=0;i<4;i++)
			     q.enqueue((char)(74+i));
			System.out.println(q.back());
//			while(!q.front().equals((char)72))
//			     System.out.println(q.dequeue());
//			q.enqueue('X');
			                                           //B

		} catch (ExceptionIsEmpty e) {
			System.out.println(e.getMessage());
		}
	
		
		
	}
}
