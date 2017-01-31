package me.phit;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.filter.Getter;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextStyles;
import org.spongepowered.api.world.gen.WorldGeneratorModifier;

@Plugin(
        id = "voidthings",
        name = "VoidThings",
        authors = {
                "phit"
        }
)
public class VoidThings {

    @Inject
    private Logger logger;


    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        this.logger.info("VoidThings loaded!");
    }

    @Listener
    public void onGameInitialization(GameInitializationEvent event) {
        Sponge.getRegistry().register(WorldGeneratorModifier.class , new HellWorld());
        Sponge.getRegistry().register(WorldGeneratorModifier.class , new EndWorld());
    }

}
