package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class demohooks {
	
	@Before
	public void launchStatments() {
		System.out.println("hi");
		System.out.println("browser is going to launching");
	}
	
	@After
	public void teardown() {
		System.out.println("browsee is closeing");
		System.out.println("bye");
	}

}
