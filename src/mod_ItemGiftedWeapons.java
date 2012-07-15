package net.minecraft.src;
import java.util.Random;

public class mod_ItemGiftedWeapons extends BaseMod
{

	public static final Item giftedSword = new ItemSword(204,  EnumToolMaterial.GIFTEDMETAL).setItemName("gifted sword");
	public static final Item giftedAxe = new ItemAxe(203,  EnumToolMaterial.GIFTEDMETAL).setItemName("gifted axe");
	public static final Item giftedPick = new ItemPickaxe(202,  EnumToolMaterial.GIFTEDMETAL).setItemName("gifted pick");
	public static final Item giftedHoe = new ItemHoe(201,  EnumToolMaterial.GIFTEDMETAL).setItemName("gifted hoe");
	public static final Item giftedShovel = new ItemSpade(200,  EnumToolMaterial.GIFTEDMETAL).setItemName("gifted shovel");
	public static final Item giftedBow = new giftedBow(199).setItemName("gifted bow");
	public static final Item giftedArrow = new giftedArrow(198).setItemName("gifted arrow");
	

	public mod_ItemGiftedWeapons()
	{

		giftedSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedSword.png");
		giftedAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedAxe.png");
		giftedPick.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedPick.png");
		giftedHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedHoe.png");
		giftedShovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedShovel.png");
		giftedBow.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedBow.png");
		giftedArrow.iconIndex = ModLoader.addOverride("/gui/items.png", "/giftedArrow.png");
		
		ModLoader.addName(giftedSword, "Gifted Sword");
		ModLoader.addName(giftedAxe, "Gifted Axe");
		ModLoader.addName(giftedPick, "Gifted Pick");
		ModLoader.addName(giftedHoe, "Gifted Hoe");
		ModLoader.addName(giftedShovel, "Gifted Shovel");
		ModLoader.addName(giftedBow, "Gifted Bow");
		ModLoader.addName(giftedArrow, "Gifted Arrow");

		ModLoader.addRecipe(new ItemStack(giftedPick, 1), new Object[] {
			"ggg", " s ", " s ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.stick
			});
		ModLoader.addRecipe(new ItemStack(giftedAxe, 1), new Object[] {
			"gg ", "gs ", " s ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.stick
			});
		ModLoader.addRecipe(new ItemStack(giftedSword, 1), new Object[] {
			" g ", " g ", " s ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.stick
			});
		ModLoader.addRecipe(new ItemStack(giftedHoe, 1), new Object[] {
			"gg ", " s ", " s ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.stick
			});
		ModLoader.addRecipe(new ItemStack(giftedShovel, 1), new Object[] {
			" g ", " s ", " s ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.stick
			});
		ModLoader.addRecipe(new ItemStack(giftedBow, 1), new Object[] {
			"sg ", "s l", "sg ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.silk, Character.valueOf('l'), Item.leather
			});
		ModLoader.addRecipe(new ItemStack(giftedArrow, 10), new Object[] {
			" g ", " s ", " g ", Character.valueOf('g'), mod_ItemGiftedMetal.giftedMetal, Character.valueOf('s'), Item.stick
			});
		
		 
	}

	public String getVersion()
	{
		return "1.2";
	}
	public void load() {
		
	}
}