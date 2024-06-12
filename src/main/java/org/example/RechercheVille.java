package org.example;


import org.example.exception.NotFoundException;

import java.util.List;

public class RechercheVille {
    private List<String> villes;

    public List<String> rechercher(String mot) throws Exception, NotFoundException {
        if (mot.length() < 2) {
            throw new NotFoundException("Le mot doit contenir plus de 2 caractères");
        }
        throw new Exception("Not implemented yet");
    }
}