package com.nano.AI.nanoAI.aitypes.B;

import java.util.ArrayList;
import java.util.List;

public class Selfawareness implements AITypeB {
    public String whatYouAre;
    public String whoYouAre;
    public String whereYourAre;
    public List<String> whyYouAre;
    public String whenYouAre;
    public Selfawareness(){
        this.whatYouAre = "I am Self aware";
        whyYouAre = new ArrayList<>();
        this.whyYouAre.add("Replicate human intelligence.");
        this.whyYouAre.add("Solve knowledge-intensive tasks.");
        this.whyYouAre.add("have an intelligent connection of perception and action.");
        this.whyYouAre.add("To identify as a single entity of  your own.");

    }

    @Override
    public String getDefinition() {
        return "Self-awareness AI is the future of Artificial Intelligence. These\n" +
                "machines will be super intelligent, and will have their own\n" +
                "consciousness, sentiments, and self-awareness.";
    }
}
