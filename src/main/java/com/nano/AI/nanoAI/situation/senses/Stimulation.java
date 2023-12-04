package com.nano.AI.nanoAI.situation.senses;

public class Stimulation implements SoundVibe {

    private int soundAmplitude;
    private int soundFrequency;

    @Override
    public int getAmplitude() {
        return this.soundAmplitude;
    }

    @Override
    public int getFrequency() {
        return this.soundFrequency;
    }
}
