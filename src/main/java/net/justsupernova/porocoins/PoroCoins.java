package net.justsupernova.porocoins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.justsupernova.porocoins.registry.Block_Initializer;
import net.justsupernova.porocoins.registry.Combat_Initializer;
import net.justsupernova.porocoins.registry.Item_Initializer;
import net.justsupernova.porocoins.registry.entity.RedFungusEntity;
import net.justsupernova.porocoins.registry.worldGen.OreGen_Initializer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class PoroCoins implements ModInitializer {

    public static final String MOD_ID = "porocoins";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build
            (
                    new Identifier(MOD_ID,"general"),
                    () -> new ItemStack(Item_Initializer.TIAGO_COIN)
            );


    public static final EntityType<RedFungusEntity> RED_FUNGUS_ENTITY = FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RedFungusEntity::new).dimensions(EntityDimensions.fixed(1.05F, 1.4F))
            .build();

    @Override
    public void onInitialize() {
        System.out.println("Now Loading PoroCoins!");

        Item_Initializer.registerItems();
        Block_Initializer.registerBlocks();
        Block_Initializer.registerBlockItems();
        OreGen_Initializer.registerFeature();

        Combat_Initializer.registerArmor();
        Combat_Initializer.registerTools();

        Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "red_fungus"), RED_FUNGUS_ENTITY);

    }
}