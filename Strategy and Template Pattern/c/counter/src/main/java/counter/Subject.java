package counter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Subject {

    List<Observer> observerList;

    public Subject(){
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList = observerList.stream()
                .filter(o -> o.equals(observer)).collect(Collectors.toList());
    }

    public void notify_all(int count){
        observerList.forEach(o -> o.setCount(count));
    }

}
