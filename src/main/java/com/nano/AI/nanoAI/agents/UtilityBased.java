package com.nano.AI.nanoAI.agents;

public class UtilityBased implements Agent{
    @Override
    public String getDefinition() {
        return  "These agents are similar to the goal-based agent but provide an extra\n" +
                "component of utility measurement which makes them different by\n" +
                "providing a measure of success at a given state.\n" +
                "\n" +
                "Utility-based agent act based not only goals but also the best way to\n" +
                "achieve the goal.\n" +
                "\n" +
                "The Utility-based agent is useful when there are multiple possible\n" +
                "alternatives, and an agent has to choose in order to perform the best\n" +
                "action.\n" +
                "\n" +
                "The utility function maps each state to a real number to check how\n" +
                "efficiently each action achieves the goals.";
    }
}
