package me.princeraiden.redenergy.utils;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.princeraiden.redenergy.RedEnergy;
import me.princeraiden.redenergy.RedEnergyItems;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class RedEnergyItemSetup {

    public static void setup(RedEnergy addon) {
        ItemGroup mainItemGroup = new ItemGroup(new NamespacedKey(addon, "RED_ENERGY"), RedEnergyItems.MAIN_ITEM_GROUP);

        new SlimefunItem(mainItemGroup, RedEnergyItems.RAW_RED_CARBONADO, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK),
                        new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK),
                        new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK)
                }
        ).register(addon);

        new SlimefunItem(mainItemGroup, RedEnergyItems.RED_CARBONADO, RecipeType.HEATED_PRESSURE_CHAMBER,
                new ItemStack[] {
                        RedEnergyItems.RAW_RED_CARBONADO
                }
        ).register(addon);

        new SlimefunItem(mainItemGroup, RedEnergyItems.RED_WRENCH, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        RedEnergyItems.RED_CARBONADO, null, RedEnergyItems.RED_CARBONADO,
                        null, SlimefunItems.COBALT_INGOT, null,
                        null, SlimefunItems.COBALT_INGOT, SlimefunItems.NICKEL_INGOT
                }
        ).register(addon);

        new SlimefunItem(mainItemGroup, RedEnergyItems.ENERGY_DETECTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        null, RedEnergyItems.RED_CARBONADO, null,
                        RedEnergyItems.RED_CARBONADO, SlimefunItems.ENERGY_CONNECTOR, RedEnergyItems.RED_CARBONADO,
                        SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT
                }
        ).register(addon);

        new SlimefunItem(mainItemGroup, RedEnergyItems.ENERGY_GATE, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.ALUMINUM_BRASS_INGOT, null, SlimefunItems.ALUMINUM_BRASS_INGOT,
                        SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.ENERGY_REGULATOR, SlimefunItems.ALUMINUM_BRASS_INGOT,
                        SlimefunItems.ALUMINUM_BRASS_INGOT, null, SlimefunItems.ALUMINUM_BRASS_INGOT
                }
        ).register(addon);
    }
}
