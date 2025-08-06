package testcases;

import org.testng.annotations.Test;

import listeners.ListenersTestNG;

public class DashboardTest extends ListenersTestNG {

	@Test(priority = 2)
	public void addDetails() {
		test.info("adding name");
		dp.addCustomer();
		dp.addname();
		dp.addnumber();
	}

	@Test(priority = 3, dependsOnMethods="addDetails")
	public void addAddress() {
		test.info("adding address");
		dp.addaddress();
		dp.addButton();
	}
}
