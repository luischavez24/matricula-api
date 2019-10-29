package org.guis.matricula.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="ALUMNOS")
public class Student {
    @Id
    @Column(name = "COD_ALU")
    private int studentId;

    @Column(name = "DNI_ALUMNO", columnDefinition = "CHAR")
    private String dni;

    @Column(name = "NOMBRE_ALU", columnDefinition = "CHAR")
    private String names;

    @Column(name = "APATERNO_ALU", columnDefinition = "CHAR")
    private String paternalSurname;

    @Column(name = "AMATERNO_ALU", columnDefinition = "CHAR")
    private String maternalSurname;

    @Column(name = "TELEFONO_ALU", columnDefinition = "CHAR")
    private String phone;

    @Column(name = "EMAIL_ALU", columnDefinition = "CHAR")
    private String email;

    @Column(name = "DIRECCION_ALU", columnDefinition = "CHAR")
    private String address;

    @Column(name = "FECHA_NAC")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "COD_APODERADO", nullable = false)
    @JsonIgnoreProperties("children")
    private Parent parent;

    public Student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPaternalSurname() {
        return paternalSurname;
    }

    public void setPaternalSurname(String paternalSurname) {
        this.paternalSurname = paternalSurname;
    }

    public String getMaternalSurname() {
        return maternalSurname;
    }

    public void setMaternalSurname(String maternalSurname) {
        this.maternalSurname = maternalSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
