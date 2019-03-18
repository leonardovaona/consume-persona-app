package wrapper;

import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaListWrapper {

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    private List<Persona> personas;

    public PersonaListWrapper() {
        personas = new ArrayList<>();
    }


}
