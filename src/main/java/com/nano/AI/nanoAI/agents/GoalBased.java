package com.nano.AI.nanoAI.agents;

public class GoalBased implements Agent{
    @Override
    public String getDefinition() {
        return "The knowledge of the current state environment is not always\n" +
                "sufficient to decide for an agent to what to do.\n" +
                "\n" +
                "The agent needs to know its goal which describes desirable\n" +
                "situations.\n" +
                "\n" +
                "Goal-based agents expand the capabilities of the model-based agent\n" +
                "by having the \"goal\" information.\n" +
                "\n" +
                "They choose an action, so that they can achieve the goal.";
    }
}
