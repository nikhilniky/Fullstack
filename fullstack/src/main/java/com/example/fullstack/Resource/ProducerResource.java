package com.example.fullstack.Resource;

import com.example.fullstack.model.Prdcr;
import com.example.fullstack.service.ProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producer")
public class ProducerResource {
    private final ProducerService producerservice;

    public ProducerResource(ProducerService producerservice) {
        this.producerservice = producerservice;
    }


    @GetMapping("/all")
    public ResponseEntity <List<Prdcr>> getAllProducers(){
        List<Prdcr> prdcrList =producerservice.findAllProducers();
        return new ResponseEntity<>(prdcrList, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity <Prdcr> findProducers(@PathVariable("id") Long id) {
        Prdcr prdcr =producerservice.producerById(id);
        return new ResponseEntity<>(prdcr, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity <Prdcr> addProducer(@RequestBody Prdcr prdcr) {
        Prdcr addPrdcr =producerservice.addProducer(prdcr);
        return new ResponseEntity<>(addPrdcr, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity <Prdcr> updateproducer(@RequestBody Prdcr prdcr) {
        Prdcr updateproducer=producerservice.updateProducer(prdcr);
        return new ResponseEntity<>(updateproducer, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity <Prdcr> deleteproducer(@PathVariable("id") Long id){
        producerservice.deleteProducer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

