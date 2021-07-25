package net.justsupernova.porocoins.registry.armors;

import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.Item_Initializer;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class joaoArmor implements ArmorMaterial
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
        return Ingredient.ofItems(Item_Initializer.JOAO_COIN);
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

    public static final ArmorMaterial joao_armor = new joaoArmor();

    public static final Item joaoHelmet = new ArmorItem(joao_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item joaoChestplate = new ArmorItem(joao_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item joaoLeggings = new ArmorItem(joao_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
    public static final Item joaoBoots = new ArmorItem(joao_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));

    public static void register()
    {
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_helmet"), joaoHelmet);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_chestplate"), joaoChestplate);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_leggings"), joaoLeggings);
        Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "joao_boots"), joaoBoots);
    }
}
