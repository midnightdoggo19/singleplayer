package com.midnightdoggo19.singleplayer.mixin;

import com.midnightdoggo19.singleplayer.Singleplayer;
import net.minecraft.client.gui.*;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.world.waypoint.TrackedWaypoint;
import org.spongepowered.asm.mixin.*;

@Mixin(GameRenderer.class)
public abstract class PanoramaMixin implements TrackedWaypoint.PitchProvider, AutoCloseable {
    // OPTIONS AVAILABLE:
    // end_portal
    // black_concrete
    // black_concrete_powder

    @Shadow
    protected final CubeMapRenderer panoramaRenderer = new CubeMapRenderer(
            Identifier.of(Singleplayer.MOD_ID,
                "textures/gui/title/background/" + "end_portal" // second bit comes from the above list
            )
    );
}