package models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// This is an entity that would be saved into the database

@Entity //Hibernate annotation that show this is data to be saved into the database
public class Student {
    @Id
    private Integer id;
    private String name;
    private String cohort;

    public Student(Integer id, String name, String cohort) {
        this.id = id;
        this.name = name;
        this.cohort = cohort;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
