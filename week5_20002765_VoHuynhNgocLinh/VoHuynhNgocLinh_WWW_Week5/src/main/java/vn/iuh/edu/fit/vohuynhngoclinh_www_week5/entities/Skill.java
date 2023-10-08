package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;
import vn.iuh.edu.fit.vohuynhngoclinh_www_week5.enums.SkillType;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    private SkillType type;
    private String skillName;
    private String Skilldescription;
    private long id;
    @OneToMany
    @JoinColumn(referencedColumnName = "skill")
    private List<JobSkill> jobSkills;
}
