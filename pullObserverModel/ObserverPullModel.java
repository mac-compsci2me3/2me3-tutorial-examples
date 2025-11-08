package PullObserverModel;

public class ObserverPullModel implements PullObserver {
    private String news;
    private SubjectPull subject;

    public ObserverPullModel(SubjectPull subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.news = subject.getNews();
        display();
    }

    public void display() {
        System.out.println("Latest News (Pull Model): " + news);
    }
}
