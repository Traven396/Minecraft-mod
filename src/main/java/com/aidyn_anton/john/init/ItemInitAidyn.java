package com.aidyn_anton.john.init;

import com.aidyn_anton.john.John;
import com.google.common.base.Supplier;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitAidyn {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, John.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(John.John_Create_Tab)));
	
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
	};
}
