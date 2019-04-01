package me.chasertw123.minigames.wws.unlocks.kits;

import me.chasertw123.minigames.core.utils.items.cItemStack;
import me.chasertw123.minigames.wws.users.WaterWarsUser;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public enum Kit {

    BLACKSMITH("Blacksmith", 5000, new cItemStack(Material.EXP_BOTTLE, 16), new cItemStack(Material.ANVIL),
            RandomEnchant.getRandomEnchantmentBook().setDisplayName(ChatColor.LIGHT_PURPLE + "Blacksmith's Enchantment I"),
            RandomEnchant.getRandomEnchantmentBook().setDisplayName(ChatColor.LIGHT_PURPLE + "Blacksmith's Enchantment II")) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.ANVIL);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - 16x Exp Bottles", ChatColor.GRAY + " - Damaged Anvil", ChatColor.GRAY + " - Random Enchantment Book", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    CHEF("Chef", 2500, new cItemStack(Material.EGG, 16), new cItemStack(Material.GOLDEN_APPLE), new cItemStack(Material.IRON_HELMET)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.EGG);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - 16x Eggs", ChatColor.GRAY + " - Golden Apple", ChatColor.GRAY + " - Iron Helmet", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    DEMOMAN("Demo Man", 5000, new cItemStack(Material.TNT, 8), new cItemStack(Material.GOLD_HELMET).addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2),
            new cItemStack(Material.GOLD_BOOTS).addEnchant(Enchantment.PROTECTION_FALL, 2), new cItemStack(Material.WATER_BUCKET)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.REDSTONE_TORCH_ON);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - 8x TNT", ChatColor.GRAY + " - Golden Helmet [Blast Protection 2]", ChatColor.GRAY + " - Golden Boots [Feather Falling 2]", ChatColor.GRAY + " - Water Bucket", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    ENCHANTER("Enchanter", 5000, new cItemStack(Material.EXP_BOTTLE, 32), new cItemStack(Material.ENCHANTMENT_TABLE), new cItemStack(Material.IRON_HELMET)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.ENCHANTMENT_TABLE);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - 32x Exp Bottles", ChatColor.GRAY + " - Enchantment Table", ChatColor.GRAY + " - Iron Helmet", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    GLADIATOR("Gladiator", 5000, new cItemStack(Material.GOLD_HELMET), new cItemStack(Material.GOLD_CHESTPLATE), new cItemStack(Material.GOLD_BOOTS)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.GOLD_HELMET);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Gold Helmet", ChatColor.GRAY + " - Gold Chestplate", ChatColor.GRAY + " - Gold Boots", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    KNIGHT("Knight", 2500, new cItemStack(Material.IRON_SWORD), new cItemStack(Material.GOLD_BOOTS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.IRON_SWORD);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Iron Sword", ChatColor.GRAY + " - Gold Boots [Protection 1]", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    MEDIC("Medic", 2500, new cItemStack(Material.POTION, 2, (short) 16421), new cItemStack(Material.POTION, 1, (short) 8257)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.PAPER);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - 2x Splash Healing Potions", ChatColor.GRAY + " - Extended Regen Potions", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    MINER("Miner", 2500, new cItemStack(Material.IRON_PICKAXE).addEnchant(Enchantment.DIG_SPEED, 3).addEnchant(Enchantment.DAMAGE_ALL, 1),
            new cItemStack(Material.IRON_BOOTS), new cItemStack(Material.WATER_BUCKET, 2)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.STONE_PICKAXE);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Iron Pickaxe [Efficiency 3, Sharpness 1]", ChatColor.GRAY + " - Iron Boots", ChatColor.GRAY + " - 2x Water Buckets", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    PYRO("Pyro", 2500, new cItemStack(Material.WOOD_SWORD).addEnchant(Enchantment.FIRE_ASPECT, 1), new cItemStack(Material.POTION, 1, (short) 8259), new cItemStack(Material.LAVA_BUCKET, 2)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.FIREBALL);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Wooden Sword [Fire Aspect 1]", ChatColor.GRAY + " - Fire Resist Potion", ChatColor.GRAY + " - 2x Lava Buckets", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    RECON("Recon", 2500, new cItemStack(Material.STONE_SWORD), new cItemStack(Material.POTION, 2, (short) 16482)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.STONE_SWORD);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Stone Sword", ChatColor.GRAY + " - 2x Splash Swiftness Potion", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    VIKING("Viking", 2500, new cItemStack(Material.GOLD_AXE).addEnchant(Enchantment.DAMAGE_ALL, 1).addEnchant(Enchantment.DURABILITY, 2), new cItemStack(Material.IRON_HELMET)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.GOLD_AXE);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Gold Axe [Sharpness 1, Unbreaking 2]", ChatColor.GRAY + " - Iron Helmet", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    WIZARD("Wizard", 5000, new cItemStack(Material.FIREBALL), new cItemStack(Material.STICK).addEnchant(Enchantment.KNOCKBACK, 2), new cItemStack(Material.POTION, 1, (short) 8257)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.EXP_BOTTLE);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - x3 Fire Charge", ChatColor.GRAY + " - Stick [Knockback 2]", ChatColor.GRAY + " - Regen Potion", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    WOLFMAN("Wolf Man", 5000, new cItemStack(Material.MONSTER_EGG, 2, (short) 95), new cItemStack(Material.LEATHER_BOOTS), new cItemStack(Material.LEATHER_HELMET),
            new cItemStack(Material.BONE).addEnchant(Enchantment.KNOCKBACK, 1)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.MONSTER_EGG, 1, (short) 95);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - 2x Wolf Egg", ChatColor.GRAY + " - Leather Boots", ChatColor.GRAY + " - Leather Helmet", ChatColor.GRAY + " - Bone [Knockback 1]", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    },

    WOODSMAN("Woodsman", new cItemStack(Material.WOOD_SWORD), new cItemStack(Material.STONE_PICKAXE).addEnchant(Enchantment.DIG_SPEED, 1),
            new cItemStack(Material.STONE_AXE).addEnchant(Enchantment.DIG_SPEED, 1), new cItemStack(Material.STONE_SPADE, 1).addEnchant(Enchantment.DIG_SPEED, 1)) {
        @Override
        public cItemStack craftItemStack(WaterWarsUser user) {
            cItemStack i = new cItemStack(Material.STONE_AXE);

            i.setDisplayName(user.ownsKit(this) ? ChatColor.GREEN + this.getDisplay() : ChatColor.RED + this.getDisplay());
            i.addLore(ChatColor.GRAY + " - Wooden Sword", ChatColor.GRAY + " - Stone Pickaxe [Efficiency 1]", ChatColor.GRAY + " - Stone Axe [Efficiency 1]", ChatColor.GRAY + " - Stone Shovel [Efficiency 1]", "");
            i.addLore(user.ownsKit(this) ? ChatColor.GREEN + " > UNLOCKED" : ChatColor.RED + " > " + this.getUnlockCost() + " Coins");

            return i;
        }
    };

    public abstract cItemStack craftItemStack(WaterWarsUser user);

    private final String display;
    private final int unlockCost;
    private final ItemStack[] items;

    Kit(String display, ItemStack... items) {
        this.display = display;
        this.unlockCost = 0;
        this.items = items;
    }

    Kit(String display, int unlockCost, ItemStack... items) {
        this.display = display;
        this.unlockCost = unlockCost;
        this.items = items;
    }

    public String getDisplay() {
        return display;
    }

    public boolean isUnlockedByDefault() {
        return unlockCost == 0;
    }

    public int getUnlockCost() {
        return unlockCost;
    }

    public ItemStack[] getItems() {
        return items;
    }
}
