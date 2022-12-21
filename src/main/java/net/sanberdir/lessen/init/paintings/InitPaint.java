package net.sanberdir.lessen.init.paintings;

import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir.lessen.Lessen;

public class InitPaint {
    public static final DeferredRegister<PaintingType> PAINTING_TYPES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Lessen.MOD_ID);

    public static final RegistryObject<PaintingType> DOG =
            PAINTING_TYPES.register("dog", () -> new PaintingType(32, 32));
    public static final RegistryObject<PaintingType> EGGMAN =
            PAINTING_TYPES.register("river", () -> new PaintingType(32, 16));
    public static final RegistryObject<PaintingType> STARS =
            PAINTING_TYPES.register("eggman", () -> new PaintingType(64, 64));


    public static void register(IEventBus eventBus) {
        PAINTING_TYPES.register(eventBus);
    }
}
