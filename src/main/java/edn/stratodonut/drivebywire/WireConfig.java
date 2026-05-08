package edn.stratodonut.drivebywire;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class WireConfig {

    public static final WireConfig CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final ModConfigSpec.BooleanValue shouldConsumeWires;

    private WireConfig(ModConfigSpec.Builder builder) {
        shouldConsumeWires = builder.define("shouldConsumeWires", false);
    }

    static {
        Pair<WireConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(WireConfig::new);
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

}
