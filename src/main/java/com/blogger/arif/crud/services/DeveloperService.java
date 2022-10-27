package com.blogger.arif.crud.services;

import com.blogger.arif.crud.dtos.DeveloperDto;
import com.blogger.arif.crud.models.DeveloperModel;
import com.blogger.arif.crud.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    /// listeleme
    public List<DeveloperModel> list(){
        return developerRepository.findAll();
    }

    /// ekleme
    public DeveloperModel addDeveloper(DeveloperDto developerDto){
        DeveloperModel developerModel = new DeveloperModel();
        developerModel.setName(developerDto.getName());
        developerModel.setSurname(developerDto.getSurname());
        return developerRepository.save(developerModel);
    }

    ///güncelleme
    public DeveloperModel updateDeveloper(Long id,DeveloperDto developerDto){
        DeveloperModel updatedDeveloperModel = developerRepository.getReferenceById(id);
        updatedDeveloperModel.setName(developerDto.getName());
        updatedDeveloperModel.setSurname(developerDto.getSurname());
        return developerRepository.save(updatedDeveloperModel);
    }

    ///silme
    public void deleteDeveloper (Long id){
        developerRepository.deleteById(id);
    }
}
