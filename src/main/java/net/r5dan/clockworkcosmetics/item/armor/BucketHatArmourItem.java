package net.r5dan.clockworkcosmetics.item.armor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.r5dan.clockworkcosmetics.ClockworkCosmetics;
import net.r5dan.clockworkcosmetics.item.armor.client.model.BucketHatModel;
import net.r5dan.clockworkcosmetics.item.armor.client.provider.ArmorModelProvider;
import net.r5dan.clockworkcosmetics.item.armor.client.provider.SimpleModelProvider;
import org.jetbrains.annotations.Nullable;

public class BucketHatArmourItem extends AbstractArmorItem {
    public static final String TEXTURE_LOCATION = makeCustomTextureLocation(ClockworkCosmetics.MOD_ID, "bucket_hat");
    public BucketHatArmourItem() {
        super(ArmorMaterials.DIAMOND, Type.HELMET, new Properties().rarity(Rarity.EPIC));
        ClockworkCosmetics.LOGGER.debug("REGISTERING BUCKET HAT");
    }

    @Override
    protected boolean withCustomModel() {
        return true;
    }

    @Override
    protected ArmorModelProvider createModelProvider() {
        return new SimpleModelProvider(BucketHatModel::createBodyLayer, BucketHatModel::new);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return TEXTURE_LOCATION;
    }
}
