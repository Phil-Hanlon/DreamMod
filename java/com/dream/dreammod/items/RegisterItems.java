package com.dream.dreammod.items;

import com.dream.dreammod.DreamMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItems extends Item {
	
	public static Item pillowItem;
	
	
	public RegisterItems(String name) {
		
		setCreativeTab(CreativeTabs.FOOD);
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	
	/************************************/
	// Register items START
	public static void preInit() {
		
		pillowItem = new ItemPillow("pillow_item");
		
		registerItems();
	}
	
	
	public static void registerItems() {
		
		GameRegistry.register(pillowItem, new ResourceLocation(DreamMod.MODID, "pillow_item"));
	}
	// Register items END
	/*************************************/
	
	
	/*************************************/
	// Register renders START
	public static void registerRenders() {
		
		registerRender(pillowItem);
	}
	
	public static void registerRender(Item the_item) {
		
		// We do "substring" here because "getUnlocalizedName()" returns "item.pillow_item", but we only want "pillow_item"
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(the_item, 0, new ModelResourceLocation(DreamMod.MODID + ":" + the_item.getUnlocalizedName().substring(5), "inventory"));
	}
	// Register renders END
	/*************************************/
	
}
