package decorator.weapon

import decorator.Hero

abstract class WeaponStat(
    hero: Hero,
    equipmentName: String,
    damageBonus: Int = 0,
    defenseBonus: Int = 0,
    healthBonus: Int = 0
) : Hero(
    name = "${hero.getCharacterInfo()}, $equipmentName",
    baseDamage = hero.getDamage() + damageBonus,
    baseDefense = hero.getDefense() + defenseBonus,
    baseHealth = hero.getHealth() + healthBonus
) {
}