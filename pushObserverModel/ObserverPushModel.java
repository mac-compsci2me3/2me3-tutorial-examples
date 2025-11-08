package PushObserverModel;

public class ObserverPushModel implements PushObserver {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        display();
    }

    public void display() {
        System.out.println("Latest News (Push Model): " + news);
    }
}
