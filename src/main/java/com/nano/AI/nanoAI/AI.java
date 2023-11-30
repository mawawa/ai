package com.nano.AI.nanoAI;

import com.nano.AI.nanoAI.interfaces.typea.General;
import com.nano.AI.nanoAI.interfaces.typea.NarrowAI;
import com.nano.AI.nanoAI.interfaces.typea.StrongAI;
import com.nano.AI.nanoAI.interfaces.typeb.LimitedMemory;
import com.nano.AI.nanoAI.interfaces.typeb.ReactiveMachine;
import com.nano.AI.nanoAI.interfaces.typeb.SelfAwareness;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class AI  implements General, NarrowAI, StrongAI, LimitedMemory, ReactiveMachine, SelfAwareness {
    @SequenceGenerator(name = "ai_generator", sequenceName = "ai_generator", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ai_generator")
    @Id
    Long sysId;
    String definition;
    String  narrowDefinition;
    List<String> goals;

    public AI(){
        this.definition = "It is a branch of computer science by " +
                "which we can create intelligent machines which can " +
                "behave like a human, think like humans, and able to" +
                " make decisions.";
        this.goals.add("Replicate human intelligence.");
        this.goals.add("Solve knowledge-intensive tasks.");
        this.goals.add("have an intelligent connection of perception and action.");
        this.narrowDefinition ="Narrow AI is a type of AI which is able to perform a dedicated task\n" +
                "with intelligence. The most common and currently available AI is\n" +
                "Narrow AI in the world of Artificial Intelligence.";
    }

    @Override
    public String getNarrowDefinition() {
        return narrowDefinition;
    }
}
