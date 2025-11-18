package com.midnightdoggo19.singleplayer;

import me.fzzyhmstrs.fzzy_config.api.ConfigApiJava;
import me.fzzyhmstrs.fzzy_config.api.RegisterType;

class SingleplayerRegisterConfigs {
    public static DefineSingleplayerConfig clientSideConfig = ConfigApiJava.registerAndLoadConfig(DefineSingleplayerConfig::new, RegisterType.CLIENT);
    /**
     * Bit of a platypus class.
     * @see DefineSingleplayerConfig
     * Where the config's defined.
     */
    public static void init() {}
}
