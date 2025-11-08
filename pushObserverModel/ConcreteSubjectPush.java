package PushObserverModel;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubjectPush implements SubjectPush {
    private List<PushObserver> observers = new ArrayList<>();
    private String news;

    @Override
    public void addObserver(PushObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PushObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (PushObserver observer : observers) {
            observer.update(news);
        }
    }
}

