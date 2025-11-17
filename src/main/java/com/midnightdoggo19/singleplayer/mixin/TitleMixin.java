package com.midnightdoggo19.singleplayer.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.*;

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

    protected TitleMixin(Text title) {
        super(title);
    }
}