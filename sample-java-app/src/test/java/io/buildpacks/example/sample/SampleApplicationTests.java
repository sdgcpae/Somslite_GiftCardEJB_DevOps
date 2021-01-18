package io.buildpacks.example.sample;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SampleApplicationTests {

	@Test
	public void passingTest() {
		assertTrue(true);
	}
	
	@Test
	public void failingTest() {
		//assertTrue(false); // Uncomment this for the build to fail.
	}

}
