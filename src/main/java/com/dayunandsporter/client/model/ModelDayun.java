package com.dayunandsporter.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ModelDayun<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dayun_and_sporter", "dayun"), "main");
	public final ModelPart bb_main;

	public ModelDayun(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshDefinition = new MeshDefinition();
		PartDefinition partDefinition = meshDefinition.getRoot();
		PartDefinition bb_main = partDefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-112.0F, -48.0F, -1.0F, 112.0F, 48.0F, 64.0F).texOffs(0, 113).addBox(-128.0F, -36.0F, -1.0F, 16.0F, 36.0F, 64.0F),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshDefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		poseStack.pushPose();
		// 向左旋转90度（让车头朝向正确）
		poseStack.mulPose(com.mojang.math.Axis.YP.rotationDegrees(-90));
		// 平移补偿：让模型居中
		poseStack.translate(2.0D, 0.0D, 0.0D);
		bb_main.render(poseStack, vertexConsumer, light, overlay, red, green, blue, alpha);
		poseStack.popPose();
	}
}
