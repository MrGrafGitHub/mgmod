package ru.mgmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.mgmod.item.mgmod_Items;

public class mgmod_Main implements ModInitializer {
    public static final String MOD_ID ="mgmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item CUSTOM_ITEM =
            Registry.register(Registries.ITEM, new Identifier("tutorial", "test"),
                    new Item(new FabricItemSettings()));


    @Override
    public void onInitialize() {
        mgmod_Items.registerModItems();
    }
}
