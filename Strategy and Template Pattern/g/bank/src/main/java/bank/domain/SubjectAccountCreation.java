package bank.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class SubjectAccountCreation {
    List<ObserverAccountCreation> observerList;

    public SubjectAccountCreation(){
        observerList = new ArrayList<>();
    }

    public void addObserver(ObserverAccountCreation observer){
        observerList.add(observer);
    }

    public void removeObserver(ObserverAccountCreation observer){
        observerList =  observerList.stream()
                .filter(o -> !o.equals(observer)).collect(Collectors.toList());
    }

    public void notify(long amount){
        observerList.forEach(o -> o.update(amount));
    }
}
