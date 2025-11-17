package com.midnightdoggo19.singleplayer.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MinecraftClient.class)
public class DisableMultiplayerMixin {
    /**
     * @author Midnight Doggo
     * @reason Get rid of multiplayer.
     */
    @Overwrite
    public boolean isMultiplayerEnabled() {
        return false;
    }

    /**
     * @author Midnight Doggo
     * @reason Get rid of realms.
     */
    @Overwrite
    public boolean isRealmsEnabled() {
        return false;
    }
}
