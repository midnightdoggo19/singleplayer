package com.midnightdoggo19.singleplayer.mixin;

import net.minecraft.client.gui.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Objects;

@Mixin(Screen.class)
public abstract class ScreengleplayerMixin extends AbstractParentElement implements Drawable {

    @Shadow @Final private static Logger LOGGER;

    /**
     * @author Midnight Doggo
     * @reason Disables the title screen panorama.
     */
    @Overwrite
    public void renderPanoramaBackground(DrawContext context, float deltaTicks) {}
}