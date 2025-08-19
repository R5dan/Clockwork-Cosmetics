package net.r5dan.clockworkcosmetics.item.armor.client.model;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class BucketHatModel extends ArmorModel {
	public BucketHatModel(ModelPart root) {
        super(root);
	}

	public static LayerDefinition    createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Bucket = partdefinition.addOrReplaceChild("Bucket", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, 3.0F, -7.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(24, 14).addBox(-4.0F, 3.0F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(3.0F, 3.0F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -3.0F, -8.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(14, 28).addBox(-3.0F, 3.0F, -8.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-3.0F, 3.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 4.0F));

		PartDefinition cube_r1 = Bucket.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -3.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = Bucket.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 14).addBox(0.0F, -3.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}