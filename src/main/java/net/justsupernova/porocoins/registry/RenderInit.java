package net.justsupernova.porocoins.registry;

import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.entity.model.*;
import net.justsupernova.porocoins.registry.entity.render.*;
import net.justsupernova.porocoins.network.EntitySpawnPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class RenderInit {

    //public static final EntityModelLayer RED_FUNGUS_LAYER = 
    //new EntityModelLayer(new Identifier("porocoins:red_fungus_render_layer"), "red_fungus_render_layer");
    public static final EntityModelLayer CUBE_LAYER = 
    new EntityModelLayer(new Identifier("porocoins:cube_render_layer"), "cube_render_layer");
    
    public static void init() {
        // Entity Renderer
        //EntityRendererRegistry.INSTANCE.register(PoroCoins.RED_FUNGUS_ENTITY, RedFungusRenderer::new);
        //EntityModelLayerRegistry.registerModelLayer(RED_FUNGUS_LAYER, RedFungusModel::getTexturedModelData);


        EntityRendererRegistry.INSTANCE.register(PoroCoins.CUBE, cubeRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(CUBE_LAYER, cubeModel::getTexturedModelData);
        
        // Network
        ClientPlayNetworking.registerGlobalReceiver(EntitySpawnPacket.ID, EntitySpawnPacket::onPacket);

    }
}