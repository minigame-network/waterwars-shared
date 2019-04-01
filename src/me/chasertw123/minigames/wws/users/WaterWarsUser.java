package me.chasertw123.minigames.wws.users;

import me.chasertw123.minigames.wws.unlocks.cages.Cage;
import me.chasertw123.minigames.wws.unlocks.kits.Kit;
import org.bson.Document;

import java.util.List;

public interface WaterWarsUser {

    Kit getSelectedKit();

    void setSelectedKit(Kit selectedKit);

    boolean ownsKit(Kit kit);

    Cage getSelectedCage();

    void setSelectedCage(Cage selectedCage);

    boolean ownsCage(Cage cage);

    List<Kit> getOwnedKits();

    List<Cage> getOwnedCages();

}
