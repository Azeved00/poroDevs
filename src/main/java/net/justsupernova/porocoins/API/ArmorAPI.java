package net.justsupernova.porocoins.API;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class ArmorAPI implements ArmorMaterial
{   
    private Item repair;
    private  String name;
    private  int enchantability;
    private  SoundEvent sound;
    private  float toughness;
    private  float knockback_resistance;
    private  int[] BASE_DURABILITY;
    private  int[] PROTECTION_VALUES;
    
    public ArmorAPI(Item armor_repair_item,String name,int enchantability, SoundEvent equip_sound,float toughness,float knockback_resistance,int[] durability,int[] protection_value){
        this.repair = armor_repair_item;
        this.name = name;
        this.enchantability = enchantability;
        this.sound=equip_sound;
        this.toughness=toughness;
        this.knockback_resistance=knockback_resistance;
        this.BASE_DURABILITY=durability;
        this.PROTECTION_VALUES=protection_value;
    }

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
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(repair);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockback_resistance;
    }

    
}
