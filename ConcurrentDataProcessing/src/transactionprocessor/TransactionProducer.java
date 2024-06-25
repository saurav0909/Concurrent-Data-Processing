package transactionprocessor;

import java.util.concurrent.BlockingQueue;

import transaction.Transaction;

public class TransactionProducer implements Runnable{
	
	private final BlockingQueue<Transaction> queue;

	public TransactionProducer(BlockingQueue<Transaction> queue) {
		super();
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Transaction transaction=new Transaction("Type", Math.random()*1000);
				queue.put(transaction);
				System.out.println("Produced:"+transaction);
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		}
	}

}
