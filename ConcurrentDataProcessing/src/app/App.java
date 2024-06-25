package app;

import robustTransactionprocessor.RobustTransactionProcessor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobustTransactionProcessor processor=new RobustTransactionProcessor(10);
		processor.startProcessing(5, 5);
	}

}
