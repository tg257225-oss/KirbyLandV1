package net.mapplect.kirbylandv1.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).
            statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 0.25f).build();

    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().hunger(4).saturationModifier(0.45f).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.45f).build();
    public static final FoodComponent FRIED_EGGS = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
    public static final FoodComponent BAGUETTE = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent EGGS_BENEDICT = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();



}
