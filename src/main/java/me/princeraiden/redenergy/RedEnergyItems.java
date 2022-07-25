package me.princeraiden.redenergy;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.princeraiden.redenergy.utils.RedEnergyHeads;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class RedEnergyItems {

    // Categories
    public static final CustomItemStack MAIN_ITEM_GROUP = new CustomItemStack(RedEnergyHeads.RED_CARBONADO.getItemStack(), "&cRed Energy");

    // Resources
    public static final SlimefunItemStack RAW_RED_CARBONADO = new SlimefunItemStack(
            "RAW_RED_CARBONADO", RedEnergyHeads.RAW_RED_CARBONADO.getBase64(), "&cRaw Red Carbonado"
    );

    public static final SlimefunItemStack RED_CARBONADO = new SlimefunItemStack(
            "RED_CARBONADO", RedEnergyHeads.RED_CARBONADO.getBase64(), "&cRed Carbonado"
    );

    // Tools
    public static final SlimefunItemStack RED_WRENCH = new SlimefunItemStack(
            "RED_WRENCH", Material.SHEARS, "&cRed Wrench",
            "&aClick to toggle a red energy",
            "&amachine's state."
    );

    // Blocks
    public static final SlimefunItemStack ENERGY_DETECTOR = new SlimefunItemStack(
            "ENERGY_DETECTOR", Material.COMPARATOR, "&cEnergy Detector",
            "&aPlace next a capacitor or machine.",
            "&aThis will output a redstone signal with a",
            "&astrength equivalent to the machine's charge.",
            "&aRight click with a wrench to toggle hex value mode"
    );

    public static final SlimefunItemStack ENERGY_GATE = new SlimefunItemStack(
            "ENERGY_DETECTOR", RedEnergyHeads.ENERGY_GATE.getBase64(), "&cEnergy Gate",
            "&aPlace like an energy connector.",
            "&aThis will take a redstone signal on",
            "&aany 4 adjacent sides (not top or bottom).",
            "&aIt will allow the specified amount of energy",
            "&athrough, then emit a redstone signal from the top.",
            "&aRight click with a wrench to toggle hex value mode."
    );
}
