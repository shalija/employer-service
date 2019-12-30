package com.inpixon.interview.employers.controller;

import com.inpixon.interview.employers.model.Employers;
import com.inpixon.interview.employers.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employers")
public class EmployerController {
    @Autowired
    EmployerService employerService;


    @GetMapping(path = "/candidate/{candidateId}")
    public Employers getEmployers(@PathVariable(name = "candidateId") String candidateId)
    {

          return new Employers().employers(employerService.getEmployer(candidateId));





    }









}
