package net.justsupernova.porocoins.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justsupernova.porocoins.PoroCoins;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Item_Initializer {
    //coins
    public static final Item TIAGO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));
    public static final Item AZEVEDO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));
    public static final Item HUGO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));
    public static final Item JOAO_COIN = new Item(new FabricItemSettings().group(PoroCoins.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_coin"), TIAGO_COIN);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_coin"), AZEVEDO_COIN);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_coin"), HUGO_COIN);
        //Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_coin"), JOAO_COIN);
    }
}
