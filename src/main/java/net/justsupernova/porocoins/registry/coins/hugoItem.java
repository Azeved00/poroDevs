package net.justsupernova.porocoins.registry.coins;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.blocks.hugoBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class hugoItem {

    //items
    public static final Item HUGO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));

    //block items
    public static final BlockItem HUGO_BLOCK = new BlockItem(hugoBlock.HUGO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    //ore
    public static final BlockItem HUGO_ORE = new BlockItem(hugoBlock.HUGO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static void register() {
        //hugo coin
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_coin"), HUGO_COIN);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_block"), HUGO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_ore"), HUGO_ORE);
    }
}