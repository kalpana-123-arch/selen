package project1;

import org.testng.annotations.Test;

public class Test1
{
  @Test(groups = { "group1", "group2" })
  public void test_method1()
  {
    //Test implementation
  }
 
  @Test(groups = {"group2"} )
  public void test_method2()
  {
    //Test implementation
  }
 
  @Test(groups = {"group1"})
  public void test_method3()
  {
    //Test implementation
  }
}

