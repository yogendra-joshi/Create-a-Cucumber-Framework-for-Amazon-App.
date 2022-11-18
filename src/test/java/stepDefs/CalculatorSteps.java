package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

	int result = 0;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside Calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
	    result = num1 + num2;
	}

	@Then("I should get the result {int}")
	public void i_should_get_the_result(int res) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(res, result);
	}

	@When("I subtract {int} and {int}")
	public void i_subtract_and(int num1, int num2) {
	    // Write code here that turns the phrase above into concrete actions
		result = num1 - num2;
	}
	
	@When("I add below numbers")
	public void i_add_below_numbers(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    int rows  = dataTable.height();
	    
	    for (int row = 0; row < rows; row++) {
	    	result = result + Integer.parseInt(dataTable.cell(row, 0));
	    }
	}
	
	@When("I add below numbers using list")
	public void i_add_below_numbers_using_list(List<Integer> numbers) {
	    // Write code here that turns the phrase above into concrete actions
	    
	     for (Integer num: numbers) {
	    	 
	    	 result = result + num;
	     }
	}

	@When("I order below items")
	public void i_order_below_items(Map<String, Integer> items) {
	    // Write code here that turns the phrase above into concrete actions
	    
		/* using values
		 * for (Integer bill: items.values()) {
		 * 
		 * result = result + bill; }
		 */
		
		for (String item: items.keySet()) {

	    	 result = result + items.get(item);
		}
	}
	
	@When("I order below items using quantity")
	public void i_order_below_items_using_quantity(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		int rows  = dataTable.height();
	    
	    for (int row = 0; row < rows; row++) {
	    	
	    	int quantity = Integer.parseInt(dataTable.cell(row, 1));
	    	int price = Integer.parseInt(dataTable.cell(row, 2));
	    	
	    	result = result + (quantity * price);
	    }
	}
}
