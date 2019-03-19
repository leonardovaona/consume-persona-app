package service;

import client.PersonaClient;
import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaClient personaClient;

    public List<Persona> getAllPersonas (){


        List<Persona> personas = new ArrayList<>();

        //personas = PersonaClient.getAllPersonasUsingWrapperClass();

        return personas;
    }
}
