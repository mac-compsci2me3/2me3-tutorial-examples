package PushObserverModel;

public interface SubjectPush {
    void addObserver(PushObserver observer);
    void removeObserver(PushObserver observer);
    void setNews(String news);
}
