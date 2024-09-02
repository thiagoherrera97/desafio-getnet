package observer;

public class NotificationSystem implements InterestedParty {

  private String name;

  public NotificationSystem(String name) {
    this.name = name;
  }

  @Override
  public void notify(String content) {
    System.out.println(name + " notified. New content: " + content);
  }
}
