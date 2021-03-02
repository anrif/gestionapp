package com.devlabspro.gestionapp.services;

import com.devlabspro.gestionapp.models.JobTitle;
import com.devlabspro.gestionapp.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    //Return list of jobTitles
    public List<JobTitle> getJobTitles(){

        return jobTitleRepository.findAll();
    }

    //Save new jobTitle
    public void save(JobTitle jobTitle){

        jobTitleRepository.save(jobTitle);
    }

    //get by id
    public Optional<JobTitle> findById(int id){

        return  jobTitleRepository.findById(id);
    }

    public void delete(Integer id) {

        jobTitleRepository.deleteById(id);
    }
}
