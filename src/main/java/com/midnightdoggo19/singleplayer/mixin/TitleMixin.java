package com.midnightdoggo19.singleplayer.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleMixin
    extends Screen {

    /**
     * @author Midnight Doggo
     * @reason Who needs friends, anyway?
     * This method is mostly identical to the original, just without all those pesky multiplayer options. It's also
     * better formatted.
     */
    @Overwrite
    private int addNormalWidgets(int y, int spacingY) {
        this.addDrawableChild(
                ButtonWidget.builder(Text.translatable("menu.singleplayer"), button -> {
                            assert this.client != null;
                            this.client.setScreen(new SelectWorldScreen(this));
                        })
                        .dimensions(this.width / 2 - 100, y, 200, 20)
                        .build()
        );
        return y;
    }

    /**
     * @param context is ignored.
     * @param mouseX is ignored.
     * @param mouseY is ignored.
     * @param deltaTicks is ignored.
     * @param ci is ignored.
     * This exists to shove text away.
     */
    @Inject(method = "render", at = @At("HEAD"))
    public void shoveText (DrawContext context, int mouseX, int mouseY, float deltaTicks, CallbackInfo ci) {
        this.height = this.height * 2; // this is so scuffed but it forces the test off the screen
    }

    /**
     * Gets rid of the copyright field in the bottom right.
     */
    @Shadow
    private static final Text COPYRIGHT = Text.literal("");

    protected TitleMixin(Text title) {
        super(title);
    }
}