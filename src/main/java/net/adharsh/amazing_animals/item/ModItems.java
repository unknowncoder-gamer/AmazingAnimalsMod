package net.adharsh.amazing_animals.item;

import net.adharsh.amazing_animals.AmazingAnimals;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmazingAnimals.MOD_ID,name),item);
    }

    public static void registerModItems(){
        AmazingAnimals.LOGGER.info("Registering Mod Items for " + AmazingAnimals.MOD_ID);
    }
}
