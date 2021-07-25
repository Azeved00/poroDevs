package net.justsupernova.porocoins.registry.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.blocks.tiagoBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class tiagoItem {
    //items
    public static final Item TIAGO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));

    //block items
    public static final BlockItem TIAGO_BLOCK = new BlockItem(tiagoBlock.TIAGO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final BlockItem TIAGO_ORE = new BlockItem(tiagoBlock.TIAGO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP));


    public static void register() {
        //tiago coin
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_coin"), TIAGO_COIN);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_block"), TIAGO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_ore"), TIAGO_ORE);
    }
}
