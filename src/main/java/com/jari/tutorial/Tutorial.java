package com.jari.tutorial;

import com.jari.tutorial.registry.ModItems;
import net.fabricmc.api.ModInitializer;


public class Tutorial implements ModInitializer {

    public static final String MOD_ID = "tutorial";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }

}
