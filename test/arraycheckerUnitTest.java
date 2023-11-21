import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import arraychecker.Arraychecker;
/**
 *
 * @author Adison
 */
public class arraycheckerUnitTest {
    
    public arraycheckerUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }
    @Test
    public void testSortedAscArray() {
        int[] array = {1, 2, 3, 4, 5};
        boolean Sorted = Arraychecker.arrSort(array);
        assertTrue(Sorted);
    }

    @Test
    public void testSortedDescArray() {
        int[] array = {5, 4, 3, 2, 1};
        boolean Sorted = Arraychecker.arrSort(array);
        assertTrue(Sorted);
    }

    @Test
    public void testUnsortedArray() {
        int[] array = {5, 2, 4, 1, 3};
        boolean Sorted = Arraychecker.arrSort(array);
        assertFalse(Sorted);
    }

    @Test
    public void testEmpArray() {
        int[] array = {};
        boolean Sorted = Arraychecker.arrSort(array);
        assertTrue(Sorted);
    }

    @Test
    public void testSnglEleArray() {
        int[] array = {1};
        boolean Sorted = Arraychecker.arrSort(array);
        assertTrue(Sorted);
    }
}