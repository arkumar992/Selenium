package Steps;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void before(Scenario Sc)
	{
		String ScenarioName = Sc.getName();
		System.out.println(ScenarioName);
		String RowId = Sc.getId();
		System.out.println(RowId);
	}
	@After
	public void after(Scenario Sc)
	{
		Type TestCaseStatus = Sc.getStatus();
		System.out.println(TestCaseStatus);
		boolean FailedStatus = Sc.isFailed();
		System.out.println(FailedStatus);
	}
	

}
