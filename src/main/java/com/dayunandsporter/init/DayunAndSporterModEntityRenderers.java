
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dayunandsporter.init;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.dayunandsporter.client.renderer.DayunRenderer;

@Environment(EnvType.CLIENT)
public class DayunAndSporterModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(DayunAndSporterModEntities.DAYUN, DayunRenderer::new);
	}
}
