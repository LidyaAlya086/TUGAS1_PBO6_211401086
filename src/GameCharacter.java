public class GameCharacter {
    // Fields untuk nama karakter, health, dan attack power
    private String name;
    private int health;
    private int attackPower;

    // Konstruktor untuk menginisialisasi nama karakter, health, dan attack power
    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // metode untuk menyerang GameCharacter lain
    public void attack(GameCharacter other) {
        other.takeDamage(attackPower);
        System.out.println(name + " attacks " + other.name + " for " + attackPower + " damage!");
    }

    // metode untuk menerima damage dari serangan
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage!");
    }

    // metode untuk mengecek apakah karakter masih hidup
    public boolean isAlive() {
        return health > 0;
    }

    // metode untuk mendapatkan nama karakter
    public String getName() {
        return name;
    }
}
