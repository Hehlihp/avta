import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass  {

    //Тест1
    @Test
    public void testGetLocalNumber()
    {
        int a = 14;
        Assert.assertTrue("14 != " + a,getLocalNumber() == a );


    }
    //Тест2
    @Test
    public void testGetClassNumber(){
        int b = 45;
        Assert.assertTrue("False, private class_number is lesser then given number" + " " + b,getClassNumber() > b);

    }
    //Тест3
    @Test
    public void testGetClassString()
    {
        Assert.assertTrue(getClassString().contains("hello") || getClassString().contains("Hello"));

    }

}
