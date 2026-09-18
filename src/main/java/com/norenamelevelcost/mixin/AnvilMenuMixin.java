package com.norenamelevelcost.mixin;

import com.norenamelevelcost.RawNames;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AnvilMenu;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilMenu.class)
public abstract class AnvilMenuMixin {

    @Inject(method = "setItemName", at = @At("HEAD"))
    private void norenamelevelcost$captureRawName(String name, CallbackInfoReturnable<Boolean> cir) {
        RawNames.MAP.put((AnvilMenu) (Object) this, name);
    }

    @Inject(method = "mayPickup", at = @At("RETURN"), cancellable = true)
    private void norenamelevelcost$allowFreePickup(Player player, boolean hasStack, CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValueZ() && ((AnvilMenu) (Object) this).getCost() == 0) {
            cir.setReturnValue(true);
        }
    }
}