package com.dream.dreammod.items;

import com.dream.dreammod.DreamMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPillow extends Item {

	public ItemPillow(String name) {
		
		setUnlocalizedName(name);
		setCreativeTab(DreamMod.tab);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		
		if( worldIn.isRemote ) {
			
			playerIn.changeDimension(1);
		}
		
		
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
	
	

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		// TODO Auto-generated method stub
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
	

	
}
