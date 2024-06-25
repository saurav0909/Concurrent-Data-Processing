package transaction;

import java.util.concurrent.atomic.AtomicLong;

public class Transaction {
	
	private static final AtomicLong idGenerator=new AtomicLong();
	private final String transactionID;
	private final	long timestamp;
	private final String transactionType;
	private final double amount;
	
	
	public Transaction(String transactionType, double amount) {
		this.transactionID = "TXN" +idGenerator.incrementAndGet();
		this.timestamp = System.currentTimeMillis();
		this.transactionType = transactionType;
		this.amount = amount;
	}
	
		public static AtomicLong getIdgenerator() {
		return idGenerator;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public double getAmount() {
		return amount;
	}

		@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", timestamp=" + timestamp + ", transactionType="
				+ transactionType + ", amount=" + amount + "]";
	}
	
	
	
	


}
