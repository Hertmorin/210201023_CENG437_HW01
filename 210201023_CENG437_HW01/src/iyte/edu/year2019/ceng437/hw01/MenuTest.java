package iyte.edu.year2019.ceng437.hw01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class MenuTest {
	
	Menu menu = null;
	
	@Rule
	public final TextFromStandardInputStream mock = TextFromStandardInputStream.emptyStandardInputStream();

	@Before
	public void setUp() throws Exception {
		menu = new Menu();
	}

	@After
	public void tearDown() throws Exception {
		menu = null;
		assertNull(menu);
	}
	
	@Test
	public void testReadPurchaseAmount(){
		mock.provideLines("1");
		assertEquals("testReadPurchaseAmount failed.", 1, menu.readPurchaseAmount());
	}
	
	@Test
	public void testReadNumberOfItems(){
		mock.provideLines("2");
		assertEquals("testReadNumberOfItems failed.", 2, menu.readNumberOfItems());
	}
	
	@Test
	public void testReadDeliveryDay(){
		mock.provideLines("1");
		assertEquals("testReadDeliveryDay 1 failed", DeliveryDay.NEXT_DAY, menu.readDeliveryDay());
		
		mock.provideLines("2");
		assertEquals("testReadDeliveryDay 2 failed", DeliveryDay.IN_TWO_DAYS, menu.readDeliveryDay());
		
		mock.provideLines("3");
		assertEquals("testReadDeliveryDay 3 failed", DeliveryDay.IN_A_WEEK, menu.readDeliveryDay());
		
		mock.provideLines("4");
		assertEquals("testReadDeliveryDay default failed", DeliveryDay.IN_A_WEEK, menu.readDeliveryDay());
	}
}