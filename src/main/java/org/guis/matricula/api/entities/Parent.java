package org.guis.matricula.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="APODERADO")
public class Parent {

    @Id
    @Column(name="COD_APODERADO")
    private int parentId;

    @Column(name="NOMBRE_AP", columnDefinition = "CHAR")
    private String names;

    @Column(name="APATERNO_AP", columnDefinition = "CHAR")
    private String paternalSurname;

    @Column(name="AMATERNO_AP", columnDefinition = "CHAR")
    private String maternalSurname;

    @Column(name="DNI_AP", columnDefinition = "CHAR")
    private String dni;

    @Column(name="EMAIL_AP", columnDefinition = "CHAR")
    private String email;

    @Column(name="TELEFONO_AP", columnDefinition = "CHAR")
    private String phoneNumber;

    @Column(name="OCUPACIN", columnDefinition = "CHAR")
    private String ocupation;

    @OneToMany(mappedBy = "parent")
    @JsonIgnoreProperties("parent")
    private List<Student> children;

    public List<Student> getChildren() {
        return children;
    }

    public void setChildren(List<Student> children) {
        this.children = children;
    }

    public Parent() {

    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }
}
