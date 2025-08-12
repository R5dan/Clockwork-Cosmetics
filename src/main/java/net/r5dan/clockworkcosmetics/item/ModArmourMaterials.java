package net.r5dan.clockworkcosmetics.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.r5dan.clockworkcosmetics.ClockworkCosmetics;

import java.util.function.Supplier;

public enum ModArmourMaterials implements ArmorMaterial {
    COSMETIC_NETHERITE("cosmetic", 26, ItemProperties.NETHERITE.PROTECTION, 25, SoundEvents.ARMOR_EQUIP_GOLD, ItemProperties.NETHERITE.TOUGHNESS, ItemProperties.NETHERITE.KNOCKBACK_RESISTANCE, () -> Ingredient.of(ItemProperties.NETHERITE.Ingredient)),
    COSMETIC_DIAMOND("cosmetic", 26, ItemProperties.DIAMOND.PROTECTION, 25, SoundEvents.ARMOR_EQUIP_GOLD, ItemProperties.DIAMOND.TOUGHNESS, ItemProperties.DIAMOND.KNOCKBACK_RESISTANCE, () -> Ingredient.of(ItemProperties.DIAMOND.Ingredient));


    private final String name;
    private final int durabilityMultiplier;
    private final int protectionAmount;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int BASE_DURABILITY = 11;


    ModArmourMaterials(String name, int durabilityMultiplier, int protectionAmount, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmount = protectionAmount;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmount;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return ClockworkCosmetics.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
