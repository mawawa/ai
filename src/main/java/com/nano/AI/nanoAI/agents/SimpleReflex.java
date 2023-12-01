package com.nano.AI.nanoAI.agents;

public class SimpleReflex implements Agent {

    @Override
    public String getDefinition() {
        return "The Simple reflex agents are the simplest agents. These agents take\n" +
                "decisions on the basis of the current percepts and ignore the rest of\n" +
                "the percept history.\n" +
                "\n" +
                "These agents only succeed in the fully observable environment.\n" +
                "\n" +
                "The Simple reflex agent does not consider any part of percepts\n" +
                "history during their decision and action process.\n" +
                "\n" +
                "The Simple reflex agent works on Condition-action rule, which means\n" +
                "it maps the current state to action. Such as a Room Cleaner agent, it\n" +
                "works only if there is dirt in the room.";
    }
}
