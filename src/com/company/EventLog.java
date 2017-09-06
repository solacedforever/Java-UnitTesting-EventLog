package com.company;
import java.util.List;

public class EventLog {

  private List<Event> eventList;

  public boolean addEvent(Event event) throws IllegalArgumentException {
    if (event == null || event.getName() == null || event.getAction() == null)
    {
      throw new IllegalArgumentException();
    }else {
      System.out.println(event);
      eventList.add(event);
      return true;
    }
  }

  public int getNumEvents() {
    return eventList.size();
  }

  public EventLog() {

  }

}
