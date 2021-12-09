package com.dio.accesscontrol.service;


import com.dio.accesscontrol.model.WorkingHours;
import com.dio.accesscontrol.repository.WorkingHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingHoursService {


    WorkingHoursRepository workingHoursRepository;

    @Autowired
    public WorkingHoursService(WorkingHoursRepository workingHoursRepository){
        this.workingHoursRepository = workingHoursRepository;
    }

    public WorkingHours save(WorkingHours workingHours){
        return workingHoursRepository.save(workingHours);
    }

    public List<WorkingHours> findAll(){

        return workingHoursRepository.findAll();
    }
    public Optional<WorkingHours> findById(Long id) {

        return workingHoursRepository.findById(id);
    }

    public WorkingHours update(WorkingHours workingHours) {
        return workingHoursRepository.save(workingHours);
    }

    public void deleteById(Long id){
        workingHoursRepository.deleteById(id);
    }


}
