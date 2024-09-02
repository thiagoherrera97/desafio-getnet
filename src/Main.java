import model.Document;
import observer.NotificationSystem;

public class Main {

  public static void main(String[] args) {

    Document document = new Document("Initial content");

    NotificationSystem system1 = new NotificationSystem("System 1");
    NotificationSystem system2 = new NotificationSystem("System 2");

    document.registerInterestedParty(system1);
    document.registerInterestedParty(system2);

    document.changeContent("New document content");

    document.unregisterInterestedParty(system1);

    document.changeContent("Another new document content");
  }
}
