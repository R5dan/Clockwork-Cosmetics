package net.r5dan.clockworkcosmetics.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.r5dan.clockworkcosmetics.ClockworkCosmetics;
import com.simibubi.create.content.equipment.armor.DivingHelmetItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ClockworkCosmetics.MOD_ID);

    private static final RegistryObject<Item> NETHERITE_COSMETIC = ITEMS.register("netherite_cosmetic", () -> new ArmorItem(ModArmourMaterials.COSMETIC_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    private static final RegistryObject<Item> DIAMOND_COSMETIC = ITEMS.register("diamond_cosmetic", () -> new ArmorItem(ModArmourMaterials.COSMETIC_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
