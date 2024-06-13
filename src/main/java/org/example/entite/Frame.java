package org.example.entite;

import org.example.exception.NotImplementedException;

import java.util.List;

public class Frame {
    private int score;
    private boolean lastFrame;
    private IGenerateur generateur;
    private List<Roll> rolls;

    public Frame(IGenerateur generateur, boolean lastFrame) {
        this.lastFrame = lastFrame;
        this.generateur = generateur;
    }

    public boolean makeRoll() throws NotImplementedException {
        throw new NotImplementedException("Not implementedd yet");
    }
}