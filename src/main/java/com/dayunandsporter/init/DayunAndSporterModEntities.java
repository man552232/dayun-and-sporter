
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dayunandsporter.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import com.dayunandsporter.entity.DayunEntity;
import com.dayunandsporter.DayunAndSporterMod;

public class DayunAndSporterModEntities {
	public static EntityType<DayunEntity> DAYUN;

	public static void load() {
		DAYUN = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(DayunAndSporterMod.MODID, "dayun"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, DayunEntity::new).dimensions(new EntityDimensions(8f, 3f, true)).fireImmune().trackRangeBlocks(300).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DayunEntity.init();
		FabricDefaultAttributeRegistry.register(DAYUN, DayunEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
