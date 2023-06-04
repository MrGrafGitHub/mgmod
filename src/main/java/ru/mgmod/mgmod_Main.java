package ru.mgmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.mgmod.block.mgmod_Blocks;
import ru.mgmod.item.mgmod_Items;

public class mgmod_Main implements ModInitializer {
    public static final String MOD_ID ="mgmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        mgmod_Items.initialize();
        mgmod_Blocks.initialize();
    }
}
