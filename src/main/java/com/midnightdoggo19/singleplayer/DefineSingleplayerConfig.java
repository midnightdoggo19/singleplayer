package com.midnightdoggo19.singleplayer;

import me.fzzyhmstrs.fzzy_config.annotations.Action;
import me.fzzyhmstrs.fzzy_config.annotations.NonSync;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.config.Config;
import net.minecraft.util.Identifier;

public final class DefineSingleplayerConfig extends Config {

    public DefineSingleplayerConfig() {
        super(Identifier.of(Singleplayer.MOD_ID, "config"));
    }

    @RequiresAction(action = Action.RESTART) @NonSync
    public boolean panoramaSpins = true;
    @RequiresAction(action = Action.RESTART) @NonSync
    public boolean doingVanillaPanorama = true;
}