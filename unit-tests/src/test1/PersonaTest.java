package test1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

	@Test
	public void testVerifyName() {
		String name = "Jose";
		
		Persona jose = new Persona(name);
		Assert.assertEquals("Verify name of person", name, jose.getName());
	}

}
