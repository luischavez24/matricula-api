package org.guis.matricula.api.entities;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name="MATRICULA")
@IdClass(EnrollmentPK.class)
public class Enrollment {

    @Id
    private int academicYear;

    @Id
    private int studentId;

    @Column(name="COD_MATRICULA", columnDefinition = "char")
    private String enrollmentId;

    @Column(name="FECHA_EJECUCUCION")
    private ZonedDateTime enrollmentOn;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name="COD_GRADO", nullable = false),
            @JoinColumn(name="COD_SECCION", nullable = false)
    })
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "COD_ALU", nullable = false)
    private Student student;

    public Enrollment() {

    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public ZonedDateTime getEnrollmentOn() {
        return enrollmentOn;
    }

    public void setEnrollmentOn(ZonedDateTime enrollmentOn) {
        this.enrollmentOn = enrollmentOn;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
