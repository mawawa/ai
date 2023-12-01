package com.nano.AI.nanoAI;

import jakarta.persistence.*;

@Entity
public class NanoAI {
    @SequenceGenerator(name = "nano_generator", sequenceName = "nano_generator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nano_generator")
    @Id
    Long aiID;

}
