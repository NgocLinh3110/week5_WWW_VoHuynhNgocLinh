package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Experience {
    @Id
    @Column(name = "exp_id")
    private long id;
    private LocalDate toDate;
    @ManyToOne
    @JoinColumn(referencedColumnName = "experiences")
    private Candidate candidate;
    private LocalDate fromDate;
    private String companyName;
    private String role;
    private String workDescription;
}
