package bank.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class SubjectAccountEntry {

    List<ObserverAccountEntry> observerList;

    public SubjectAccountEntry(){
        observerList = new ArrayList<>();
    }

    public void addObserver(ObserverAccountEntry observer){
        observerList.add(observer);
    }

    public void removeObserver(ObserverAccountEntry observer){
        observerList =  observerList.stream()
                .filter(o -> !o.equals(observer)).collect(Collectors.toList());
    }

    public void notify(double amount){
        observerList.forEach(o -> o.update(amount));
    }

}
