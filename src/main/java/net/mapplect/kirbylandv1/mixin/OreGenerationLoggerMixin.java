package net.mapplect.kirbylandv1.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.FeaturePlacementContext;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(OreFeature.class)
public class OreGenerationLoggerMixin {
    @Inject(method = "generate", at = @At("HEAD"))
    private void logOreGeneration(FeatureContext<OreFeatureConfig> context, CallbackInfoReturnable<Boolean> cir) {
        BlockPos blockpos = context.getOrigin();
        OreFeatureConfig config = context.getConfig();

        // Loops through the targets in the configuration to find your block
        config.targets.forEach(target -> {
            String blockId = target.state.getBlock().toString();

            // REPLACE "your_custom_ore_name" WITH YOUR ACTUAL ORE ID OR VARIABLE NAME
            if (blockId.contains("uranium_ore")) {
                System.out.println("Custom ore generated origin at: " + blockpos.getX() + ", " + blockpos.getY() + ", " + blockpos.getZ());
            }
    });
    }}


