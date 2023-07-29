package customers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AgeIterator implements Iterator<Customer> {

    private final List<Customer> list;
    private int position;

    public AgeIterator(List<Customer> list){
        this.list = list;
        list.sort((a, b) -> a.getAge() - b.getAge());
    }

    @Override
    public boolean hasNext(){
        return  position < list.size();
    }

    public Customer next(){
        return list.get(position++);
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
