
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dayunandsporter.init;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import com.dayunandsporter.client.model.ModelDayun;

@Environment(EnvType.CLIENT)
public class DayunAndSporterModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(ModelDayun.LAYER_LOCATION, ModelDayun::createBodyLayer);
	}
}
