package decorator

import decorator.attribute.Damage
import decorator.attribute.Defense
import decorator.attribute.Health

open class Hero(
    private val name: String,
    private val baseDamage: Int = 10,
    private val baseDefense: Int = 5,
    private val baseHealth: Int = 100
) : Damage, Defense, Health {
    override fun getDamage() = baseDamage
    override fun getDefense() = baseDefense
    override fun getHealth() = baseHealth

    // 캐릭터 이름 출력을 위한 메서드
    open fun getCharacterInfo() = name

    // 캐릭터 상세 정보 반환
    open fun getHeroStat(): String = """
        캐릭터: $name
        데미지: ${getDamage()}
        방어력: ${getDefense()}
        체력: ${getHealth()}
    """.trimIndent()
}