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

    @Test
    public void when_recherche_contains_2_characters_then_return_good_list() {
        // arrange
        RechercheVille rechercheVille = new RechercheVille();
        String mot = "Va";
        // act
        try {
            List<String> villes = rechercheVille.rechercher(mot);
            // assert
            for (String ville : villes) {
                Assert.assertTrue(ville.startsWith(mot));
            }
        } catch (Exception e) {
            Assert.fail(" Exception pas attendue");
        }
    }

    @Test
    public void rechercher_insensible_a_la_casse() {
        // arrange
        RechercheVille rechercheVille = new RechercheVille();
        String mot = "Va";
        String mot2 = mot.toUpperCase();
        // act
        try {
            List<String> expected = rechercheVille.rechercher(mot2);
            List<String> result = rechercheVille.rechercher(mot);
            // assert
            Assert.assertEquals(expected, result);
        } catch (Exception e) {
            Assert.fail(" Exception pas attendue");
        }


    }
}
