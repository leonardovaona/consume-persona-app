package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Persona {

        private long id;
        private String nombre;
        private String apellido;
        private String direccion;
        private Integer edad;

        public Persona(){}

        public Persona (Long id, String nombre, String apellido, String direccion, Integer edad) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.direccion = direccion;
            this.edad = edad;
        }
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public Integer getEdad() { return edad; }

        public void setEdad(Integer edad) {  this.edad = edad; }

        @Override
        public String toString() {
            return "Persona [id= ]" + ", nombre= " + nombre + ",apellido= " + apellido + ", direccion= " + direccion + "}";
        }

    }
