package net.voidblock_.cybervoid.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.voidblock_.cybervoid.CyberVoid;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CyberVoid.MOD_ID);


    public static final DeferredItem<Item> TRANSISTOR = ITEMS.register("transistor",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EMPTY_CIRCUIT = ITEMS.register("empty_circuit",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CPU = ITEMS.register("cpu",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RESISTOR = ITEMS.register("resistor",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CAPACITOR = ITEMS.register("capacitor",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MOTHERBOARD = ITEMS.register("motherboard",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILICON_DUST = ITEMS.register("silicon_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLOCKCOIN = ITEMS.register("blockcoin",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
