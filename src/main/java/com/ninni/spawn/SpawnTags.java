package com.ninni.spawn;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import static com.ninni.spawn.Spawn.MOD_ID;

public interface SpawnTags {

    //Item tags
    TagKey<Item> ANGLER_FISH_TEMPTS = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "angler_fish_tempts"));
    TagKey<Item> ANGLER_FISH_LIKES = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "angler_fish_likes"));
    TagKey<Item> TUNA_TEMPTS = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "tuna_tempts"));
    TagKey<Item> SNAIL_TEMPTS = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "snail_tempts"));
    TagKey<Item> HAMSTER_TEMPTS = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "hamster_tempts"));
    TagKey<Item> HAMSTER_FEEDS = TagKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, "hamster_feeds"));

    //Block tags
    TagKey<Block> MUCUS_SOLIDIFIER = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "mucus_solidifier"));
    TagKey<Block> MUCUS_SOLIDIFICATION_SPREADER = TagKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, "mucus_solidification_spreader"));

    //Biome tags
    TagKey<Biome> SNAIL_SPAWNS = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "snail_spawns"));
    TagKey<Biome> ANGLER_FISH_SPAWNS = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "angler_fish_spawns"));
    TagKey<Biome> TUNA_SPAWNS = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "tuna_spawns"));
    TagKey<Biome> SEAHORSE_SPAWNS = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "seahorse_spawns"));
    TagKey<Biome> HAMSTER_FREQUENTLY_SPAWNS = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "hamster_frequently_spawns"));
    TagKey<Biome> HAMSTER_SPAWNS = TagKey.create(Registries.BIOME, new ResourceLocation(MOD_ID, "hamster_spawns"));

    //pointOfInterestTags
    TagKey<PoiType> ANT_HOME = TagKey.create(Registries.POINT_OF_INTEREST_TYPE, new ResourceLocation(MOD_ID, "ant_home"));
}