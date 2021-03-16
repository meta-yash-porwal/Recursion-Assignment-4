import static org.junit.Assert.*;
import org.junit.*;

/**
 * class is used to test n-queen  using junit.
 * @author yash.porwal_metacube
 * 
 */
public class TestNQueen {
	
	int[][] array1 = {{0,0,1,0},{1,0,0,0},{0,0,0,1},{0,1,0,0}};
	int[][] array2 = {{1,0,0,0,0},{0,0,0,1,0},{0,1,0,0,0},{0,0,0,0,1},{0,0,1,0,0}};
	int[][] array3 = {{1,0,0,0,0,0,0,0},{0,0,0,0,0,0,1,0},{0,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,1},{0,1,0,0,0,0,0,0},{0,0,0,1,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,1,0,0,0,0,0}};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
		
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void nQueenTest() throws Exception {
		
		NQueen q = new NQueen();
		assertArrayEquals(array1, q.createMatrix(4));
		assertArrayEquals(array2, q.createMatrix(5));
		assertArrayEquals(array3, q.createMatrix(8));
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
