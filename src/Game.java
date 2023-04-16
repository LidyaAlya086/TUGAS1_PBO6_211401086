
public class Game {
    public static void main(String[] args) {
        // objek GameCharacter
        /* bagian ini sangat penting karena bisa menentukan siapa pemenang dari pertarungan
         * jika ingin Player menang, tinggal ubah health dan attackPower Player menjadi lebih tinggi dari enemy
         * sebaliknya jika ingin Enemy menang, tinggal ubah health dan attackPower Enemy menjadi lebih tinggi dari Player
         */
        GameCharacter player = new GameCharacter("Player", 100, 30);
        GameCharacter enemy = new GameCharacter("Enemy", 50, 30);

        // simulasi pertarungan antara dua karakter
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        // penentu pemenang pertemuran
        if (player.isAlive()) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(enemy.getName() + " wins!");
        }
    }
    
}
