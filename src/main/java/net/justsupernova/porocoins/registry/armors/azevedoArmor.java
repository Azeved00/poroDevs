package net.justsupernova.porocoins.registry.armors;

import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.coins.azevedoItem;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class azevedoArmor implements ArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[] {1, 1, 1, 1};
    private static final int[] PROTECTION_VALUES = new int[] {99, 99, 99, 99};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return Integer.MAX_VALUE;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(azevedoItem.AZEVEDO_COIN);
    }

    @Override
    public String getName() {
        return "name";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.0F;
    }

    public static final ArmorMaterial azevedo_armor = new azevedoArmor();

    public static final Item azevedoHelmet = new ArmorItem(azevedo_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item azevedoChestplate = new ArmorItem(azevedo_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item azevedoLeggings = new ArmorItem(azevedo_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item azevedoBoots = new ArmorItem(azevedo_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo helmet"), azevedoHelmet);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo chestplate"), azevedoChestplate);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo leggings"), azevedoLeggings);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "azevedo boots"), azevedoBoots);
    }
}
