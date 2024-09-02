package model;

import java.util.ArrayList;
import java.util.List;
import observer.InterestedParty;

public class Document {

  private String content;
  private List<InterestedParty> interestedParties = new ArrayList<>();

  public Document(String content) {
    this.content = content;
  }

  public void changeContent(String newContent) {
    this.content = newContent;
    notifyInterestedParties();
  }

  public void registerInterestedParty(InterestedParty interestedParty) {
    interestedParties.add(interestedParty);
  }

  public void unregisterInterestedParty(InterestedParty interestedParty) {
    interestedParties.remove(interestedParty);
  }

  private void notifyInterestedParties() {
    for (InterestedParty interestedParty : interestedParties) {
      interestedParty.notify(content);
    }
  }
}