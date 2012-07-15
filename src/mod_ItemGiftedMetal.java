package net.minecraft.src;
import java.util.Random;

public class mod_ItemGiftedMetal extends BaseMod
{

	public static final Item giftedMetal = new giftedMetal(205).setItemName("gifted metal");

	public mod_ItemGiftedMetal()
	{

		giftedMetal.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedMetal.png");

		ModLoader.addName(giftedMetal, "Gifted Metal Ingot");

		ModLoader.addSmelting(mod_BlockGiftOre.GiftOre.blockID, new ItemStack(mod_ItemGiftedMetal.giftedMetal, 1));
		
		 
	}

	public String getVersion()
	{
		return "1.2";
	}
	public void load() {
		
	}
}