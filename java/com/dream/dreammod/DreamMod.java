package com.dream.dreammod;

import com.dream.dreammod.block.BlockDBed;
import com.dream.dreammod.items.RegisterItems;
import com.dream.dreammod.items.ItemDBed;
import com.dream.dreammod.proxy.CommonProxy;
import com.dream.dreammod.tabs.DreamTab;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod(modid = DreamMod.MODID, version = DreamMod.VERSION)
public class DreamMod
{
    public static final String MODID = "dreammod";
    public static final String VERSION = "2.0";
    
    
    // TABS START
    
    public static DreamTab tab;
    
    // TABS END
    
    // BLOCKS START
    
    static BlockDBed d_bed_block;
    
    // BLOCKS END
    
    // ITEMS START
    
    static ItemDBed debug_d_bed_item;
    static RegisterItems basic_item;
    
    // ITEMS END
    
    
    
    @Mod.Instance
    public static DreamMod instance;
    
    
    
    @SidedProxy(clientSide="com.dream.dreammod.proxy.ClientProxy", serverSide="com.dream.dreammod.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	tab = new DreamTab(CreativeTabs.getNextID(), "dream_tab");
    	
    	
    	RegisterItems.preInit();
    	
    	proxy.preInit(event);
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    	proxy.postInit(event);
    }
    
    
}
