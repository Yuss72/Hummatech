import java.util.Scanner;

class player {
    private String name;
    private int health;
    private String weapon;
    private int damage;

    public player(String name, int health, String weapon, int damage) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth() {
        this.health = 100;
    }

    public int getHealth() {
        return this.health;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int takeDamagePlayer(int enemyDamage) {
        return this.health -= enemyDamage;
    }
}
class enemy {
    private String name;
    private int health;
    private int damage;

    public enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth() {
        this.health = 100;
    }

    public int getHealth() {
        return this.health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int takeDamageEnemy(int enemyDamage) {
        return this.health -= enemyDamage;
    }
}

public class kodenyaRomi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "Pemain";
        int playerHealth = 100;
        String senjata = "sword";
        int playerDamage = 5;
        player character = new player(nama, playerHealth, senjata, playerDamage);

        boolean kondisi = false;
        String namaMonster = "Galvin";
        int monsterHealth = 100;
        int monsterDamage = 10;
        enemy monster = new enemy(namaMonster, monsterHealth, monsterDamage);

        do {
            System.out.println("Status Pemain: ");
            System.out.println(character.getName() + " health: " + character.getHealth());
            System.out.println("Status Musuh: ");
            System.out.println(monster.getName() + " health: " + monster.getHealth());

            System.out.println("\nMenu:");
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Run");
            System.out.print("Input: ");
            int choice = input.nextInt();

            switch(choice) {
                case 1:
                    playerHealth = monster.takeDamageEnemy(playerDamage);
                break;
                case 2:
                    monsterHealth = character.takeDamagePlayer(monsterDamage);
                break;
                case 3:
                    System.out.println("Pemain berhasil kabur!");
                    kondisi = true;
                break;
                default:
                    System.out.println("Invalid choice");
                break;
            }
        } while(character.getHealth() > 0 && monster.getHealth() > 0 && !kondisi);
    }
}