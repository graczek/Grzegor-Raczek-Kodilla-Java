package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.com.kodilla.patterns.strategy.social.*;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        User johnwayne = new YGeneration("johnwayne");
        User jenny = new ZGeneration("jenny");
        User jack = new Millenials("jack");

        johnwayne.share("my name is john. john wayne");
        jenny.share("i'm jenny");
        jack.share("yo. my name is jacko");

    }

    @Test
    public void testIndividualSharingStrategy() {
        User mike = new YGeneration("mike");
        mike.setSocialPublishingStrategy(new FacebookPublisher());
        mike.share("stop this black friday madness!");
    }
}
