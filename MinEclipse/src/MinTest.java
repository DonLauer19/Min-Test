import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

@RunWith(Parameterized.class)
public class MinTest {

    public List list;
    public Object min;

    public MinTest(List list, Object min){ // Note Constructor
        this.list = list;
        this.min = min;
    }
    @Parameters
    public static Collection<Object[]> minValues(){
        return Arrays.asList(new Object [][] {
                {Arrays.asList("cat"), "cat"},
                {Arrays.asList("cat", "dog", "butterfly"), "butterfly"},
                {Arrays.asList(1), 1},
                {Arrays.asList(2, 0, 1), 0}});
    }
    @Test
    public void normalTest(){
        System.out.println("Testing if minimum element in " + list.toString() + " is " + min.toString());
        assertTrue("Incorrect min", Min.min(list).equals(min));
    }
}
