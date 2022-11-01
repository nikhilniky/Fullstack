/*
package com.example.fullstack.repo;

import com.example.fullstack.model.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProducerRepo extends JpaRepository <Producer,Long>{

    void deletebyid(Long id);

    Optional<Producer> findproducerById(Long id);
}
*/
package com.example.fullstack.repo;

import com.example.fullstack.model.Prdcr;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ProducerRepo extends JpaRepository<Prdcr, Long> {
    void deleteProducerById(Long id);

    Optional<Prdcr> findProducerById(Long id);
}
