import java.util.Scanner;

public class game3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого играка");
        String player1 = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите имя имя второго игрока");
        String player2 = scanner1.nextLine();
        System.out.println("список: 1-камень,2-ножницы,3-бумага");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ход игрока: " + player1 + ". Введите число");
        int Playerchoice = scanner3.nextInt();
        if (Playerchoice < 1 || Playerchoice > 3) {
            System.out.println("Такого числа нет в игре");
        } else {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Ход игрока: " + player2 + ". Введите число");
            int Playerchoiced = scanner4.nextInt();
            if (Playerchoiced < 1 || Playerchoiced > 3) {
                System.out.println("Такого числа нет в игре");
            } else {
                if (Playerchoice == 1 && Playerchoiced == 2) {
                    System.out.println("Победил " + player1 + " .Камень бьет ножницы");
                } else {
                    if (Playerchoice == 2 && Playerchoiced == 3) {
                        System.out.println("Победил " + player1 + " .Ножницы бьют бумагу");
                    } else {
                        if (Playerchoice == 3 && Playerchoiced == 1) {
                            System.out.println("Победил " + player1 + " .Бумагу бьет камень");
                        } else {
                            if (Playerchoiced == 1 && Playerchoice == 2) {
                                System.out.println("Победил " + player2 + " .Камень бьет ножницы");
                            } else {
                                if (Playerchoiced == 2 && Playerchoice == 3) {
                                    System.out.println("Победил " + player2 + " .Ножницы бьют бумагу");
                                } else {
                                    if (Playerchoiced == 3 && Playerchoice == 1) {
                                        System.out.println("Победил " + player2 + " .Бумагу бьет камень");
                                    }else {
                                        if (Playerchoiced == Playerchoice) {
                                            System.out.println("Ничья! Победила дружба");
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
}