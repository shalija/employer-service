package com.inpixon.interview.employers.data;

import com.inpixon.interview.employers.model.Employer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerRepository extends MongoRepository<Employer, String> {

    List<Employer> findByCandidateId(String candidateId);




}
