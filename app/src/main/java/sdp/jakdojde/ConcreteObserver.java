package sdp.jakdojde;

import android.widget.TextView;

public class ConcreteObserver  implements Observer {
    TextView textView = null;
    private String distance;
    @Override
    public void update(String distanceee) {
        distance = distanceee;
        updateTextView(distance);
    }
    public void updateTextView(String toThis) {

        textView = (TextView) textView.findViewById(R.id.textView2);
        textView.setText(toThis);
    }

}
