package portfolio.javamasterclass;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Santanu";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        System.out.println("*************************************************");
        EnhancedPlayer player1 = new EnhancedPlayer("Santanu", 200, "Sword");
        System.out.println("Initial health is " + player1.getHealth());

        System.out.println("*************************************************");
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getPagesPrinted());

        System.out.println("*************************************************");
        Printer printer1 = new Printer(50, true);
        System.out.println(printer1.addToner(50));
        System.out.println("initial page count = " + printer1.getPagesPrinted());
        int pagesPrinted1 = printer1.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted1 +
                " new total print count for printer = " + printer1.getPagesPrinted());
        pagesPrinted1 = printer1.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted1 +
                " new total print count for printer = " + printer1.getPagesPrinted());
    }
}
