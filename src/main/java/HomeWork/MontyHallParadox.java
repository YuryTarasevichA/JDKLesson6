package HomeWork;

import java.util.Random;
import java.util.stream.IntStream;

public class MontyHallParadox {

    public static void main(String[] args) {
        int totalGames = 1000;
        int stayWins = 0;
        int switchWins = 0;

        Random rand = new Random();

        for (int i = 0; i < totalGames; i++) {
            int carPosition = rand.nextInt(3);
            int chosenDoor = rand.nextInt(3);

            int revealedDoor;
            do {
                revealedDoor = rand.nextInt(3);
            } while (revealedDoor == carPosition || revealedDoor == chosenDoor);

/*
Игрок выбирает: остаться или сменить команду
Раскомментируйте одну из следующих строк, чтобы выбрать стратегию
int FinalChoice = выбранная дверь; // Стратегия пребывания
 */
            int finalRevealedDoor = revealedDoor;
            int finalChoice = IntStream.range(0, 3).filter(door -> door
                    != chosenDoor && door != finalRevealedDoor).findFirst().getAsInt(); // Switch strategy

            if (finalChoice == carPosition) {
                if (finalChoice == chosenDoor) {
                    stayWins++;
                } else {
                    switchWins++;
                }
            }
        }

        System.out.println("Wins by staying: " + stayWins);
        System.out.println("Wins by switching: " + switchWins);
    }
}
