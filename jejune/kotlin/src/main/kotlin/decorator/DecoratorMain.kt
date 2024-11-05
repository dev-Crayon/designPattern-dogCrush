package decorator

import decorator.job.Archer
import decorator.job.Mage
import decorator.job.Warrior
import decorator.weapon.ArmorDecorator
import decorator.weapon.BowDecorator
import decorator.weapon.ShieldDecorator
import decorator.weapon.SwordDecorator

fun main() {
    println("기본 전사:")
    val warrior = Warrior()
    println(warrior.getHeroStat())

    println("\n검 장착 후 전사:")
    val warriorWithSword = SwordDecorator(warrior)
    println(warriorWithSword.getHeroStat())

    println("\n검과 방패 장착 후 전사:")
    val warriorWithSwordAndShield = ShieldDecorator(warriorWithSword)
    println(warriorWithSwordAndShield.getHeroStat())

    println("\n모든 장비 장착 후 전사:")
    val fullyEquippedWarrior = ArmorDecorator(warriorWithSwordAndShield)
    println(fullyEquippedWarrior.getHeroStat())

    // 다른 직업 테스트
    println("\n기본 마법사:")
    val mage = Mage()
    println(mage.getHeroStat())

    println("\n장비 장착 후 마법사:")
    val equippedMage = ShieldDecorator(ArmorDecorator(mage))
    println(equippedMage.getHeroStat())

    // 아처 클래스
    println("\n기본 궁수:")
    val archer = Archer()
    println(archer.getHeroStat())

    println("\n장비 장착 후 궁수:")
    val equippedArcher = BowDecorator(SwordDecorator(archer))
    println(equippedArcher.getHeroStat())

    println("\n모든 장비 장착 후 궁수:")
    val fullyEquippedArcher = ArmorDecorator(ShieldDecorator(BowDecorator((archer))))
    println(fullyEquippedArcher.getHeroStat())
}
