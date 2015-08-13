package jp.co.spring_boot.mysql.sample;

import static org.junit.Assert.assertEquals;

import java.util.List;

import jp.co.spring_boot.mysql.sample.Application;
import jp.co.spring_boot.mysql.sample.Customer;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationTest {

	@Test
	public void test() {
		ConfigurableApplicationContext ctx = null;
		try {
			ctx = SpringApplication.run(Application.class);
			Application main = ctx.getBean(Application.class);
			List<Customer> customerList = main.queryCustomerWhereLastName("O'Brian");
			for(Customer customer : customerList){
				assertEquals("Chloe",customer.getFirstName());
			}
		} finally {
			if(ctx != null){
				ctx.close();
			}
		}

		
	}

}
