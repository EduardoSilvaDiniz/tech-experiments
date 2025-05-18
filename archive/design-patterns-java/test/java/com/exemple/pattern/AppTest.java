package com.exemple.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.exemple.pattern.controller.PersonController;
import com.exemple.pattern.model.Person;
import com.exemple.pattern.view.IPersonService;
import com.exemple.pattern.view.PersonServiceImpl;
import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class AppTest {

  /** Rigorous Test :-) */
  @Test
  public void shouldAnswerWithTrue() {
    IPersonService service = new PersonServiceImpl();
    PersonController controller = new PersonController(service);
    Person person = controller.getPerson();

    assertEquals("edu", person.getName());
  }
}
