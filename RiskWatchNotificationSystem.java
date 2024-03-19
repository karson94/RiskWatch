import java.util.List;
import java.util.ArrayList;

@Override
public void update(String message) {
    System.out.println(name + " received a notification: " + message);
}

public class RiskWatchNotificationSystem {

    // Subject class

    private List<Notifier> notifiers = new ArrayList<>();

    public void registerNotifier(Notifier notifier) {
        notifiers.add(notifier);
    }

    public void unregisterNotifier(Notifier notifier) {
        notifiers.remove(notifier);
    }

    public void notifyNotifiers(String message) {
        for (Notifier notifier : notifiers) {
            notifier.update(message);
        }
    }

}