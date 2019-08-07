package com.dream.dreammod.proxy;

import com.dream.dreammod.items.RegisterItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
		
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		
		RegisterItems.registerRenders();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
}
