package com.dream.dreammod.items;

import com.dream.dreammod.DreamMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItems extends Item {
	
	private static Item _pillowItem;
	public static ItemAndName pillowItem = new ItemAndName( _pillowItem, "pillow_item" );
	
	private static Item _swordItem;
	public static ItemAndName swordItem = new ItemAndName( _swordItem, "sword_item" );
	
	public static ItemAndName[] the_items = new ItemAndName[2];
			
	
	
	public RegisterItems(String name) {
		
		setCreativeTab(CreativeTabs.FOOD);
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	
	/************************************/
	// Register items START
	public static void preInit() {
		
		// Add items to the list
		the_items[0] = pillowItem;
		the_items[1] = swordItem;
		
		pillowItem.item = new ItemPillow(pillowItem.name);
		swordItem.item = new ItemDSword(Item.ToolMaterial.DIAMOND, swordItem.name);
		// Use this to make your own ToolMaterial!
		// EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
		
		registerItems();
	}
	
	
	public static void registerItems() {
		
		for ( ItemAndName item: the_items ) {
			
			GameRegistry.register(item.item, new ResourceLocation(DreamMod.MODID, item.name));
		}
		
		// GameRegistry.register(pillowItem, new ResourceLocation(DreamMod.MODID, "pillow_item"));
		// GameRegistry.register(swordItem, new ResourceLocation(DreamMod.MODID, "sword_item"));
	}
	// Register items END
	/*************************************/
	
	
	/*************************************/
	// Register renders START
	public static void registerRenders() {
		
		for ( ItemAndName item: the_items ) {
			
			registerRender(item.item);
		}
		//registerRender(pillowItem);
	}
	
	public static void registerRender(Item the_item) {
		
		// We do "substring" here because "getUnlocalizedName()" returns "item.pillow_item", but we only want "pillow_item"
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(the_item, 0, new ModelResourceLocation(DreamMod.MODID + ":" + the_item.getUnlocalizedName().substring(5), "inventory"));
	}
	// Register renders END
	/*************************************/
	
}
