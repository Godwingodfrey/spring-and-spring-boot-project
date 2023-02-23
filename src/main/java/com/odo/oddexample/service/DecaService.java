package com.odo.oddexample.service;

import com.odo.oddexample.model.Decagon;

import java.util.List;

public interface DecaService {

    Decagon saveDecaDev(Decagon decagon);

    List<Decagon> getAllDecadev();

    Decagon getById(Long id);

    void deleteDecadevById(Long id);

    void updateDecadev(Long id, Decagon decagon);
}
