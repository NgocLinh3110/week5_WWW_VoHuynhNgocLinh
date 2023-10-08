package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Candidate {
    @Id
    @Column(name = "can_id")
    private long id;
    private String phone;
    private LocalDate dob;
    private String email;
    private String fullName;
    @OneToOne(mappedBy = "candidate")
    private Address address;
    @OneToMany
    @JoinColumn(referencedColumnName = "candidate")
    private List<CandidateSkill> candidateSkills;
    @OneToMany
    @JoinColumn(referencedColumnName = "candidate")
    private List<Experience> experiences;
}
