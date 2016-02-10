package by.pankova.mavenForEgor;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

  private LogicPart lp = new LogicPart();

  @Test
  public void test() {
    Assert.assertEquals("kitty", lp.read("kitty"));
    Assert.assertEquals("puppy", lp.read("puppy"));
  }
}
