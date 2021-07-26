package net.justsupernova.porocoins.registry.entity.render;

import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.RenderInit;
import net.justsupernova.porocoins.registry.entity.cubeEntity;
import net.justsupernova.porocoins.registry.entity.model.cubeModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class cubeRenderer extends MobEntityRenderer<cubeEntity, cubeModel>{
    private static final Identifier TEXTURE = new Identifier(PoroCoins.MOD_ID,"textures/entity/cube.png");

    public cubeRenderer(EntityRendererFactory.Context context) {
        super(context, new cubeModel(context.getPart(RenderInit.CUBE_LAYER)), 0.5f);
    }
    
    @Override
    public Identifier getTexture(cubeEntity entity) {
        return TEXTURE;
    }
    
}
