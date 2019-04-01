package me.chasertw123.minigames.wws.unlocks.cages.runnables;

import me.chasertw123.minigames.core.Main;
import me.chasertw123.minigames.wws.unlocks.cages.Cage;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RainbowRunnable extends BukkitRunnable {

    private static final byte[] RAINBOW_COLORS = {1, 11, 5, 4, 2, 14, 6};

    private List<Location> cageBlockLocations;

    @SuppressWarnings("deprecation")
    public RainbowRunnable(Location origin) {
        this.cageBlockLocations = Cage.getAllCageBlockLocations(origin);
        this.runTaskTimer(Main.getInstance(), 0L, 10L);

        for (Location location : cageBlockLocations) {
            location.getBlock().setType(Material.STAINED_GLASS);
            location.getBlock().setData(RAINBOW_COLORS[ThreadLocalRandom.current().nextInt(RAINBOW_COLORS.length)]);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public void run() {

        for (Location l : cageBlockLocations) {

            if (l.getBlock().getType() != Material.STAINED_GLASS) {
                this.cancel();
                return;
            }

            l.getBlock().setData(RAINBOW_COLORS[ThreadLocalRandom.current().nextInt(RAINBOW_COLORS.length)]);
        }

    }

}
