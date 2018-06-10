package sdp.jakdojde;

import java.util.ArrayList;

public interface Subject {
    public void attach(ConcreteObserver observer);
    public void detach(ConcreteObserver observer);
    public void notifyObservators ();
}
