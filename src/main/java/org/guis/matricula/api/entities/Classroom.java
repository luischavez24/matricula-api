package org.guis.matricula.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SECCION")
@IdClass(ClassroomPK.class)
public class Classroom {

    @Id
    private int gradeId;

    @Id
    private int sectionId;

    @Column(name="NOMBRE_SECCION", columnDefinition = "char")
    private String name;

    @Column(name="NRO_SALON")
    private int roomNumber;


    @ManyToOne
    @JoinColumn(name = "COD_GRADO", nullable = false)
    @JsonIgnoreProperties("classrooms")
    private Grade grade;

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
