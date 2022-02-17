package com.jari.tutorial.registry;

import com.jari.tutorial.Tutorial;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.swing.text.html.parser.Entity;


public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SOUP = new Item(new Item.Settings().group(ItemGroup.FOOD).food( (new FoodComponent.Builder()).hunger(9).saturationModifier(0.9F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 0.3F).build()));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "soup"), SOUP);
    }

}
