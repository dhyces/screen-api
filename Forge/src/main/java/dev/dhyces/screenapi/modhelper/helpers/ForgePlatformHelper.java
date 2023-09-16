package dev.dhyces.screenapi.modhelper.helpers;

import dev.dhyces.screenapi.modhelper.services.helpers.PlatformHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public final class ForgePlatformHelper implements PlatformHelper {
    @Override
    public boolean isModLoaded(String modid) {
        return ModList.get().isLoaded(modid);
    }

    @Override
    public boolean isClientDist() {
        return FMLLoader.getDist().isClient();
    }
}