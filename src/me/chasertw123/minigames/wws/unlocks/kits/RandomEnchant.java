package me.chasertw123.minigames.wws.unlocks.kits;

import me.chasertw123.minigames.core.utils.items.cItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class RandomEnchant {

    private static HashMap<Enchantment, Integer> VALID_ENCHANTMENTS = new HashMap<>();

    static {
        VALID_ENCHANTMENTS.put(Enchantment.DAMAGE_ALL, 1);
        VALID_ENCHANTMENTS.put(Enchantment.KNOCKBACK, 2);
        VALID_ENCHANTMENTS.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        VALID_ENCHANTMENTS.put(Enchantment.PROTECTION_FALL, 2);
    }

    public static cItemStack getRandomEnchantmentBook() {

        cItemStack item = new cItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta itemMeta = (EnchantmentStorageMeta) item.getItemMeta();

        Enchantment enchantment = (Enchantment) VALID_ENCHANTMENTS.keySet().toArray()[ThreadLocalRandom.current().nextInt(VALID_ENCHANTMENTS.size())];

        itemMeta.addStoredEnchant(enchantment, ThreadLocalRandom.current().nextInt(VALID_ENCHANTMENTS.get(enchantment)) + 1, true);

        item.setItemMeta(itemMeta);

        return item;
    }
}
