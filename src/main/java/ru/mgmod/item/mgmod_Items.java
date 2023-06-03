package ru.mgmod.item;

import net.minecraft.item.Item;
import ru.mgmod.mgmod_Main;

public class mgmod_Items {
    public class CustomItem extends Item {

        public CustomItem(Item.Settings settings) {
            super(settings);
        }
    }



    public static void registerModItems() {
        mgmod_Main.LOGGER.debug("Registering mod items"+ mgmod_Main.MOD_ID);
    }
}
