package robustTransactionprocessor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import performancemonitor.PerformanceMonitor;
import transaction.Transaction;
import transactionhistory.TransactionHistory;
import transactionprocessor.TransactionConsumer;
import transactionprocessor.TransactionProducer;

public class RobustTransactionProcessor {
	
	private final BlockingQueue<Transaction> queue;
	private final TransactionHistory transactionhistory;
	private final PerformanceMonitor monitor;
	public RobustTransactionProcessor(int queueCapacity) {
		super();
		this.queue = new ArrayBlockingQueue<>(queueCapacity);
		this.transactionhistory = new TransactionHistory();
		this.monitor = new PerformanceMonitor(queue);
	}
	
	public void startProcessing(int producerCount, int consumerCount) {
		monitor.startMonitoring();
		for(int i=0;i<producerCount;i++) {
			new Thread(new TransactionProducer(queue)).start();
		}
		for(int i=0;i<consumerCount;i++) {
			new Thread(new TransactionConsumer(queue, transactionhistory)).start();
		}
	}
	
	

}
