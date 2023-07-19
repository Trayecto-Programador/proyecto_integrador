package modelo;

import java.sql.Date;

public abstract class  Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fecNac;
    private String direccion;
    private String localidad;
    private int codPos;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Date fecNac, String direccion, String localidad, int codPos, String telefono) {
        this.id = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecNac = fecNac;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codPos = codPos;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getCodPos() {
        return codPos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCodPos(int codPos) {
        this.codPos = codPos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecNac=" + fecNac + ", direccion=" + direccion + ", localidad=" + localidad + ", codPos=" + codPos + ", telefono=" + telefono + '}';
    }

    
   
    
    
    
    
}
