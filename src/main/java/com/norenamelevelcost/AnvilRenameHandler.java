package com.norenamelevelcost;

import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.util.StringUtil;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AnvilUpdateEvent;

import java.util.regex.Pattern;

@EventBusSubscriber(modid = NoRenameLevelCost.MODID)
public final class AnvilRenameHandler {

    private static final Pattern FORMAT_CODE = Pattern.compile("&([0-9a-fk-or])", Pattern.CASE_INSENSITIVE);

    private AnvilRenameHandler() {
    }

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event) {
        ItemStack left = event.getLeft();
        if (left.isEmpty() || !event.getRight().isEmpty()) {
            return;
        }

        String name = sanitize(rawName(event));
        if (name == null || StringUtil.isBlank(name)) {
            clearName(event, left);
            return;
        }

        ItemStack output = left.copy();
        output.set(DataComponents.CUSTOM_NAME, Component.literal(FORMAT_CODE.matcher(name).replaceAll("\u00a7$1")));
        event.setOutput(output);
        event.setCost(0);
        event.setMaterialCost(0);
    }

    private static String rawName(AnvilUpdateEvent event) {
        if (event.getPlayer() != null && event.getPlayer().containerMenu instanceof AnvilMenu menu) {
            String raw = RawNames.MAP.get(menu);
            if (raw != null) {
                return raw;
            }
        }
        return event.getName();
    }

    private static String sanitize(String name) {
        if (name == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(Math.min(name.length(), 50));
        for (char c : name.toCharArray()) {
            if (sb.length() >= 50) {
                break;
            }
            if (c == '\u00a7' || StringUtil.isAllowedChatCharacter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static void clearName(AnvilUpdateEvent event, ItemStack left) {
        if (!left.has(DataComponents.CUSTOM_NAME)) {
            return;
        }
        ItemStack output = left.copy();
        output.remove(DataComponents.CUSTOM_NAME);
        event.setOutput(output);
        event.setCost(0);
        event.setMaterialCost(0);
    }
}