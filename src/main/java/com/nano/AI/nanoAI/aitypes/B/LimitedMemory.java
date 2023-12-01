package com.nano.AI.nanoAI.aitypes.B;

public class LimitedMemory implements AITypeB {
    @Override
    public String getDefinition() {
        return "Limited memory machines can store past experiences or some data\n" +
                "for a short period of time.\n" +
                "\n" +
                "These machines can use stored data for a limited time period only.\n" +
                "\n" +
                "Self-driving cars are one of the best examples of Limited Memory\n" +
                "systems. These cars can store recent speed of nearby cars, the\n" +
                "distance of other cars, speed limit, and other information to navigate\n" +
                "the road.";
    }
}
