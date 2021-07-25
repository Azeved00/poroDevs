package net.justsupernova.porocoins.registry.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.blocks.azevedoBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class azevedoItem {

    //items
    public static final Item AZEVEDO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));

    //block items
    public static final BlockItem AZEVEDO_BLOCK = new BlockItem(azevedoBlock.AZEVEDO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    //ore
    public static final BlockItem AZEVEDO_ORE = new BlockItem(azevedoBlock.AZEVEDO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static void register() {
        //hugo coin
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_coin"), AZEVEDO_COIN);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_block"), AZEVEDO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_ore"), AZEVEDO_ORE);
    }
}