package com.midnightdoggo19.singleplayer.mixin;

import net.minecraft.client.gui.*;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.*;

@Mixin(Screen.class)
public abstract class ScreengleplayerMixin extends AbstractParentElement implements Drawable {
    /**
     * @author Midnight Doggo
     * @reason Disables the title screen panorama.
     */
    @Overwrite
    public void renderPanoramaBackground(DrawContext context, float deltaTicks) {}
}