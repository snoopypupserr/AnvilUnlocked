<p align="center">
  <img src="https://media.forgecdn.net/avatars/2055/548/639253607593365232.png" alt="No Rename Level Cost Logo" width="128"/>
</p>

# AnvilUnlocked

**AnvilUnlocked** is a lightweight NeoForge mod that eliminates the XP level cost when renaming items in an anvil[cite: 1]. 

Vanilla Minecraft charges an increasing amount of experience levels simply for changing an item's name. This mod alters the anvil behavior using Mixins so that custom name changes cost **0 XP levels**, letting you personalize your gear, name tags, and tools freely without wasting hard-earned experience[cite: 1].

---

**Features**
* **Free Item Renaming:** Renaming any item in an anvil costs zero experience levels[cite: 1].
* **Seamless Vanilla Integration:** Retains standard anvil mechanics for repairing and combining enchantments—only name adjustments are made free[cite: 1].
* **Server-Side Friendly:** Works cleanly via NeoForge mixins (`AnvilMenuMixin`) for smooth performance[cite: 1].

---

**Installation**

1. **Prerequisites:** Ensure you have the appropriate version of **Minecraft** and **NeoForge** installed[cite: 1].
2. **Download:** Grab the latest `.jar` release of **AnvilUnlocked**[cite: 1].
3. **Deploy:** Drop the `.jar` file into your Minecraft instance's `mods` folder[cite: 1].
4. **Play:** Launch the game and enjoy zero-cost item renaming[cite: 1]!

---

**Technical Details**

* **Mod Loader:** NeoForge[cite: 1]
* **Key Components:**
  * `com.norenamelevelcost.NoRenameLevelCost` – Main mod entry point[cite: 1].
  * `com.norenamelevelcost.mixin.AnvilMenuMixin` – Injector intercepting anvil level calculations[cite: 1].
  * `com.norenamelevelcost.AnvilRenameHandler` – Core logic handling cost overrides during rename operations[cite: 1].

---
