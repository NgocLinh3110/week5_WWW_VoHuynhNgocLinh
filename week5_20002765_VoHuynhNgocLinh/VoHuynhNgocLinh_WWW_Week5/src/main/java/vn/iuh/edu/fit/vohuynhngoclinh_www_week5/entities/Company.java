package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    @Id
    @Column(name = "can_id")
    private long id;
    private String name;
    private String about;
    @OneToOne(mappedBy = "company")
    private Address address;
    private String phone;
    private String webURL;
    @OneToMany
    @JoinColumn(referencedColumnName = "company")
    private List<Job> jobs;
    private String email;
}
