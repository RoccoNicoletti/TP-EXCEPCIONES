public class Alumno {

    private String nombre;
    private String nacionalidad;


    ///constructores

    public Alumno(){

    }

    public Alumno(String nombre, String nacionalidad) throws NacionalidadFaltante {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    ///getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
