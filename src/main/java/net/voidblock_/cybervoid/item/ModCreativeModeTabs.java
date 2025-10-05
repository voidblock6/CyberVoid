package net.voidblock_.cybervoid.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.voidblock_.cybervoid.CyberVoid;
import net.voidblock_.cybervoid.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CyberVoid.MOD_ID);


    public static final Supplier<CreativeModeTab> CYBERVOID_ITEMS_TAB = CREATIVE_MODE_TAB.register("cybervoid_items_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOTHERBOARD.get()))
                    .title(Component.translatable("creativetab.cybervoid.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TRANSISTOR);
                        output.accept(ModItems.EMPTY_CIRCUIT);
                        output.accept(ModItems.CPU);
                        output.accept(ModItems.RESISTOR);
                        output.accept(ModItems.CAPACITOR);
                        output.accept(ModItems.MOTHERBOARD);
                        output.accept(ModItems.IRON_ROD);
                        output.accept(ModItems.RAW_SILICON);




                    }).build());

    public static final Supplier<CreativeModeTab> CYBERVOID_BLOCKS_TAB = CREATIVE_MODE_TAB.register("cybervoid_blocks_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AQUA_CYBER_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CyberVoid.MOD_ID, "cybervoid_items_tab"))

                    .title(Component.translatable("creativetab.cybervoid.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AQUA_CYBER_BLOCK);
                        output.accept(ModBlocks.RED_CYBER_BLOCK);
                        output.accept(ModBlocks.LIME_CYBER_BLOCK);
                        output.accept(ModBlocks.SILICON_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SILICON_ORE);





                    }).build());








    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);



    }

}
