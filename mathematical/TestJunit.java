package mathematical;

import static org.junit.Assert.*;

import org.junit.*;

public class TestJunit {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
		
	@Before
	public void setUp() throws Exception {
	}
	
	// Test for LCM
	@Test
	public void testLcm() {
		
		Lcm lcmObj1 = new Lcm();
		assertEquals(175, lcmObj1.findLCM(25, 35));
		Lcm lcmObj2 = new Lcm();
		assertEquals(20, lcmObj2.findLCM(20,4));
		Lcm lcmObj3 = new Lcm();
		assertEquals(130, lcmObj3.findLCM(10,13));
		Lcm lcmObj4 = new Lcm();
		assertEquals(80, lcmObj4.findLCM(80,40));
		Lcm lcmObj5 = new Lcm();
		assertEquals(152, lcmObj5.findLCM(152,4));
	}
		
	// test for HCF
	@Test
	public void hcfTest() {

		assertEquals(4, Hcf.findHCF(20,4));
		assertEquals(1, Hcf.findHCF(10,13));
		assertEquals( 5, Hcf.findHCF(25,35));
		assertEquals(40, Hcf.findHCF(80,40));
		assertEquals(4, Hcf.findHCF(152,4));
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
