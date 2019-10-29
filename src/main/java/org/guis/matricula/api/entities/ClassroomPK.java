package org.guis.matricula.api.entities;


import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class ClassroomPK implements Serializable {

    @Column(name="COD_GRADO", insertable = false, updatable = false)
    private int gradeId;

    @Column(name="COD_SECCION", insertable = false, updatable = false)
    private int sectionId;

    public ClassroomPK() {

    }

    public ClassroomPK(int gradeId, int sectionId) {
        this.gradeId = gradeId;
        this.sectionId = sectionId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassroomPK)) return false;
        ClassroomPK that = (ClassroomPK) o;
        return getGradeId() == that.getGradeId() &&
                getSectionId() == that.getSectionId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGradeId(), getSectionId());
    }
}
