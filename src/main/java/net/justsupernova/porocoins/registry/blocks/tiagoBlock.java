package net.justsupernova.porocoins.registry.blocks;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.justsupernova.porocoins.PoroCoins;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class tiagoBlock {

    public static final Block TIAGO_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0f,30.0f)
            .sounds(BlockSoundGroup.METAL)
            .luminance(16));

    public static final Block TIAGO_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0f,30.0f)
            .sounds(BlockSoundGroup.STONE)
            .luminance(8)
    );


    private static ConfiguredFeature<?, ?> ORE_TIAGO_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    TIAGO_ORE.getDefaultState(),
                    9)) // Vein size
            .range(new RangeDecoratorConfig(
                    // You can also use one of the other height providers if you don't want a uniform distribution
                    UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64)))) // Inclusive min and max height
            .spreadHorizontally()
            .repeat(16); // Number of veins per chunk

    public static void registerFeature() {
        RegistryKey<ConfiguredFeature<?, ?>> oreTiagoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(PoroCoins.MOD_ID, "ore_tiago_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTiagoOverworld.getValue(), ORE_TIAGO_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTiagoOverworld);
    }

    public static void register(){
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "tiago_block"), TIAGO_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(PoroCoins.MOD_ID, "tiago_ore"), TIAGO_ORE);
    }
}
