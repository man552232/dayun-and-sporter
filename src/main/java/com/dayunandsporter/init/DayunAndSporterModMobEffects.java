
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dayunandsporter.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.dayunandsporter.potion.SporterMobEffect;
import com.dayunandsporter.DayunAndSporterMod;

public class DayunAndSporterModMobEffects {
	public static MobEffect SPORTER;

	public static void load() {
		SPORTER = register("sporter", new SporterMobEffect());
	}

	private static MobEffect register(String registryName, MobEffect element) {
		return Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(DayunAndSporterMod.MODID, registryName), element);
	}
}
