package com.midnightdoggo19.singleplayer;

import me.fzzyhmstrs.fzzy_config.api.SaveType;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public final class DefineSingleplayerConfig extends Config {

    public DefineSingleplayerConfig() {
        super(Identifier.of(Singleplayer.MOD_ID, "config"));
    }

    public boolean panoramaSpins = true;
    public boolean panoramaExists = true;

    /**
     * Keeps the config local.
     * @return Config type.
     */
    @Override
    public @NotNull SaveType saveType() {
        return SaveType.SEPARATE;
    }
}