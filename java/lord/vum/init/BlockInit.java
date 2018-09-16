package lord.vum.init;

import java.util.ArrayList;
import java.util.List;

import lord.vum.objects.blocks.AmethystOre;
import lord.vum.objects.blocks.BlockBase;
import lord.vum.objects.blocks.JadeOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_JADE = new JadeOre("ore_jade", Material.ROCK);
	public static final Block ORE_AMETHYST = new AmethystOre("ore_amethyst", Material.ROCK);
	public static final Block PILLAR_ANDESITE = new BlockBase("pillar_andesite", Material.ROCK);
	public static final Block PILLAR_DIORITE = new BlockBase("pillar_diorite", Material.ROCK);
	public static final Block PILLAR_GRANITE = new BlockBase("pillar_granite", Material.ROCK);
	public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.ROCK);
	public static final Block GRANITE_PILLARS = new BlockBase("granite_pillars", Material.ROCK);
	public static final Block ANDESITE_BRICKS = new BlockBase("andesite_bricks", Material.ROCK);
	public static final Block DIORITE_BRICKS = new BlockBase("diorite_bricks", Material.ROCK);
	public static final Block JADE_BLOCK = new BlockBase("jade_block", Material.ROCK);
	public static final Block STRIPPED_ACACIA = new BlockBase("stripped_acacia", Material.WOOD);
	public static final Block STRIPPED_BIRCH = new BlockBase("stripped_birch", Material.WOOD);
	public static final Block STRIPPED_DARK_OAK = new BlockBase("stripped_dark_oak", Material.WOOD);
	public static final Block STRIPPED_JUNGLE = new BlockBase("stripped_jungle", Material.WOOD);
	public static final Block STRIPPED_OAK = new BlockBase("stripped_oak", Material.WOOD);
	public static final Block STRIPPED_SPRUCE = new BlockBase("stripped_spruce", Material.WOOD);
}
