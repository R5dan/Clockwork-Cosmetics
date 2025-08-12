package net.r5dan.clockworkcosmetics.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public enum ItemProperties {
    NETHERITE(3, 3f, 0.1f, SoundEvents.ARMOR_EQUIP_NETHERITE, Items.NETHERITE_INGOT),
    DIAMOND(3, 2f, 0f, SoundEvents.ARMOR_EQUIP_DIAMOND, Items.DIAMOND),
    IRON(2,0f,0f, SoundEvents.ARMOR_EQUIP_IRON, Items.IRON_INGOT),
    GOLD(2,0f,0f, SoundEvents.ARMOR_EQUIP_GOLD, Items.GOLD_INGOT),
    LEATHER(1, 0f, 0f, SoundEvents.ARMOR_EQUIP_LEATHER, Items.LEATHER);

    public final int PROTECTION;
    public final float TOUGHNESS;
    public final float KNOCKBACK_RESISTANCE;
    public final SoundEvent SOUND;
    public final Item Ingredient;

    ItemProperties(int protection, float toughness, float knockbackResistance, SoundEvent sound, Item ingredient) {
        PROTECTION = protection;
        TOUGHNESS = toughness;
        KNOCKBACK_RESISTANCE = knockbackResistance;
        SOUND = sound;
        Ingredient = ingredient;
    }
}
