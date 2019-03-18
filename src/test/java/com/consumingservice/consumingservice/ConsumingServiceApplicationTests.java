package com.consumingservice.consumingservice;

import configuration.HttpClientConfig;
import model.Persona;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import configuration.RestTemplateConfig;
import org.springframework.web.client.RestTemplate;
import wrapper.PersonaListWrapper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.empty;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.apache.logging.log4j.ThreadContext.isEmpty;
import static org.assertj.core.api.Java6Assertions.not;
import static org.junit.Assert.assertFalse;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RestTemplateConfig.class, HttpClientConfig.class })
public class ConsumingServiceApplicationTests {

	@Autowired
	RestTemplate restTemplate;

	@Test
	public void gerPersona() {

		final String uri = "http://localhost:4300/api/personas/101";

		Persona persona = restTemplate.getForObject(uri,Persona.class);

		Assert.assertNotNull(persona);
	}

	/*@Test
	public void getPersonas() {


		final String uri = "http://localhost:4300/api/personas";

		//PersonaListWrapper personas = restTemplate.getForObject(uri,PersonaListWrapper.class);

		Persona[] personas = restTemplate.getForObject(uri,Persona[].class);

		Assert.assertThat(personas, is(empty()));
	}*/
}
