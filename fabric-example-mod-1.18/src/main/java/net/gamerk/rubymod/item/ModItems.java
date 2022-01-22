package net.gamerk.rubymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gamerk.rubymod.RubyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item RUBY_FRAGMENTS = registerItem("ruby_fragments",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubyMod.LOGGER.info("Registring Mod Items for " + RubyMod.MOD_ID);
    }
}
