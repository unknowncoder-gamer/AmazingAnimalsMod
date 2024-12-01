package net.adharsh.amazing_animals;

import net.adharsh.amazing_animals.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazingAnimals implements ModInitializer {
	public static final String MOD_ID = "amazing-animals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}