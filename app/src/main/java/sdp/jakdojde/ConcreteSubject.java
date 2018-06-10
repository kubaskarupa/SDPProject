package sdp.jakdojde;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private double distance;
    private ArrayList<Observer> observers;




    @Override
    public void attach(ConcreteObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ConcreteObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservators() {
for (int i=1; i<=observers.size(); i++){
    observers.get(i).update(new String("cos"));
}
    }
}
