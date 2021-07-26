package net.justsupernova.porocoins.registry;

import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.API.ArmorAPI;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Armor_Initializer{

    public static final ArmorAPI azevedo_armor = new ArmorAPI(
        Item_Initializer.AZEVEDO_COIN,
        "azevedo_armor",
        Integer.MAX_VALUE,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
        1.0F,
        1.0F,
        new int[]{1,1,1,1},
        new int[]{99,99,99,99}
        );
        
    
    public static final ArmorAPI hugo_armor = new ArmorAPI(
        Item_Initializer.HUGO_COIN,
        "hugo_armor",
        Integer.MAX_VALUE,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
        1.0F,
        1.0F,
        new int[]{1,1,1,1},
        new int[]{99,99,99,99}
        );
        
    public static final ArmorAPI tiago_armor = new ArmorAPI(
        Item_Initializer.TIAGO_COIN,
        "tiago_armor",
        Integer.MAX_VALUE,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
        1.0F,
        1.0F,
        new int[]{1,1,1,1},
        new int[]{99,99,99,99}
        );
        
    
    public static final ArmorAPI joao_armor = new ArmorAPI(
        Item_Initializer.JOAO_COIN,
        "joao_armor",
        Integer.MAX_VALUE,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
        1.0F,
        1.0F,
        new int[]{1,1,1,1},
        new int[]{99,99,99,99}
        );
        
    public static final Item azevedoHelmet = new ArmorItem(azevedo_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item azevedoChestplate = new ArmorItem(azevedo_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item azevedoLeggings = new ArmorItem(azevedo_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item azevedoBoots = new ArmorItem(azevedo_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    
    public static final Item hugoHelmet = new ArmorItem(hugo_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item hugoChestplate = new ArmorItem(hugo_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item hugoLeggings = new ArmorItem(hugo_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item hugoBoots = new ArmorItem(hugo_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static final Item tiagoHelmet = new ArmorItem(tiago_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item tiagoChestplate = new ArmorItem(tiago_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item tiagoLeggings = new ArmorItem(tiago_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item tiagoBoots = new ArmorItem(tiago_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static final Item joaoHelmet = new ArmorItem(joao_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item joaoChestplate = new ArmorItem(joao_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item joaoLeggings = new ArmorItem(joao_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item joaoBoots = new ArmorItem(joao_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_helmet"), azevedoHelmet);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_chestplate"), azevedoChestplate);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_leggings"), azevedoLeggings);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo_boots"), azevedoBoots);

        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_helmet"), hugoHelmet);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_chestplate"), hugoChestplate);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_leggings"), hugoLeggings);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "hugo_boots"), hugoBoots);

        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_helmet"), tiagoHelmet);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_chestplate"), tiagoChestplate);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_leggings"), tiagoLeggings);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_boots"), tiagoBoots);

        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_helmet"), joaoHelmet);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_chestplate"), joaoChestplate);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_leggings"), joaoLeggings);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_boots"), joaoBoots);
    
    }
}
