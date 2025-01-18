package dev.trigam.saw;

import dev.trigam.saw.config.SawConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Saw implements ModInitializer {
	public static final String MOD_ID = "saw";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id (String path) {
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, SawConfig.class);
	}
}