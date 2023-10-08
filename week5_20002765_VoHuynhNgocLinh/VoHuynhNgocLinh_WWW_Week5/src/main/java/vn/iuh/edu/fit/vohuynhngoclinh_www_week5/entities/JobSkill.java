package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import vn.iuh.edu.fit.vohuynhngoclinh_www_week5.enums.SkillLevel;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JobSkill {
    private SkillLevel skillLevel;
    @ManyToOne
    @JoinColumn(referencedColumnName = "jobSkills")
    private Job job;
    private String moreInfor;
    @ManyToOne
    @JoinColumn(referencedColumnName = "jobSkills")
    private Skill skill;
}
