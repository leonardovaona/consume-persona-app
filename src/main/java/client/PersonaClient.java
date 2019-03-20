package client;

import com.sun.javafx.scene.layout.region.Margins;
import model.Persona;
import model.PersonaList;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


public class PersonaClient {
    public static void main (String[] args){

        PersonaClient personaClient = new PersonaClient();

        System.out.println("Calling Get Using ParameterizedTypeReference");
        personaClient.getAllPersonasUsingParameterizedTypeReference();

        /*System.out.println("Calling Get using wrapper class");
        personaClient.getAllPersonasUsingWrapperClass();*/

        System.out.println("Calling POST using normal list");
        personaClient.createPersonasUsingLists();

/*        System.out.println("Calling POST using wrapper class");
        personaClient.createPersonasUsingWrapperClass();*/
    }

    public PersonaClient(){}

    public List<Persona> getAllPersonasUsingParameterizedTypeReference(){
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Persona>> response = restTemplate.exchange(
                "http://localhost:4300/api/personas",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Persona>>() {});
        List<Persona> personas = response.getBody();

        personas.forEach(e-> System.out.println(e));
        return personas;
    }

    public List<Persona> getAllPersonasUsingWrapperClass(){
        RestTemplate restTemplate = new RestTemplate();

        PersonaList response = restTemplate.getForObject(
                "http://localhost:4300/api/personas",
                 PersonaList.class);
        List<Persona> personas = response.getPersonas();

        personas.forEach(e-> System.out.println(e));
        return personas;
    }


    public void createPersonasUsingLists() {

        RestTemplate restTemplate = new RestTemplate();

        Persona newPersona = new Persona(1000L,"leonardo", "vaona", "pavon", 33);

        restTemplate.postForObject(
                "http://localhost:4300/api/personas",
                newPersona,
                Persona.class);

    }

    public void createPersonasUsingWrapperClass(){

        RestTemplate restTemplate = new RestTemplate();

        List<Persona> newPersonaList = new ArrayList<>();
        newPersonaList.add(new Persona(3L,"leonardo", "vaona", "pavon", 33));
        newPersonaList.add(new Persona(4L,"natalia", "tasistro", "san juan", 33));

        restTemplate.postForObject(
                "http://localhost/4300/api/personas/",
                newPersonaList,
                ResponseEntity.class);
    }
}
