package net.justsupernova.porocoins.registry.worldGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.justsupernova.porocoins.PoroCoins;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import static net.justsupernova.porocoins.registry.worldGen.OreGen.*;

public class OreGen_Initializer {

    public static void registerFeature() {

        RegistryKey<ConfiguredFeature<?, ?>> oreTiagoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(PoroCoins.MOD_ID, "ore_tiago_overworld"));
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTiagoOverworld.getValue(), ORE_TIAGO_OVERWORLD);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTiagoOverworld);

        /*

        RegistryKey<ConfiguredFeature<?, ?>> oreAzevedoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(PoroCoins.MOD_ID, "ore_azevedo_overworld"));
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTiagoOverworld.getValue(), ORE_AZEVEDO_OVERWORLD);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAzevedoOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreHugoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(PoroCoins.MOD_ID, "ore_hugo_overworld"));
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTiagoOverworld.getValue(), ORE_HUGO_OVERWORLD);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreHugoOverworld);

        /*
        RegistryKey<ConfiguredFeature<?, ?>> oreJoaoOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(PoroCoins.MOD_ID, "ore_joao_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTiagoOverworld.getValue(), ORE_JOAO_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreJoaoOverworld);
         */
    }
}