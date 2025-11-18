package com.midnightdoggo19.singleplayer.mixin;

import net.minecraft.client.gui.*;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Screen.class)
public abstract class NoRotationMixin extends AbstractParentElement implements Drawable {
//    /**
//     * @param cir Allowing rotation?
//     * Stops the title screen panorama from rotating.
//     */
//    @Inject(method = "allowRotatingPanorama", at = @At("TAIL"), cancellable = true)
//    private void injected(CallbackInfoReturnable<Boolean> cir) {
//        cir.setReturnValue(false);
//    }
}