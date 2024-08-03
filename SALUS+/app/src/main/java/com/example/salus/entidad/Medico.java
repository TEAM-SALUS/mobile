package com.example.salus.entidad;
import java.io.Serializable;
import java.util.List;
public class Medico implements Serializable {
    private Long id;
    private String matricula;
    private String nombre;
    private String apellido;
    private String email;
    private String clave;
    private String telefono;
    private String foto;
    private boolean is_active;
    private Long id_especialidad;
    private Long id_horario;
    private int medicoUser;
    public Medico() {
    }
    public Medico(Long id, String matricula, String nombre, String apellido, String email, String clave, String telefono, String foto, boolean is_active, Long id_especialidad, Long id_horario, int medicoUser) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.foto = foto;
        this.is_active = is_active;
        this.id_especialidad = id_especialidad;
        this.id_horario = id_horario;
        this.medicoUser = medicoUser;
    }
    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public Long getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(Long id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public Long getId_horario() {
        return id_horario;
    }

    public void setId_horario(Long id_horario) {
        this.id_horario = id_horario;
    }

    public int getMedicoUser() {
        return medicoUser;
    }

    public void setMedicoUser(int medicoUser) {
        this.medicoUser = medicoUser;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", clave='" + clave + '\'' +
                ", telefono='" + telefono + '\'' +
                ", foto='" + foto + '\'' +
                ", is_active=" + is_active +
                ", id_especialidad=" + id_especialidad +
                ", id_horario=" + id_horario +
                ", medicoUser=" + medicoUser +
                '}';
    }
}

