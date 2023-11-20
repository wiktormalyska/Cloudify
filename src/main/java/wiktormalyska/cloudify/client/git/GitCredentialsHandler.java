package wiktormalyska.cloudify.client;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;

import java.io.File;

public class GitCredentialsHandler {
    private File credentialsFile;
    public GitCredentialsHandler(){
        credentialsFile = FabricLoader.getInstance().getConfigDir().resolve("cloudify").resolve("credentials.json").toFile();

    }
}
