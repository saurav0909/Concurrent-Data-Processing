package transactionprocessor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import transaction.Transaction;
import transactionhistory.TransactionHistory;

public class TransactionProcessor {
	private final BlockingQueue<Transaction> queue;
	private final TransactionHistory transactionHistory;
	
	public TransactionProcessor(int queueCapacity) {
		this.queue=new ArrayBlockingQueue<>(queueCapacity);
		this.transactionHistory=new TransactionHistory();
	}
	
	public void startProcessing(int producerCount, int consumerCount) {
		for(int i=0;i<producerCount;i++) {
			new Thread(new TransactionProducer(queue)).start();
		}
		for(int i=0;i<consumerCount;i++) {
			new Thread(new TransactionConsumer(queue, transactionHistory)).start();
		}
	}

}
