package transactionhistory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

import transaction.Transaction;

public class TransactionHistory implements List<Transaction> {
	
	private List<Transaction> transactions;
	
	public TransactionHistory() {
		this.transactions=new ArrayList<>();
	}
	
	@Override
	public synchronized boolean add(Transaction transaction) {
			return transactions.add(transaction);
	}
	
	@Override
	public synchronized Transaction get(int index) {
			return transactions.get(index);
	}
	
	@Override
	public  synchronized Transaction remove(int index) {
			return transactions.remove(index);
	}
	
	@Override
	public synchronized int size() {
			return transactions.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Transaction> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Transaction> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Transaction> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction set(int index, Transaction element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Transaction element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Transaction> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Transaction> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}


}
