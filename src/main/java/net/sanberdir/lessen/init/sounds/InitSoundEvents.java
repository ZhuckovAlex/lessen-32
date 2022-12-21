package net.sanberdir.lessen.init.sounds;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir.lessen.Lessen;

public class InitSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Lessen.MOD_ID);

    public static final RegistryObject<SoundEvent> GUITAR = registerSoundEvent("guitar");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Lessen.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
