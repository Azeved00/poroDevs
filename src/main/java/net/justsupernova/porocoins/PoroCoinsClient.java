package net.justsupernova.porocoins;

import net.fabricmc.api.ClientModInitializer;
import net.justsupernova.porocoins.registry.RenderInit;

public class PoroCoinsClient implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        RenderInit.init();
    }
    
}
