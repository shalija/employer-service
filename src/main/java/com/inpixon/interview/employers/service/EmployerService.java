package com.inpixon.interview.employers.service;

import com.inpixon.interview.employers.data.EmployerRepository;
import com.inpixon.interview.employers.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {
    @Autowired
    EmployerRepository employerRepository;

    public List<Employer> getEmployer(String cadidateId)
    {
      return   employerRepository.findByCandidateId(cadidateId);
    }



}
