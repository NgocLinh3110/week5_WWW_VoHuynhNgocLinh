package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    @Id
    @Column(name = "job_id")
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(referencedColumnName = "job")
    private Company company;
    @OneToMany
    @JoinColumn(referencedColumnName = "job")
    private List<JobSkill> jobSkills;
    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String description;
}
