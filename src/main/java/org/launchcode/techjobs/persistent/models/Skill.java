package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message="Description required.")
    @Size(max = 200)
    public String description;

    @ManyToMany(mappedBy= "skills")
    private List<Job> jobs = new ArrayList<>();

    //Getters and setters:

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    //No-arg constructor:

    public Skill() {}


    //Other constructor:
    public Skill(String description) {
        super();
        this.description = description;
    }
}