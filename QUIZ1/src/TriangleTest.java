import junit.framework.TestCase;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		triangle= new Triangle(3,4,5);
	}

	@Test
	public void testArea() {
		assertTrue(triangle.getArea()==6.0);
	}
	@Test
	public void testPerimeter() {
		assertTrue(triangle.getPerimeter()==12);
	}
	@Test
	public void testname() {
		System.out.print(triangle.toString());
	}
}
