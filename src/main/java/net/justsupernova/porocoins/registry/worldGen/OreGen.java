package net.justsupernova.porocoins.registry.worldGen;

import net.justsupernova.porocoins.registry.Block_Initializer;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen

{

    private static final int tiagoMaxLevel = 64;
    private static final int azevedoMaxLevel = 64;
    private static final int hugoMaxLevel = 64;
    //static int joaoMaxLevel = 64;

    private static final int tiagoVeinSize = 8;
    private static final int azevedoVeinSize = 8;
    private static final int hugoVeinSize = 8;
    //private static final int joaoVeinSize = 8;

    private static final int tiagoVeinPerChunk = 10;
    private static final int azevedoVeinPerChunk = 10;
    private static final int hugoVeinPerChunk = 10;
    //private static final int joaoVeinPerChunk = 10;

    public static final ConfiguredFeature<?, ?> ORE_TIAGO_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Block_Initializer.TIAGO_ORE.getDefaultState(),
                    tiagoVeinSize)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(tiagoMaxLevel))
            .spreadHorizontally()
            .repeat(tiagoVeinPerChunk); // number of veins per chunk

    public static final ConfiguredFeature<?, ?> ORE_AZEVEDO_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Block_Initializer.AZEVEDO_ORE.getDefaultState(),
                    azevedoVeinSize)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(azevedoMaxLevel))
            .spreadHorizontally()
            .repeat(azevedoVeinPerChunk); // number of veins per chunk

    public static final ConfiguredFeature<?, ?> ORE_HUGO_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Block_Initializer.HUGO_ORE.getDefaultState(),
                    hugoVeinSize)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(hugoMaxLevel))
            .spreadHorizontally()
            .repeat(hugoVeinPerChunk); // number of veins per chunk


    /*
    public static final ConfiguredFeature<?, ?> ORE_JOAO_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Block_Initializer.JOAO_ORE.getDefaultState(),
                    joaoVeinSize)) // vein size
            .uniformRange(YOffset.getBottom(), YOffset.fixed(joaoMaxLevel))
            .spreadHorizontally()
            .repeat(joaoVeinPerChunk); // number of veins per chunk
    */
}