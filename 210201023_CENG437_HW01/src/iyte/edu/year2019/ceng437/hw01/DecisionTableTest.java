package iyte.edu.year2019.ceng437.hw01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DecisionTableTest {
	
	Shipment shipment = null;
	DecisionTable decisionTable = null;

	@Before
	public void setUp() throws Exception {
		shipment = new Shipment(1, 2, DeliveryDay.NEXT_DAY);
		decisionTable = new DecisionTable();
	}

	@After
	public void tearDown() throws Exception {
		shipment = null;
		decisionTable = null;
        assertNull(shipment);
        assertNull(decisionTable);
	}
	
	@Test
	public void test_calculateShipmentCost(){
		//////////////////// <$150 \\\\\\\\\\\\\\\\\\\\
		shipment.setPurchaseAmount(149);
			//////////////////// <4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(3);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals("<$150/3/NEXT_DAY failed", 35.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals("<$150/3/IN_TWO_DAYS failed", 20.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals("<$150/3/IN_A_WEEK failed", 6.0, decisionTable.calculateShipmentCost(shipment), 0);
			//////////////////// =4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(4);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals("<$150/4/NEXT_DAY failed", 35.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals("<$150/4/IN_TWO_DAYS failed", 20.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals("<$150/4/IN_A_WEEK failed", 8.0, decisionTable.calculateShipmentCost(shipment), 0);
			//////////////////// >4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(5);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals("<$150/5/NEXT_DAY failed", 25.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals("<$150/5/IN_TWO_DAYS failed", 17.5, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals("<$150/5/IN_A_WEEK failed", 7.5, decisionTable.calculateShipmentCost(shipment), 0);
				
				
		//////////////////// =$150 \\\\\\\\\\\\\\\\\\\\
		shipment.setPurchaseAmount(150);
			//////////////////// <4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(3);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals("=$150/3/NEXT_DAY failed", 35.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals("=$150/3/IN_TWO_DAYS failed", 20.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals("=$150/3/IN_A_WEEK failed", 6.0, decisionTable.calculateShipmentCost(shipment), 0);
			//////////////////// =4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(4);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals("=$150/4/NEXT_DAY failed", 35.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals("=$150/4/IN_TWO_DAYS failed", 20.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals("=$150/4/IN_A_WEEK failed", 8.0, decisionTable.calculateShipmentCost(shipment), 0);
			//////////////////// >4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(5);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals("=$150/5/NEXT_DAY failed", 25.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals("=$150/5/IN_TWO_DAYS failed", 17.5, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals("=$150/5/IN_A_WEEK failed", 7.5, decisionTable.calculateShipmentCost(shipment), 0);
		
				
		//////////////////// >$150 \\\\\\\\\\\\\\\\\\\\
		shipment.setPurchaseAmount(151);
			//////////////////// <4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(3);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals(">$150/3/NEXT_DAY failed", 40.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals(">$150/3/IN_TWO_DAYS failed", 25.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals(">$150/3/IN_A_WEEK failed", 20.0, decisionTable.calculateShipmentCost(shipment), 0);
			//////////////////// =4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(4);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals(">$150/4/NEXT_DAY failed", 40.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals(">$150/4/IN_TWO_DAYS failed", 25.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals(">$150/4/IN_A_WEEK failed", 20.0, decisionTable.calculateShipmentCost(shipment), 0);
			//////////////////// >4 \\\\\\\\\\\\\\\\\\\\
			shipment.setNumberOfItems(5);
				shipment.setDeliveryDay(DeliveryDay.NEXT_DAY);
					assertEquals(">$150/5/NEXT_DAY failed", 45.0, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_TWO_DAYS);
					assertEquals(">$150/5/IN_TWO_DAYS failed", 37.5, decisionTable.calculateShipmentCost(shipment), 0);
				shipment.setDeliveryDay(DeliveryDay.IN_A_WEEK);
					assertEquals(">$150/5/IN_A_WEEK failed", 17.5, decisionTable.calculateShipmentCost(shipment), 0);
		
	}
}