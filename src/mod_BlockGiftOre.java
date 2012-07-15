package net.minecraft.src;

import java.util.Random;

public class mod_BlockGiftOre extends BaseMod
{
	
	public static final Block GiftOre =	new GiftOre(206, 0).setHardness(3.0F).setResistance(5.0F).setBlockName("giftOre");
	
      public mod_BlockGiftOre() {
    	  
    	  
    	  ModLoader.registerBlock(GiftOre);
    	  GiftOre.blockIndexInTexture = ModLoader.addOverride("/terrain.png","/giftBlock.png");
    	  ModLoader.addName(GiftOre, "Gift Ore");
    	  ModLoader.addSmelting(GiftOre.blockID, new ItemStack(Item.diamond, 3));
    	  //Recipes
    	  //Diamond
    	  ModLoader.addRecipe(new ItemStack(Item.diamond, 8), new Object[] {
  		"gg", "gg", Character.valueOf('g'), mod_BlockGiftOre.GiftOre, 
  		});
      }
    	  public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
    			for (int i = 0; i < 2; i++)
    			{
    				
    				int randPosX = chunkX + rand.nextInt(3);
    				
    				int randPosY = rand.nextInt(20);

    				int randPosZ = chunkZ + rand.nextInt(3);

    				(new WorldGenMinable(GiftOre.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
    			}
    		}
      public String getVersion()
  	{
  		return "1.2";
  	}
      public void load() {
    	 
      }
		
}
