package net.voidblock_.cybervoid.item.custom;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;




public class HammerItem extends Item {
    public HammerItem(Properties properties) {
        super(new Properties().durability(250));
    }


    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return stack.getDamageValue() < stack.getMaxDamage() -1;


    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack stack = itemStack.copy();
        stack.setDamageValue(stack.getDamageValue() + 1);

        return stack;
    }
}
