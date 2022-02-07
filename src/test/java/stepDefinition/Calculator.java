package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {

	int actualValue;

	@Given("As a customer we have the analog calculator")
	public void as_a_customer_we_have_the_analog_calculator() {

		System.out.println("====This is my Analog calculator=======");

	}

	@When("As a customer we sends two number {int} and {int}")
	public void as_a_customer_we_sends_two_number_and(int num1, int num2) {

		System.out.println("======Addition of given numbers============");

		actualValue = num1 + num2;

		System.out.println(actualValue);

	}

	@And("As a customer we clicks the plus operation")
	public void as_a_customer_we_clicks_the_plus_operation() {

		System.out.println("============Add button clicked=======");

	}

	@Then("As a customer we should see the {int} in the result")
	public void as_a_customer_we_should_see_the_in_the_result(int expectedValue) {

		if (actualValue == expectedValue) {

			System.out.println("PASS");
		}

		else {

			System.out.println("FAIL");
		}

	}

}
