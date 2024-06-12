package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RechercheVilleTest {

    @Test
    public void when_recherche_contains_1_characters_then_NotFoundException() {
        // arrange
        RechercheVille rechercheVille = new RechercheVille();
        // act & assert
        Assert.assertThrows(ClassNotFoundException.class, () -> rechercheVille.rechercher("a"));
    }
    @Test
    public void when_recherche_contains_2_characters_then_NotFoundException() {
        // arrange
        RechercheVille rechercheVille = new RechercheVille();
        // act & assert
        Assert.assertThrows(ClassNotFoundException.class, () -> rechercheVille.rechercher("aa"));
    }
}
