package net.justsupernova.porocoins.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.justsupernova.porocoins.PoroCoins;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class Block_Initializer {
    public static final Block TIAGO_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));
    public static final Block AZEVEDO_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));
    public static final Block HUGO_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));
    //public static final Block JOAO_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));

    public static final Block TIAGO_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));
    public static final Block AZEVEDO_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));
    public static final Block HUGO_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));
    //public static final Block JOAO_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0F, 2.0F));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "tiago_ore"), TIAGO_ORE);
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "azevedo_ore"), AZEVEDO_ORE);
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "hugo_ore"), HUGO_ORE);

        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "tiago_block"), TIAGO_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "azevedo_block"), AZEVEDO_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "hugo_block"), HUGO_BLOCK);
        //Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "joao_ore"), JOAO_ORE);
    }

    public static void registerBlockItems()
    {
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_ore"), new BlockItem(TIAGO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_ore"), new BlockItem(AZEVEDO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_ore"), new BlockItem(HUGO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
        //Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_ore"), new BlockItem(JOAO_ORE, new Item.Settings().group(PoroCoins.ITEM_GROUP)));


        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_block"), new BlockItem(TIAGO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_block"), new BlockItem(AZEVEDO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_block"), new BlockItem(HUGO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
        //Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_block"), new BlockItem(JOAO_BLOCK, new Item.Settings().group(PoroCoins.ITEM_GROUP)));
    }
}
