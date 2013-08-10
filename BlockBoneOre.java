package net.minecraft.src;
import java.util.Random;
import net.minecraft.src.CreativeTabs;

public class BlockBoneOre extends Block
{
public BlockBoneOre(int par1)
{
         super(par1, Material.rock);
         this.setCreativeTab(CreativeTabs.tabBlock);
}

    public int quantityDropped(Random r)
    {
                return 1;
    }
    
public int idDropped(int par1, Random par2Random, int par3)
{
	
         return mod_BoneOre.BlockBoneOre.blockID;
}
}