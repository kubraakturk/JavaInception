package com.blogger.arif.crud.controllers;

import com.blogger.arif.crud.dtos.DeveloperDto;
import com.blogger.arif.crud.models.DeveloperModel;
import com.blogger.arif.crud.services.DeveloperService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developer")
public class DeveloperController {

    @Autowired
    DeveloperService developerService;

    //http://localhost:8090/developer/list
    @RequestMapping("/list")
    public List<DeveloperModel> developerList (){
        List<DeveloperModel> developerDtoList = developerService.list();
        return developerDtoList;
    }

    @PostMapping("/add")
    public DeveloperModel addDeveloper(@RequestBody DeveloperDto developerDto){
        return developerService.addDeveloper(developerDto);
    }


    @PutMapping("/update/{id}")
    public DeveloperModel updateDeveloper(@PathVariable Long id, @RequestBody DeveloperDto developerDto){
        return developerService.updateDeveloper(id, developerDto);
    }

    @PostMapping("/delete/{id}")
    public Boolean deleteDeveloper(@PathVariable Long id){
         developerService.deleteDeveloper(id);
         return true;
    }
}
