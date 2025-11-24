package net.voidblock_.cybervoid.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.voidblock_.cybervoid.CyberVoid;
import net.voidblock_.cybervoid.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CyberVoid.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.CPU.get());
        basicItem(ModItems.MOTHERBOARD.get());
        basicItem(ModItems.BLOCKCOIN.get());

        basicItem(ModItems.HAMMER.get());
        basicItem(ModItems.IRON_HAMMER.get());

        basicItem(ModItems.SILICON_SHEET.get());
        basicItem(ModItems.IRON_SHEET.get());
        basicItem(ModItems.IRON_ROD.get());
        basicItem(ModItems.RESISTOR.get());
        basicItem(ModItems.CAPACITOR.get());
        basicItem(ModItems.EMPTY_CIRCUIT.get());
        basicItem(ModItems.TRANSISTOR.get());

        basicItem(ModItems.RAW_SILICON.get());
        basicItem(ModItems.SILICON_DUST.get());
        basicItem(ModItems.SILICON_INGOT.get());

        basicItem(ModItems.PlACEHOLDER1.get());


    }
}
