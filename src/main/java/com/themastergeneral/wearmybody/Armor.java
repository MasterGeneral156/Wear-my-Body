package com.themastergeneral.wearmybody;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.themastergeneral.wearmybody.wearmybody;

public class Armor extends ItemArmor {

	public String textureName;

	public Armor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(wearmybody.MODID + ":" + unlocalizedName);
		this.setCreativeTab(wearmybody.Tab);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return wearmybody.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
