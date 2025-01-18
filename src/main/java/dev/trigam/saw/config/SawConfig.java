package dev.trigam.saw.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class SawConfig extends MidnightConfig {

    // Categories
    public static final String EXAMPLE = "Example";

    // Example
    @Comment(category = EXAMPLE) public static Comment example_comment;

}
