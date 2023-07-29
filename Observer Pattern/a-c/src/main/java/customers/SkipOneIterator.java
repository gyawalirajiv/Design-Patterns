package customers;

import java.util.Iterator;
import java.util.List;

public class SkipOneIterator implements Iterator<Customer> {

    private List<Customer> list;
    private int position;

    public SkipOneIterator(List<Customer> customers){
        this.list = customers;
    }

    @Override
    public boolean hasNext() {
        return position < list.size() - 1;
    }

    @Override
    public Customer next() {
        Customer customer = list.get(position);
        position += 2;
        return customer;
    }
}
