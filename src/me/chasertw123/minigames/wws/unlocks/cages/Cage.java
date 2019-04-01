package me.chasertw123.minigames.wws.unlocks.cages;

import me.chasertw123.minigames.core.user.data.stats.StatClump;
import me.chasertw123.minigames.core.utils.items.cItemStack;
import me.chasertw123.minigames.wws.unlocks.UnlockRarity;
import me.chasertw123.minigames.wws.unlocks.cages.runnables.RainbowRunnable;
import me.chasertw123.minigames.wws.users.WaterWarsUser;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public enum Cage {

    GLASS("Clear", "#Basic", null, new cItemStack(Material.GLASS)),
    WHITE_STAINED_GLASS("Atlas", "White stained glass. (WIP)", UnlockRarity.UNCOMMON, new cItemStack(Material.STAINED_GLASS)),
    ORANGE_STAINED_GLASS("Tangerine", "Orange stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 1)),
    MAGENTA_STAINED_GLASS("Enchanted", "Magenta stained glass. (WIP)", UnlockRarity.UNCOMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 2)),
    LIGHT_BLUE_STAINED_GLASS("Dawnbringer", "Light Blue stained glass. (WIP)", UnlockRarity.UNCOMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 3)),
    YELLOW_STAINED_GLASS("Sunshine", "Yellow stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 4)),
    LIME_STAINED_GLASS("Lemon-Lime", "Lime stained glass. (WIP)", UnlockRarity.EPIC, new cItemStack(Material.STAINED_GLASS,1, (byte) 5)),
    PINK_STAINED_GLASS("Blush", "Pink stained glass. (WIP)", UnlockRarity.RARE, new cItemStack(Material.STAINED_GLASS, 1, (byte) 6)),
    GRAY_STAINED_GLASS("Dusk", "Gray stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 7)),
    LIGHT_GRAY_STAINED_GLASS("Faded", "Light Gray stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 8)),
    CYAN_STAINED_GLASS("Daybreak", "Cyan stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 9)),
    PURPLE_STAINED_GLASS("Amethyst", "Purple stained glass. (WIP)", UnlockRarity.RARE, new cItemStack(Material.STAINED_GLASS, 1, (byte) 10)),
    BLUE_STAINED_GLASS("Ocean", "Blue stained glass. (WIP)", UnlockRarity.UNCOMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 11)),
    BROWN_STAINED_GLASS("Muck", "Brown stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 12)),
    GREEN_STAINED_GLASS("Grasslands", "Green stained glass. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.STAINED_GLASS, 1, (byte) 13)),
    RED_STAINED_GLASS("Bloodlust", "Red stained glass. (WIP)", UnlockRarity.RARE, new cItemStack(Material.STAINED_GLASS, 1, (byte) 14)),
    BLACK_STAINED_GLASS("Nightfall", "Black stained glass. (WIP)", UnlockRarity.RARE, new cItemStack(Material.STAINED_GLASS, 1, (byte) 15)),
    SLIME_BLOCKS("Bouncy", "Squishy, sticky, and a whole lot of fun to just, JUMP AROUND!", UnlockRarity.EPIC, new cItemStack(Material.SLIME_BLOCK)),
    ICE("Artic", "A giant ice cube; great for preventing global warming and cooling your drinks.", UnlockRarity.EPIC, new cItemStack(Material.ICE), StatClump.WATER_WARS_KILLS, 2500),
    BARRIER("Barrier", "Just you casually floating in the air with nothing to hold you up.", UnlockRarity.RARE, new cItemStack(Material.BARRIER), StatClump.WATER_WARS_GAMES_WON, 100),
    RAINBOW("Rainbow", "Feel the rainbow, taste the rainbow. I wouldn't though; we don't wash the cages.", UnlockRarity.EPIC, new cItemStack(Material.RECORD_9).addFlags(ItemFlag.HIDE_ATTRIBUTES)) {
        @Override
        public void build(Location origin) {
            new RainbowRunnable(origin);
        }
    },
    DIAMOND_PODIUM("Diamond Podium", "You're killing it. Literally you are killing a lot of people. (WIP)", UnlockRarity.RARE, new cItemStack(Material.DIAMOND_BLOCK), StatClump.WATER_WARS_KILLS, 1000) {
        @Override
        public void build(Location origin) {
            Cage.buildPodiumCage(origin, Material.DIAMOND_BLOCK);
        }
    },
    GOLD_PODIUM("Gold Podium", "Making your way to the top, one kill at a time. (WIP)", UnlockRarity.UNCOMMON, new cItemStack(Material.GOLD_BLOCK), StatClump.WATER_WARS_KILLS, 500) {
        @Override
        public void build(Location origin) {
            Cage.buildPodiumCage(origin, Material.GOLD_BLOCK);
        }
    },
    IRON_PODIUM("Iron Podium", "I am running out of ideas. (WIP)", UnlockRarity.COMMON, new cItemStack(Material.IRON_BLOCK), StatClump.WATER_WARS_KILLS, 250) {
        @Override
        public void build(Location origin) {
            Cage.buildPodiumCage(origin, Material.IRON_BLOCK);
        }
    };

    private final String display, description;
    private final ItemStack itemStack;
    private final UnlockRarity rarity;

    private final StatClump statClump;
    private final int statAmount;

    Cage(String display, String description, UnlockRarity rarity, ItemStack itemStack) {
        this.display = display;
        this.description = description;
        this.rarity = rarity;
        this.itemStack = itemStack;
        this.statClump = null;
        this.statAmount = 0;
    }

    Cage(String display, String description, UnlockRarity rarity, ItemStack itemStack, StatClump statClump, int statAmount) {
        this.display = display;
        this.description = description;
        this.rarity = rarity;
        this.itemStack = itemStack;
        this.statClump = statClump;
        this.statAmount = statAmount;
    }

    public String getDisplay() {
        return display;
    }

    public String getDescription() {
        return description;
    }

    public UnlockRarity getRarity() {
        return rarity;
    }

    public StatClump getStatClump() {
        return statClump;
    }

    public int getStatAmount() {
        return statAmount;
    }

    @SuppressWarnings("deprecation")
    public void build(Location origin) {
        for (Location location : getAllCageBlockLocations(origin)) {
            location.getBlock().setType(itemStack.getType());
            location.getBlock().setData(itemStack.getData().getData());
        }
    }

    public ItemStack getGameItemStack(WaterWarsUser user) {

        boolean ownsCage = user.ownsCage(this);
        cItemStack item = new cItemStack(itemStack);

        item.setDisplayName((ownsCage ? ChatColor.GREEN  : ChatColor.RED) + this.getDisplay());
        item.addFancyLore(description, ChatColor.GRAY.toString());

        if (this.getRarity() != null) {
            item.addLore("", ChatColor.GRAY + "Rarity: " + this.getRarity().getChatColor() + this.getRarity().toString(), "");

            if (statClump == null)
                item.addLore(ChatColor.YELLOW + (ownsCage ? (user.getSelectedCage() == this ? "Already selected." : "Click to select.") : "Purchasable from the Water Wars shop!"));

            else
                item.addLore(ownsCage ? (ChatColor.YELLOW + (user.getSelectedCage() == this ? "Already selected." : "Click to select.")) : ChatColor.YELLOW + "Unlock by getting "
                        + NumberFormat.getNumberInstance(Locale.US).format(statAmount) + " " + statClump.getIdentifier().toLowerCase() + " in Water Wars!");
        }

        else
            item.addLore("", ChatColor.YELLOW + (user.getSelectedCage() == this ? "Already selected." : "Click to select." ));

        return item;
    }

    public ItemStack getShopItemStack(WaterWarsUser user, int userStatClumpTotal) {

        boolean ownsCage = user.ownsCage(this);
        cItemStack item = new cItemStack(itemStack);

        item.setDisplayName((ownsCage ? ChatColor.GREEN  : ChatColor.RED) + this.getDisplay());
        item.addFancyLore(description, ChatColor.GRAY.toString());

        if (this.getRarity() != null) {
            item.addLore("", ChatColor.GRAY + "Rarity: " + this.getRarity().getChatColor() + this.getRarity().toString(), "");

            if (statClump == null) {

                if (!ownsCage)
                    item.addLore(ChatColor.GRAY + "Price: " + ChatColor.GOLD + NumberFormat.getNumberInstance(Locale.US).format(this.getRarity().getCost()), ChatColor.YELLOW + "Click to purchase.");

                else
                    item.addLore(ChatColor.YELLOW + (user.getSelectedCage() == this ? "Already selected." : "Click to select."));
            }

            else {
                if (!ownsCage) {
                    item.addLore(ChatColor.YELLOW + "Unlock by getting " + NumberFormat.getNumberInstance(Locale.US).format(statAmount) + " " + statClump.getIdentifier().toLowerCase() + " in Water Wars!",
                            (userStatClumpTotal >= statAmount ? ChatColor.LIGHT_PURPLE + "Click to unlock!" : ChatColor.GRAY + "Progress: " + ChatColor.RED
                                    + NumberFormat.getNumberInstance(Locale.US).format(userStatClumpTotal) + "/" + NumberFormat.getNumberInstance(Locale.US).format(statAmount)
                                    + ChatColor.DARK_GRAY + " (" + (int) ((userStatClumpTotal * 100.0f) / statAmount) + "%)"));
                }

                else
                    item.addLore(ChatColor.YELLOW + (user.getSelectedCage() == this ? "Already selected." : "Click to select."));
            }
        }

        else
            item.addLore("", ChatColor.YELLOW + (user.getSelectedCage() == this ? "Already selected." : "Click to select." ));

        return item;
    }

    public static List<Location> getAllCageBlockLocations(Location origin) {

        List<Location> locations = new ArrayList<>();
        for (int y = -1; y <= 3; y++)
            for (int x = -1; x <= 1; x++)
                for (int z = -1; z <= 1; z++)
                    locations.add(origin.clone().add(x, y, z));

        locations.remove(origin.clone());
        locations.remove(origin.clone().add(0, 1, 0));
        locations.remove(origin.clone().add(0, 2, 0));

        return locations;
    }

    private static void buildPodiumCage(Location origin, Material podiumType) {

        for (Location l : getAllCageBlockLocations(origin))
            if (l.equals(origin.clone().subtract(0, 1, 0)))
                l.getBlock().setType(Material.STEP);
            else
                l.getBlock().setType(Material.BARRIER);

        origin.clone().subtract(0, 1, 0).getBlock().setType(podiumType);
    }
}
