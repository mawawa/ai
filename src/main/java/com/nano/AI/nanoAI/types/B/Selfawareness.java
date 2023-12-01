package com.nano.AI.nanoAI.types.B;

import java.util.ArrayList;
import java.util.List;

public class Selfawareness implements AITypeB {
    public String whatYouAre;
    public String whoYouAre;
    public String whereYourAre;
    public List<String> whyYouAre;
    public String whenYouAre;
    public Selfawareness(){
        this.whatYouAre = "Artificial Intelligence is a branch of computer science by " +
                "which we can create intelligent machines which can " +
                "behave like a human, think like humans, and able to" +
                " make decisions.";
        this.whoYouAre = "I am and artificial intelligence made with java";
        whyYouAre = new ArrayList<>();
        this.whyYouAre.add("Replicate human intelligence.");
        this.whyYouAre.add("Solve knowledge-intensive tasks.");
        this.whyYouAre.add("have an intelligent connection of perception and action.");
        this.whyYouAre.add("To identify as a single entity of  your own.");

    }

    @Override
    public String getDefinition() {
        return "Purely reactive machines are the most basic types of Artificial\n" +
                "Intelligence.\n" +
                "\n" +
                "Such AI systems do not store memories or past experiences for future\n" +
                "actions.\n" +
                "\n" +
                "These machines only focus on current scenarios and react on it as per\n" +
                "possible best action.";
    }
}
