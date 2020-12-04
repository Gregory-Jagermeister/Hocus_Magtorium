package net.codedin97.hocus.common.blocks;

import java.util.Random;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.particle.ParticleTypes;

public class EnergyBlock extends Block {

  public EnergyBlock(Settings settings) {
    super(settings);
  }

  @Override
  @Environment(EnvType.CLIENT)
  public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
    for (int i = 0; i < 4; ++i) {
      double theta = random.nextDouble() * 2 * Math.PI;
      double phi = Math.random() * Math.PI;
      double r = 1.05 * Math.random();
      double sinTheta = Math.sin(theta);
      double cosTheta = Math.cos(theta);
      double sinPhi = Math.sin(phi);
      double cosPhi = Math.cos(phi);
      double x = r * sinPhi * cosTheta;
      double y = r * sinPhi * sinTheta;
      double z = r * cosPhi;
      double g = ((double) random.nextFloat() - 0.5D) * 0.05D;
      double h = ((double) random.nextFloat() - 0.5D) * 0.05D;
      double j = ((double) random.nextFloat() - 0.5D) * 0.05D;
      world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, (double) pos.getX() + x + 0.5, (double) pos.getY() + y + 0.5,
          (double) pos.getZ() + z + 0.5, g, h, j);
    }
  }

}
