package vn.iuh.edu.fit.vohuynhngoclinh_www_week5.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CandidateRepository {
    private EntityManager em;
    private EntityTransaction trans;
    private final Logger logger = LoggerFactory.getLogger("CandidateRepository");
    public CandidateRepository(){

    }
}
