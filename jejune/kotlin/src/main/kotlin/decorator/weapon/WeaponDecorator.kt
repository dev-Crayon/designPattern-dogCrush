package decorator.weapon

import decorator.Hero

class SwordDecorator(hero: Hero) :
    WeaponStat(hero, "검", damageBonus = 5, defenseBonus = 2)

class ShieldDecorator(hero: Hero) :
    WeaponStat(hero, "방패", defenseBonus = 10, healthBonus = 50)

class ArmorDecorator(hero: Hero) :
    WeaponStat(hero, "갑옷", defenseBonus = 15, healthBonus = 30)

class BowDecorator(hero: Hero) :
    WeaponStat(hero, "활", damageBonus = 10, defenseBonus = 5)