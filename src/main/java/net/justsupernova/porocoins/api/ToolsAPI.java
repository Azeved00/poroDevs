package net.justsupernova.porocoins.api;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolsAPI implements ToolMaterial
{
    private final int durability;
    private final int speed_Mult;
    private final int a_damage;
    private final int mining_level;
    private final int enchantability;
    private final Item repair_item;

    ToolsAPI(int durability, int speed_mult,int ad, int mining_level,int enchantability,Item repair_item)
    {
        this.durability = durability;
        this.speed_Mult = speed_mult;
        this.a_damage = ad;
        this.mining_level= mining_level;
        this.enchantability = enchantability;
        this.repair_item = repair_item;
    }
    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return speed_Mult;
    }

    @Override
    public float getAttackDamage() {
        return a_damage;
    }

    @Override
    public int getMiningLevel() {
        return mining_level;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(repair_item);
    }
}
