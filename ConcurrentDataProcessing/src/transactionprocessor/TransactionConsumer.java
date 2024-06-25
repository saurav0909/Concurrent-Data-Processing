package transactionprocessor;

import java.util.concurrent.BlockingQueue;

import transaction.Transaction;
import transactionhistory.TransactionHistory;

public class TransactionConsumer implements Runnable{
		private final BlockingQueue<Transaction> queue;
		private final TransactionHistory history;
		public TransactionConsumer(BlockingQueue<Transaction> queue, TransactionHistory history) {
			
			this.queue = queue;
			this.history = history;
		}
		
		@Override
        public void run() {
            while (true) {
                try {
                    Transaction transaction = queue.take();
                    System.out.println("Consumed: " + transaction);
                    history.add(transaction);
                    Thread.sleep(50); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
		
}
