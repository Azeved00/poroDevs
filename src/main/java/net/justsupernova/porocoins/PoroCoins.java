package net.justsupernova.porocoins;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.justsupernova.porocoins.registry.Block_Initializer;
import net.justsupernova.porocoins.registry.Item_Initializer;
import net.justsupernova.porocoins.registry.Combat_Initializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class PoroCoins implements ModInitializer {

    public static final String MOD_ID = "porocoins";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build
            (
                    new Identifier(MOD_ID,"general"),
                    () -> new ItemStack(Item_Initializer.TIAGO_COIN)
            );

    @Override
    public void onInitialize() {
        System.out.println("Now Loading PoroCoins!");

        Item_Initializer.registerItems();
        Block_Initializer.registerBlocks();
        Block_Initializer.registerBlockItems();
        //OreGen_Initializer.registerFeature();

        Combat_Initializer.register();

    }
}