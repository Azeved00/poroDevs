package net.justsupernova.porocoins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.justsupernova.porocoins.registry.armors.azevedoArmor;
import net.justsupernova.porocoins.registry.items.azevedoItem;
import net.justsupernova.porocoins.registry.blocks.azevedoBlock;
import net.justsupernova.porocoins.registry.armors.hugoArmor;
import net.justsupernova.porocoins.registry.armors.joaoArmor;
import net.justsupernova.porocoins.registry.blocks.hugoBlock;
import net.justsupernova.porocoins.registry.blocks.joaoBlock;
import net.justsupernova.porocoins.registry.items.hugoItem;
import net.justsupernova.porocoins.registry.items.joaoItem;
import net.justsupernova.porocoins.registry.armors.tiagoArmor;
import net.justsupernova.porocoins.registry.items.tiagoItem;
import net.justsupernova.porocoins.registry.blocks.tiagoBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class PoroCoins implements ModInitializer {

    public static final String MOD_ID = "porocoins";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build
            (
                    new Identifier(MOD_ID,"general"),
                    () -> new ItemStack(tiagoItem.TIAGO_COIN)
            );

    @Override
    public void onInitialize() {
        tiagoItem.register();
        tiagoBlock.register();
        tiagoBlock.registerFeature();
        tiagoArmor.register();

        hugoItem.register();
        hugoBlock.register();
        hugoBlock.registerFeature();
        hugoArmor.register();

        azevedoItem.register();
        azevedoBlock.register();
        azevedoBlock.registerFeature();
        azevedoArmor.register();

        joaoItem.register();
        joaoBlock.register();
        joaoBlock.registerFeature();
        joaoArmor.register();
    }
}