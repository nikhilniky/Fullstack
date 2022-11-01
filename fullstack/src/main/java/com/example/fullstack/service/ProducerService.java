package com.example.fullstack.service;
import com.example.fullstack.exception.UserNotFoundException;
import com.example.fullstack.model.Prdcr;
import com.example.fullstack.repo.ProducerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ProducerService {
    private final ProducerRepo producerRepo;

    @Autowired
    public ProducerService(ProducerRepo producerRepo) {
        this.producerRepo = producerRepo;
    }


    public Prdcr addProducer(Prdcr prdcr) {
        prdcr.setINSERT_USER_NAME("Nikhil");
        return producerRepo.save(prdcr);
    }

    public List<Prdcr> findAllProducers() {
        return producerRepo.findAll();
    }

    public Prdcr updateProducer(Prdcr prdcr){
        return producerRepo.save(prdcr);
    }


    public Prdcr producerById(Long id) {
        return producerRepo.findProducerById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public  void deleteProducer(Long id){
        producerRepo.deleteProducerById(id);
    }
}
