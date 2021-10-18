package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
        player.name = "Ethan";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Ethan", 40, "Sword");

        player1.loseHealth(10);
        System.out.println(player1.getHealth());
    }
}
