package PullObserverModel;

public interface SubjectPull {
    void addObserver(PullObserver observer);
    void removeObserver(PullObserver observer);
    String getNews();
    void setNews(String news);
}
