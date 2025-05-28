package designpattern.creational.builder;

import org.junit.Assert;
import org.junit.Test;



public class CustomerTest {

	@Test
	public void testCustomer() {
		Customer customer = new Customer.CustomerBuilder("2867").setName("Saurabh").setAge("36").build();
		
		System.out.println("Customer="+customer.toString());
		
		Assert.assertEquals("2867", customer.getId());
		Assert.assertEquals("Saurabh", customer.getName());
		Assert.assertEquals("36", customer.getAge());
	}

}
