package lambdasstreams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StreamsDemoTest {
	private StreamsDemo demo = new StreamsDemo();

	@Test
	public void testJoinStream() {
		assertEquals("this is a stream of strings", demo.joinStream());
	}
	
	@Test
	public void testJoinUpperCase() {
		assertEquals("THIS IS A LIST OF STRINGS", demo.joinUpperCase());
	}
	
	@Test
	public void testGetTotalLength() {
		assertEquals(20, demo.getTotalLength());
	}
	
//	@Test
//	public void testSumFirstNBigDecimals() {
//		assertThat(demo.sumFirstNBigDecimals(10), is(closeTo(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10, 0.01)));
//	}
	
	

}
