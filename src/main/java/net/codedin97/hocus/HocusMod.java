package net.codedin97.hocus;

import net.codedin97.hocus.common.blocks.EnergyBlock;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Material;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HocusMod implements ModInitializer {

  public static final EnergyBlock FIRST_BLOCK = new EnergyBlock(Settings.of(Material.STONE).strength(5, 5));

  @Override
  public void onInitialize() {
    System.out.println("Hello world");
    Registry.register(Registry.BLOCK, new Identifier("hocus", "hocus_block"), FIRST_BLOCK);
    Registry.register(Registry.ITEM, new Identifier("hocus", "hocus_block"),
        new BlockItem(FIRST_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
  }
}
