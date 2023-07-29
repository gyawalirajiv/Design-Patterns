package customers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	AgeIterator ageIterator;
	
	public void add(Customer customer) {
		customers.add(customer);
	}

	public Iterator<Customer> getAgeIterator(){
		return new AgeIterator(customers);
	}

	public Iterator<Customer> getAddressFilterIterator(Predicate<Customer> predicate){
		return new AddressFilterIterator(this.customers, predicate);
	}

	public Iterator<Customer> getSkipOneIterator(){
		return new SkipOneIterator(this.customers);
	}
	
	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
