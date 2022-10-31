package com.blogger.arif.crud.repositories;

import com.blogger.arif.crud.models.DeveloperModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<DeveloperModel,Long> {
}
