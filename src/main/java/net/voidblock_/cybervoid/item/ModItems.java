package net.voidblock_.cybervoid.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.voidblock_.cybervoid.CyberVoid;


public class ModItems {
public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CyberVoid.MOD_ID);


public static final DeferredItem<Item> TRANSISTOR = ITEMS.register("transistor",
        ()-> new Item(new Item.Properties()));

public static final DeferredItem<Item> EMPTY_CIRCUIT = ITEMS.register("empty_circuit",
        ()-> new Item(new Item.Properties()));


public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);

    }
}
