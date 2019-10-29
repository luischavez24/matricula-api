package org.guis.matricula.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="GRADO")
public class Grade {

    @Id
    @Column(name="COD_GRADO")
    private int gradeId;

    @Column(name="NOMBRE_GRADO", columnDefinition = "char")
    private String name;

    @Column(name="NIVEL")
    private int level;

    @OneToMany(mappedBy = "grade")
    @JsonIgnoreProperties("grade")
    private List<Classroom> classrooms;

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }
}
