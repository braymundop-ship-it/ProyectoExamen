package modelo;

import java.sql.Date;

public class Estudiante {

    int idEstudiante;
    String carnet;
    String firstName;
    String secondName;
    String lastName;
    String direccion;
    int telefono;
    String carrera;
    Date fechaNacimiento;
    Date fechaIngreso;
    double cuotaMensual;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String carnet, String firstName,
            String secondName, String lastName, String direccion,
            int telefono, String carrera, Date fechaNacimiento,
            Date fechaIngreso, double cuotaMensual) {

        this.idEstudiante = idEstudiante;
        this.carnet = carnet;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.direccion = direccion;
        this.telefono = telefono;
        this.carrera = carrera;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.cuotaMensual = cuotaMensual;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

}