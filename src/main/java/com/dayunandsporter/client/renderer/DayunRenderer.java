
package com.dayunandsporter.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.dayunandsporter.entity.DayunEntity;
import com.dayunandsporter.client.model.ModelDayun;

public class DayunRenderer extends MobRenderer<DayunEntity, ModelDayun<DayunEntity>> {
	public DayunRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDayun(context.bakeLayer(ModelDayun.LAYER_LOCATION)), 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayunEntity entity) {
		return new ResourceLocation("dayun_and_sporter:textures/entities/texture.png");
	}

}
