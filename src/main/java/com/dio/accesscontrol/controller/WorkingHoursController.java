package com.dio.accesscontrol.controller;

import com.dio.accesscontrol.model.WorkingHours;
import com.dio.accesscontrol.service.WorkingHoursService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/working")
public class WorkingHoursController {

    @Autowired
    WorkingHoursService workingHoursService;

    @PostMapping
    public WorkingHours createWorking(@RequestBody @Valid WorkingHours workingHours){
        return workingHoursService.save(workingHours);
    }

    @GetMapping
    public List<WorkingHours> getAllWorking(){
        return workingHoursService.findAll();
    }

    @GetMapping("/{id}")
    public WorkingHours getById(@PathVariable Long id) throws Exception{
        return workingHoursService.findById(id).orElseThrow(() -> new Exception("Not found WorkingHours"));
    }

    @PutMapping
    public WorkingHours updateById(@RequestBody WorkingHours workingHours){
        return workingHoursService.update(workingHours);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id){
        workingHoursService.deleteById(id);

    }


}
