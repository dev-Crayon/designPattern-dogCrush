package decorator.job

import decorator.Hero

// 다양한 직업 클래스들
class Warrior(name: String = "전사") : Hero(name, baseDamage = 15, baseDefense = 10, baseHealth = 120)
class Archer(name: String = "궁수") : Hero(name, baseDamage = 12, baseDefense = 5, baseHealth = 100)
class Mage(name: String = "마법사") : Hero(name, baseDamage = 8, baseDefense = 3, baseHealth = 80)
