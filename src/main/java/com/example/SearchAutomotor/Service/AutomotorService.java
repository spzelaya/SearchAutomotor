package com.example.SearchAutomotor.Service;

import com.example.SearchAutomotor.Model.Automotor;
import com.example.SearchAutomotor.repository.AutomotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomotorService {

    @Autowired
    private AutomotorRepository repository;

    public List<Automotor> getAllAutomotors(){
        return repository.findAll();
    }
    public List<Automotor> getByMarcaDescripcionAndTipo(String marca, String descripcion,String tipo){
        return repository.findByMarcaDescripcionAndTipo(marca,descripcion,tipo);
    }
}
