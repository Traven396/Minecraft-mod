package com.aidyn_anton.john;


/*
 * Aidyn Reis, Anton Snizhko
 * Advanced Technologies Project 3
 * 10/25/22
 * 
 */
import com.aidyn_anton.john.init.ItemInitAidyn;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("john")
public class John {
	
	public static final String MOD_ID = "john";
	
	public static final CreativeModeTab John_Create_Tab = new CreativeModeTab("JohnTab") {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			//Test
			return new ItemStack(ItemInitAidyn.EXAMPLE_ITEM.get());
		}
	};
	

	

	public John() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInitAidyn.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
