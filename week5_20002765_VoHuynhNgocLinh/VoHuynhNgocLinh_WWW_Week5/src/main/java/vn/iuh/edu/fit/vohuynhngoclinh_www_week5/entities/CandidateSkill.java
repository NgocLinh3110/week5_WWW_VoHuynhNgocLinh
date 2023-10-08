package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.*;
import lombok.*;
import vn.iuh.edu.fit.vohuynhngoclinh_www_week5.enums.SkillLevel;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private SkillLevel skillLevel;
    @Id
    @Column(name = "skill_id")
    private Skill skill;
    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @Id
    @Column(name = "can_id")
    private Candidate candidate;
    private String moreInfor;

}
