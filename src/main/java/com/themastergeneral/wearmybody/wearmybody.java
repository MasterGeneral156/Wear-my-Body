package com.themastergeneral.wearmybody;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.FishingHooks;
import net.minecraftforge.common.util.EnumHelper;

import com.themastergeneral.wearmybody.Armor;

@Mod(modid = wearmybody.MODID, version = wearmybody.VERSION, name = wearmybody.NAME)

public class wearmybody {
	public static final String MODID = "WearMyBody";
    public static final String VERSION = "1.1";
    public static final String NAME = "Wear My Body!";
    
    public static final ArmorMaterial Clothing = EnumHelper.addArmorMaterial("Clothing", 5, new int[]{1, 3, 2, 1}, 10);
    public static final ArmorMaterial Skull = EnumHelper.addArmorMaterial("Skull", 0, new int[]{0, 0, 0, 0}, 0);
    
    public static CreativeTabs Tab = new CreativeTab("WearMyBody");
    
    public static Armor Armor;
    public static Item TMGHelmet;
	public static Item TMGChestplate;
	public static Item TMGLeggings;
	public static Item TMGBoots;
	public static Item TMGSkull;

	public static Item SithHelmet;
	public static Item SithChestplate;
	public static Item SithLeggings;
	public static Item SithBoots;
	
	public static Item BCHelmet;
	public static Item BCChestplate;
	public static Item BCLeggings;
	public static Item BCBoots;
	public static Item BCSword;
    
    	@EventHandler
		public void preinit(FMLPreInitializationEvent event)
		{
	    	//TMG Armor {
	    	GameRegistry.registerItem(TMGHelmet = new Armor("tmg_helmet", Clothing, "tmg", 0), "tmg_helmet"); //0 for helmet
	    	GameRegistry.registerItem(TMGChestplate = new Armor("tmg_chestplate", Clothing, "tmg", 1), "tmg_chestplate"); // 1 for chestplate
	    	GameRegistry.registerItem(TMGLeggings = new Armor("tmg_leggings", Clothing, "tmg", 2), "tmg_leggings"); // 2 for leggings
	    	GameRegistry.registerItem(TMGBoots = new Armor("tmg_boots", Clothing, "tmg", 3), "tmg_boots"); // 3 for boots
	    	GameRegistry.registerItem(TMGSkull = new Armor("tmg_skull", Skull, "tmg_skull", 0), "tmg_skull"); // 0 for helmet
	    	//}
	    	//Sith Armor {
	    	GameRegistry.registerItem(SithHelmet = new Armor("sith_skull", Skull, "sith", 0), "sith_skull"); //0 for helmet
	    	GameRegistry.registerItem(SithChestplate = new Armor("sith_chestplate", Clothing, "sith", 1), "sith_chestplate"); // 1 for chestplate
	    	GameRegistry.registerItem(SithLeggings = new Armor("sith_leggings", Clothing, "sith", 2), "sith_leggings"); // 2 for leggings
	    	GameRegistry.registerItem(SithBoots = new Armor("sith_boots", Clothing, "sith", 3), "sith_boots"); // 3 for boots
	    	//}
	    	//BCG Armor {
	    	GameRegistry.registerItem(BCHelmet = new Armor("bc_skull", Skull, "bc", 0), "bc_skull"); //0 for helmet
	    	GameRegistry.registerItem(BCChestplate = new Armor("bc_chestplate", Clothing, "bc", 1), "bc_chestplate"); // 1 for chestplate
	    	GameRegistry.registerItem(BCSword = new Armor("bc_sword", Clothing, "bcs", 1), "bc_sword"); // 1 for chestplate
	    	GameRegistry.registerItem(BCLeggings = new Armor("bc_leggings", Clothing, "bc", 2), "bc_leggings"); // 2 for leggings
	    	GameRegistry.registerItem(BCBoots = new Armor("bc_boots", Clothing, "bc", 3), "bc_boots"); // 3 for boots
	    	//}
	    	
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(SithHelmet),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(SithChestplate),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(SithLeggings),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(SithBoots),1,1,5));
	    	
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(TMGHelmet),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(TMGSkull),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(TMGChestplate),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(TMGLeggings),1,1,5));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(TMGBoots),1,1,5));
	    	
	    	FishingHooks.addFish(BCHelmet);
	}
}