package net.justsupernova.porocoins.api;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import java.nio.ShortBuffer;

public class CustomShovelItem extends ShovelItem {
    public CustomShovelItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
