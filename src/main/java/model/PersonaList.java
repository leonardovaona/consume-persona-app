package model;

import java.util.ArrayList;
import java.util.List;

public class PersonaList {

    public List<Persona> personas;

    public PersonaList(){
        personas = new ArrayList<>();
    }

    public PersonaList (List<Persona> personas){
        this.personas = personas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }


}
