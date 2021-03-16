package search;

import org.junit.*;

import static org.junit.Assert.*;

public class TestSearch {
	
	int []array1 ={3,5,8,9};
	int []array2 ={100,214,542,123,213};
	int []array3 ={32,43,54};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
		
	@Before
	public void setUp() throws Exception {
	}
	
	//testing for linear search
	@Test
	public void testLinear() {
		Search linearObj1 = new Search();
		assertEquals(0,linearObj1.Linear(array3,32));
		Search linearObj2 = new Search();
		assertEquals(2,linearObj2.Linear(array1,8));
		Search linearObj3 = new Search();
		assertEquals(-1,linearObj3.Linear(array1,10));
		Search linearObj4 = new Search();
		assertEquals(4,linearObj4.Linear(array2,213));

	}
	
	//testing for binary search
	@Test
	public void binaryTestSearch(){
		
		assertEquals(0,Search.Binary(array3, 32, array3.length, 0));
		assertEquals(2,Search.Binary(array1,8, array1.length, 0));
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
