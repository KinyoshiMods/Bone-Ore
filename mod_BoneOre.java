package net.minecraft.src;

import java.util.Random;
import java.io.*;
import java.util.*;
import net.minecraft.client.Minecraft;

public class mod_BoneOre extends BaseMod
{
 	
 public mod_BoneOre()
    {
    	readWriteProperties();
    	
        BlockBoneOre = new BlockBoneOre(BlockBoneOreID).setHardness(2.0F).setResistance(2.0F).setLightValue(0.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockBoneOre");
        ModLoader.addName(BlockBoneOre, "Bone Ore");
        BlockBoneOre.setCreativeTab(CreativeTabs.tabBlock); 

        ModLoader.addSmelting(BlockBoneOre.blockID, new ItemStack(Item.dyePowder, 1, 15), 0.1F);

    }
    
	public void readWriteProperties() {
		Properties properties = new Properties();
		try
		{	
            File file = new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/BoneOre.config").toString());
            boolean flag = file.createNewFile();
            if(flag)
            {
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                properties.setProperty("BlockBoneOreID", Integer.toString(229));
                properties.setProperty("ShouldMoreOreSpawn", Boolean.toString(false));
                properties.store(fileoutputstream, "Change the ID's to fix ID incompatibilities.");
                fileoutputstream.close();
            }
            properties.load(new FileInputStream((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/BoneOre.config").toString()));
            BlockBoneOreID = Integer.parseInt(properties.getProperty("BlockBoneOreID"));
            ShouldMoreOreSpawn = Boolean.parseBoolean(properties.getProperty("ShouldMoreOreSpawn"));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            BlockBoneOreID = 229;
            ShouldMoreOreSpawn = false;
        }
	}
	
	public static Block BlockBoneOre;
    public static int BlockBoneOreID;
    public static boolean ShouldMoreOreSpawn;
    
    public String getVersion()
    {
        return "MineCraft1.5.2__BoneOre1.5.2r1";
    }
  
public void populateChunk(PCE.Post evt) 
{
generate(evt.world, evt.rand, evt.chunkX, evt.chunkZ);
}
    
public void generate(World world, Random r, int i, int j)
{
	if (ShouldMoreOreSpawn == true)
	{
    for(int k = 0; k < 10 + r.nextInt(25); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenMinable(BlockBoneOre.blockID, 6 + r.nextInt(8))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 6 + r.nextInt(10); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreDirt(BlockBoneOre.blockID, 4 + r.nextInt(6))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 6 + r.nextInt(10); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreGrass(BlockBoneOre.blockID, 4 + r.nextInt(4))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 5 + r.nextInt(10); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreSand(BlockBoneOre.blockID, 4 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 5 + r.nextInt(12); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreNether(BlockBoneOre.blockID, 4 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
	}
	else
	{
    for(int k = 0; k < 6 + r.nextInt(18); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenMinable(BlockBoneOre.blockID, 4 + r.nextInt(6))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 4 + r.nextInt(9); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreDirt(BlockBoneOre.blockID, 2 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 4 + r.nextInt(5); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreGrass(BlockBoneOre.blockID, 2 + r.nextInt(2))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 3 + r.nextInt(7); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreSand(BlockBoneOre.blockID, 2 + r.nextInt(4))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 2 + r.nextInt(8); k++)
    {
         int randPosX = i + r.nextInt(8);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(8);
         (new WorldGenBoneOreNether(BlockBoneOre.blockID, 2 + r.nextInt(3))).generate(world, r, randPosX, randPosY, randPosZ);
    }
	}
 
}

    public void load() 
    	{
           ModLoader.registerBlock(BlockBoneOre);
    	}
}