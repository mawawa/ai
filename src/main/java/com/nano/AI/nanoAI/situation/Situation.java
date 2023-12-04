package com.nano.AI.nanoAI.situation;

import com.nano.AI.nanoAI.situation.senses.Stimulation;
import jakarta.persistence.*;

@Entity
public class Situation implements Problem, Learning {
    @SequenceGenerator(name = "situation_generator", sequenceName = "situation_generator")
    @GeneratedValue(generator = "situation_generator", strategy = GenerationType.SEQUENCE)
    @Id

    Stimulation stimulation;

    @Override
    public boolean isDeductive() {
        return false;
    }

    @Override
    public boolean isInductive() {
        return false;
    }

    @Override
    public boolean isAuditoryLearning() {
        return false;
    }

    @Override
    public boolean isEpisodicLearning() {
        return false;
    }

    @Override
    public boolean isMotorLearning() {
        return false;
    }

    @Override
    public boolean isObservationalLearning() {
        return false;
    }

    @Override
    public boolean isStimulusResponseLearning() {
        return false;
    }

    @Override
    public boolean isRelationalLearning() {
        return false;
    }

    @Override
    public boolean isSpatialLearning() {
        return false;
    }
}
