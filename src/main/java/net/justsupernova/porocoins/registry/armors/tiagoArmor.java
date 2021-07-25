package net.justsupernova.porocoins.registry.armors;

import net.justsupernova.porocoins.PoroCoins;
import net.justsupernova.porocoins.registry.items.tiagoItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

    public class tiagoArmor implements ArmorMaterial
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
            return Ingredient.ofItems(tiagoItem.TIAGO_COIN);
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

        public static final ArmorMaterial tiago_armor = new tiagoArmor();

        public static final Item tiagoHelmet = new ArmorItem(tiago_armor, EquipmentSlot.HEAD, new Item.Settings().group(PoroCoins.ITEM_GROUP));
        public static final Item tiagoChestplate = new ArmorItem(tiago_armor, EquipmentSlot.CHEST, new Item.Settings().group(PoroCoins.ITEM_GROUP));
        public static final Item tiagoLeggings = new ArmorItem(tiago_armor, EquipmentSlot.LEGS, new Item.Settings().group(PoroCoins.ITEM_GROUP));
        public static final Item tiagoBoots = new ArmorItem(tiago_armor, EquipmentSlot.FEET, new Item.Settings().group(PoroCoins.ITEM_GROUP));

        public static void register()
        {
            Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_helmet"), tiagoHelmet);
            Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_chestplate"), tiagoChestplate);
            Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_leggings"), tiagoLeggings);
            Registry.register(Registry.ITEM, new Identifier(PoroCoins.MOD_ID, "tiago_boots"), tiagoBoots);
        }
    }

