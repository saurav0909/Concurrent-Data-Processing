package performancemonitor;

import java.util.concurrent.BlockingQueue;

import java.util.concurrent.atomic.AtomicLong;

import transaction.Transaction;

public class PerformanceMonitor {
	
	private final BlockingQueue<Transaction> queue;
	private final AtomicLong totalProcessingTime;
	private final AtomicLong transactionCount;
	
	public PerformanceMonitor(BlockingQueue<Transaction> queue) {
		this.queue=queue;
		this.totalProcessingTime=new AtomicLong();
		this.transactionCount=new AtomicLong();
	}

	public void startMonitoring() {
        new Thread(() -> {
            while (true) {
                long avgProcessingTime = totalProcessingTime.get() / transactionCount.get();
                System.out.println("Queue size: " + queue.size());
                System.out.println("Average processing time: " + avgProcessingTime + " ms");
                try {
                    Thread.sleep(1000); // Monitor every second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();

	}

}
