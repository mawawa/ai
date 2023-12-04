package com.nano.AI.nanoAI;

import com.nano.AI.nanoAI.agents.GoalBased;
import com.nano.AI.nanoAI.aitypes.A.AITypeA;
import com.nano.AI.nanoAI.aitypes.B.AITypeB;
import com.nano.AI.nanoAI.situation.Situation;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class NanoAI {
    @SequenceGenerator(name = "nano_generator", sequenceName = "nano_generator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nano_generator")
    @Id
    Long aiID;
    List<String> typesOfIntelligence;
    AITypeA typeAIntelligence;
    AITypeB typeBIntelligence;
    Situation situation;

    //this is a portion that i feel may later be necessary
    public boolean defineGoal(){
        throw new UnsupportedOperationException("The application still can think of goals.");
    }

    //the ai should be able to reason
    public boolean reason(Situation situation){
        if(situation.isDeductive()){
            //this situation must be deduced.

        }
        throw new UnsupportedOperationException("This method needs to be implemented");
    }

    //the ai should be able to
    public boolean learn(Situation situation){
        throw new UnsupportedOperationException("Method is still to be implemented");
    }
    
    //the ai should also be able to solve problem
    public boolean solve(Situation situation){
        throw new UnsupportedOperationException("Method is still to be implemented");
    }
    public boolean perceive(Situation situation){
        throw new UnsupportedOperationException("Method perceive has not be implemented.");
    }


}
