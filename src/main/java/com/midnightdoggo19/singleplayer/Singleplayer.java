package com.midnightdoggo19.singleplayer;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Midnight Doggo
 * Lets you know it's running. That's all.
 */

public class Singleplayer implements ModInitializer {
	public static final String MOD_ID = "singleplayer";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Minecraft on Lonely Mode.");
	}
}