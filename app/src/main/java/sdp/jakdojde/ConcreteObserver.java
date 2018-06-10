package sdp.jakdojde;

public class ConcreteObserver  implements Observer {
    private String distance;
    @Override
    public void update(String distanceee) {
        distance = distanceee;
    }

}
