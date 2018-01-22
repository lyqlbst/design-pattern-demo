package visitorMode;

public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}  