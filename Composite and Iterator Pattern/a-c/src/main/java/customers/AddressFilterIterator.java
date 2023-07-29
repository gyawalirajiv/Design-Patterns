package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AddressFilterIterator implements Iterator<Customer> {

    public final List<Customer> list;
    public int position;

    public AddressFilterIterator(List<Customer> list, Predicate<Customer> predicate){
        this.list = list.stream()
                .filter(predicate).collect(Collectors.toList());

    }

    @Override
    public boolean hasNext(){
        return position < list.size();
    }

    @Override
    public Customer next(){
        return list.get(position++);
    }

}
