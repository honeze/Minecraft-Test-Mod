package com.honeze.testmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("testmod")
public class TestMod {
    public TestMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}

