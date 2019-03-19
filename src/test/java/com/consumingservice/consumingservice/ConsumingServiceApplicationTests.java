package com.consumingservice.consumingservice;

import model.Persona;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.client.RestTemplate;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Java6Assertions.not;
import static org.junit.Assert.assertFalse;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ConsumingServiceApplicationTests {

	@Test
	public void gerPersona() {
		final String uri = "http://localhost:4300/api/personas/101";
	}
}
