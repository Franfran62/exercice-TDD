package org.example;


import org.example.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private List<String> villes = new ArrayList<>();

    private void initRessources() {
        villes.add("Paris");
        villes.add("Budapest");
        villes.add("Skopje");
        villes.add("Rotterdam");
        villes.add("Valence");
        villes.add("Vancouver");
        villes.add("Amsterdam");
        villes.add("Vienne");
        villes.add("Sydney");
        villes.add("New York");
        villes.add("Londres");
        villes.add("Bangkok");
        villes.add("Hong Kong");
        villes.add("Dubaï");
        villes.add("Rome");
        villes.add("Istanbul");
    }

    public List<String> rechercher(String mot) throws NotFoundException {
        if (mot.length() < 2) {
            throw new NotFoundException("Le mot doit contenir plus de 2 caractères");
        }
        if( villes.isEmpty()) {
            this.initRessources();
        }
        List<String> response = new ArrayList<>();

        for (String ville : villes) {
            String villeLower = ville.toLowerCase();
            if (villeLower.contains(mot.toLowerCase())) {
                response.add(ville);
            }
        }
        if (response.isEmpty()) {
            throw new NotFoundException("Aucune ville trouvée");
        }

        return response;
    }

    public void getVilles() {
    }
}