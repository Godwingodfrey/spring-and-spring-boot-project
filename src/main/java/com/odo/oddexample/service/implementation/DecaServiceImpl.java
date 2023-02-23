package com.odo.oddexample.service.implementation;

import com.odo.oddexample.model.Decagon;
import com.odo.oddexample.repository.DecaRepo;
import com.odo.oddexample.service.DecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class DecaServiceImpl implements DecaService {

    @Autowired
    private DecaRepo decaRepo;

    @Override
    public Decagon saveDecaDev(Decagon decagon) {
        return decaRepo.save(decagon);
    }

    @Override
    public List<Decagon> getAllDecadev() {
        return decaRepo.findAll();
    }

    @Override
    public Decagon getById(Long id) {
        return decaRepo.findById(id).get();
    }

    @Override
    public void deleteDecadevById(Long id) {
        decaRepo.deleteById(id);
    }

    @Override
    public void updateDecadev(Long id, Decagon decagon) {
//        decaRepo.save(decagon);
        Decagon devToUpdate = decaRepo.findById(id).get();

        devToUpdate.setName(decagon.getName());
        devToUpdate.setEmail(decagon.getEmail());

        decaRepo.save(devToUpdate);
    }
}
