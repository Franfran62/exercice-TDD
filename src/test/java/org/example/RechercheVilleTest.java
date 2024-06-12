package org.example;

import org.example.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RechercheVilleTest {

    @Test
    public void when_recherche_contains_1_characters_then_NotFoundException() {
        // arrange
        RechercheVille rechercheVille = new RechercheVille();
        // act & assert
        Assert.assertThrows(NotFoundException.class, () -> rechercheVille.rechercher("a"));
    }
}
