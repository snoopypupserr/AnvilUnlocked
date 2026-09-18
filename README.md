<p align="center">
  <img src="https://media.forgecdn.net/avatars/2055/548/639253607593365232.png" alt="No Rename Level Cost Logo" width="128"/>
</p>

<p align="center">
  <a href="https://www.curseforge.com/minecraft/mc-mods/anvilunlocked">
    <img src="https://img.shields.io/badge/CurseForge-F16436?style=for-the-badge&logo=curseforge&logoColor=white" alt="CurseForge" />
  </a>
  <a href="https://discord.gg/uc7">
    <img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white" alt="Discord" />
  </a>
</p>

# AnvilUnlocked

**AnvilUnlocked** is a lightweight NeoForge mod that eliminates the XP level cost when renaming items in an anvil. 

Vanilla Minecraft charges an increasing amount of experience levels simply for changing an item's name. This mod alters the anvil behavior using Mixins so that custom name changes cost **0 XP levels**, letting you personalize your gear, name tags, and tools freely without wasting hard-earned experience.

---

**Features**
* **Free Item Renaming:** Renaming any item in an anvil costs zero experience levels.
* **Seamless Vanilla Integration:** Retains standard anvil mechanics for repairing and combining enchantments—only name adjustments are made free.
* **Server-Side Friendly:** Works cleanly via NeoForge mixins (`AnvilMenuMixin`) for smooth performance.

---

**Installation**

1. **Prerequisites:** Ensure you have the appropriate version of **Minecraft** and **NeoForge** installed.
2. **Download:** Grab the latest `.jar` release of **AnvilUnlocked**.
3. **Deploy:** Drop the `.jar` file into your Minecraft instance's `mods` folder.
4. **Play:** Launch the game and enjoy zero-cost item renaming!

---

**Technical Details**

* **Mod Loader:** NeoForge
* **Key Components:**
  * `com.norenamelevelcost.NoRenameLevelCost` – Main mod entry point.
  * `com.norenamelevelcost.mixin.AnvilMenuMixin` – Injector intercepting anvil level calculations.
  * `com.norenamelevelcost.AnvilRenameHandler` – Core logic handling cost overrides during rename operations.

---
