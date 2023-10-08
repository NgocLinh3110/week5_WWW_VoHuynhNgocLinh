package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String city;
    private CountryCode country;
    @Id
    @Column(name = "add_id")
    private long id;
    private String zipcode;
    private String street;
    @OneToOne(mappedBy = "address")
    private Candidate candidate;
    private String number;
    @OneToOne(mappedBy = "address")
    private Company company;
}
