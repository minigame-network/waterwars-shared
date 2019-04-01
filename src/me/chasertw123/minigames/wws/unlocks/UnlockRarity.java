package me.chasertw123.minigames.wws.unlocks;

import net.md_5.bungee.api.ChatColor;

/**
 * Created by Chase on 1/13/2018.
 */
public enum UnlockRarity {

    COMMON(1250, ChatColor.GREEN),
    UNCOMMON(2500, ChatColor.AQUA),
    RARE(5000, ChatColor.LIGHT_PURPLE),
    EPIC(10000, ChatColor.GOLD);

    private final int cost;
    private final ChatColor chatColor;

    UnlockRarity(int cost, ChatColor chatColor) {
        this.cost = cost;
        this.chatColor = chatColor;
    }

    public int getCost() {
        return cost;
    }

    public ChatColor getChatColor() {
        return chatColor;
    }
}
