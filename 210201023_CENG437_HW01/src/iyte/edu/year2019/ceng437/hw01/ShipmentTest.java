package iyte.edu.year2019.ceng437.hw01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipmentTest {
	
	Shipment shipment = null;

	@Before
	public void setUp() throws Exception {
		shipment = new Shipment(1, 2, DeliveryDay.NEXT_DAY);
	}

	@After
	public void tearDown() throws Exception {
		shipment = null;
        assertNull(shipment);
	}

	@Test
	public void testGetPurchaseAmount() {
		assertEquals("testGetPurchaseAmount failed", 1, shipment.getPurchaseAmount());
	}
	
	@Test
	public void testSetPurchaseAmount() {
		shipment.setPurchaseAmount(10);
		assertEquals("testSetPurchaseAmount failed", 10, shipment.getPurchaseAmount());
	}
	
	@Test
	public void testGetNumberOfItems() {
		assertEquals("testGetNumberOfItems failed", 2, shipment.getNumberOfItems());
	}
	
	@Test
	public void testSetNumberOfItems() {
		shipment.setNumberOfItems(20);
		assertEquals("testSetNumberOfItems failed", 20, shipment.getNumberOfItems());
	}
	
	@Test
	public void testGetDeliveryDay() {
		assertEquals("testGetDeliveryDay failed", DeliveryDay.NEXT_DAY, shipment.getDeliveryDay());
	}
	
	@Test
	public void testSetDeliveryDay() {
		shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
		assertEquals("testSetDeliveryDay failed", DeliveryDay.IN_TWO_DAYS, shipment.getDeliveryDay());
	}
}
