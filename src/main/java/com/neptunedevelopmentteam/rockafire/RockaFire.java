package com.neptunedevelopmentteam.rockafire;

import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneInitHandler;
import com.neptunedevelopmentteam.rockafire.items.RockaFireItems;
import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class RockaFire implements ModInitializer {

    public static final String MOD_ID = "rockafire";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        NeptuneInitHandler.register(RockaFireItems.class, MOD_ID);
    }
}
