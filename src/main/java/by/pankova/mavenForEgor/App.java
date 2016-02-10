package by.pankova.mavenForEgor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

  public static final Logger LOG = LogManager.getLogger(App.class);

  public static void main(String[] args) {
    String animal = random();
    LOG.error("Find animal! It's a " + new LogicPart().read(animal));
  }

  private static String random() {
    int n = (int) (Math.random() * 3);
    if (n == 2) {
      return "puppy";
    } else
      return "kitty";
  }
}
