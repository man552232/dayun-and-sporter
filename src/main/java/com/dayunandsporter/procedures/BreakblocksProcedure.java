package com.dayunandsporter.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BreakblocksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(BlockPos.containing(x, y + 3, z), false);
		world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
		world.destroyBlock(BlockPos.containing(x, y + 2, z), false);
	}
}
