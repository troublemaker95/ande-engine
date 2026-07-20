package com.ande;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    // Logger prints messages so we can see what ANDE is doing
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("===========================================");
        log.info("  ANDE - Adaptive Network Deception Engine");
        log.info("  Starting up...");
        log.info("===========================================");

        log.info("Preparing to listen for attackers...");
    }
}
