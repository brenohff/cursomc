package com.brenohff.cursomc.repositories;

import com.brenohff.cursomc.entities.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, Integer> {

}
