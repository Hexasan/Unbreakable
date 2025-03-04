package sylenthuntress.unbreakable.util;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;

public class ModComponents {
    public static final ComponentType<Integer> SHATTER_LEVEL = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Unbreakable.MOD_ID, "shatter_level"),
            ComponentType.<Integer>builder().codec(Codecs.rangedInt(0, 255)).build()
    );
    public static final ComponentType<Integer> MAX_SHATTER_LEVEL = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Unbreakable.MOD_ID, "max_shatter_level"),
            ComponentType.<Integer>builder().codec(Codecs.rangedInt(0, 255)).build()
    );
    public static final ComponentType<Integer> SMITHING_DEGRADATION = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Unbreakable.MOD_ID, "smithing_degradation"),
            ComponentType.<Integer>builder().codec(Codecs.rangedInt(0, 20)).build()
    );
    public static final ComponentType<Integer> GRINDING_DEGRADATION = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(Unbreakable.MOD_ID, "grinding_degradation"),
            ComponentType.<Integer>builder().codec(Codecs.rangedInt(0, 40)).build()
    );

    protected static void initialize() {

    }
}
