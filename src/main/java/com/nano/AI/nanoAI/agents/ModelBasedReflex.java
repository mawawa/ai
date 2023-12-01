package com.nano.AI.nanoAI.agents;

public class ModelBasedReflex implements Agent{
    @Override
    public String getDefinition() {
        return  "The Model-based agent can work in a partially observable\n" +
                "environment, and track the situation.\n" +
                "\n" +
                "A model-based agent has two important factors:\n" +
                "\n" +
                "Model: It is knowledge about \"how things happen in the world,\" so it is called\n" +
                "a Model-based agent.\n" +
                "\n" +
                "Internal State: It is a representation of the current state based on percept\n" +
                "history.\n" +
                "\n" +
                "These agents have the model, \"which is knowledge of the world\" and\n" +
                "based on the model they perform actions.";
    }
}
