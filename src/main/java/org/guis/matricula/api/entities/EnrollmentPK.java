package org.guis.matricula.api.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EnrollmentPK implements Serializable {

    @Column(name="P_ACADEMICO", insertable = false, updatable = false)
    private int academicYear;

    @Column(name="COD_ALU", insertable = false, updatable = false)
    private int studentId;

    public EnrollmentPK() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentPK)) return false;
        EnrollmentPK that = (EnrollmentPK) o;
        return getAcademicYear() == that.getAcademicYear() &&
                getStudentId() == that.getStudentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAcademicYear(), getStudentId());
    }
}
