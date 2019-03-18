package controller;

import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/personas")
public class PersonaController {

    @RequestMapping(method = RequestMethod.GET)
   public ResponseEntity<List<Persona>> getAllPersonas() {
            List<Persona> personaList = new ArrayList<>();

        }

/*    @RequestMapping(value = "/objects", method = RequestMethod.GET)
    public List<Object> getObjects() {

        ResponseEntity<Object[]> response = restTemplate.getForEntity(
                "http://url", Object[].class);

        return Arrays.asList(response.getBody());
    }*/
}
