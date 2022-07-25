package me.princeraiden.redenergy.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.inventory.ItemStack;

public enum RedEnergyHeads {

    // TODO change these two heads
    RAW_RED_CARBONADO("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjA3M2Q4NGQ2ZmRhNmEzNDA0ZTc3YWQ4ZDBmMTkwODkzYWU2NmQxOTVmYmI0NGQzYzQ2MDdhNmI3MWQ5YjlkNSJ9fX0="),
    RED_CARBONADO("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjA3M2Q4NGQ2ZmRhNmEzNDA0ZTc3YWQ4ZDBmMTkwODkzYWU2NmQxOTVmYmI0NGQzYzQ2MDdhNmI3MWQ5YjlkNSJ9fX0="),
    ENERGY_GATE("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzFkMDlhYTA3MTNjYzlhM2YzYzY4MDkyM2IxZjdiMjE2N2Y2NzMyMmZiN2U1ZjczMDE4ODEyZmVmNWZlMWEzYSJ9fX0=");

    private String base64;
    RedEnergyHeads(String base64) {
        this.base64 = base64;
    }

    public ItemStack getItemStack() {
        return PlayerHead.getItemStack(PlayerSkin.fromHashCode(this.base64));
    }

    public String getBase64() {
        return this.base64;
    }
}
