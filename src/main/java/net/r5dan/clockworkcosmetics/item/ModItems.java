package net.r5dan.clockworkcosmetics.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.r5dan.clockworkcosmetics.ClockworkCosmetics;
// import com.simibubi.create.content.equipment.armor.DivingHelmetItem;
import net.r5dan.clockworkcosmetics.item.armor.BucketHatArmourItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ClockworkCosmetics.MOD_ID);

    public static final RegistryObject<BucketHatArmourItem> BUCKET_HAT = ITEMS.register("bucket_hat", BucketHatArmourItem::new);

    public static void register(IEventBus eventBus) {
        ClockworkCosmetics.LOGGER.debug("REGISTERING ITEMS: {}", ITEMS.toString());
        ITEMS.register(eventBus);
    }
}
