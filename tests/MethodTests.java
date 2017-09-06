import com.company.EventLog;
import com.company.Event;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MethodTests {

  @Rule //Another annotation directed to JUnit
  public ExpectedException expected = ExpectedException.none();

  @Test
  public void name() throws Exception {
  }

  @Test
  public void testIncompleteEvent() throws IllegalArgumentException {
      System.out.println("running incomplete event test");
      expected.expect(IllegalArgumentException.class);
      EventLog log = new EventLog();
      assertTrue(log.addEvent(null));
      assertTrue(log.addEvent(new Event("mufasa",null)));
  }

@Test
public void testCompleteEvent() {
  System.out.println("running complete event test");
  EventLog log = new EventLog();
  assertTrue(log.addEvent(new Event("party","jumping")));
  }
}


