package PullObserverModel;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectPull implements SubjectPull {
    private List<PullObserver> observers = new ArrayList<>();
    private String news;

    @Override
    public void addObserver(PullObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PullObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public String getNews() {
        return news;
    }

    private void notifyObservers() {
        for (PullObserver observer : observers) {
            observer.update();
        }
    }
}
