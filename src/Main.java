import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zdrasti huklo");
        System.out.println("Toz kod e vuprosnik shtoto nqame kvo da praim");
        System.out.println();
        System.out.println("Gotov li si? (1 za da, 2 za ne)");
        int answer = scanner.nextInt();

        if (answer == 1) {
            System.out.println("Dobre\n");
        } else if (answer == 2) {
            System.out.println("Ebi se togava");
            return;
        } else {
            System.out.println("Ili si tup ili ne mojesh da pishesh");
            return;
        }

        System.out.println("Vupros 1 - V koi vek jiveem");
        System.out.println("Vuzmozni otgovori: ");
        System.out.println("1 - 2025");
        System.out.println("2 - ne znam");
        System.out.println("3 - 15");
        System.out.println("4 - 21");
        System.out.println();
        System.out.println("Molq napishi otgovora: ");
        int answerv1 = scanner.nextInt();

        if (answerv1 == 1 || answerv1 == 2 || answerv1 == 3) {
            System.out.println("Greshka, prost!");
            return;
        } else if (answerv1 == 4) {
            System.out.println("BRAVO BE PHILIPS!");
        } else {
            System.out.println("Ili si tup ili ne mojesh da pishesh");
            return;
        }

        System.out.println("Uspeshno otgovori na purviq vupros, gotov li si za vtoriq (1 za da, 2 za ne)");
        int answer2 = scanner.nextInt();

        if (answer2 == 1) {
            System.out.println("Dobre\n");
        } else if (answer2 == 2) {
            System.out.println("Ebi se togava");
            return;
        } else {
            System.out.println("Ili si tup ili ne mojesh da pishesh");
            return;
        }

        System.out.println("Vupros 2 - Na kolko e ravno uravnenieto: (15+25)^2 + 25-18");
        System.out.println("Vuzmozni otgovori: ");
        System.out.println("1 - 1600");
        System.out.println("2 - 1607");
        System.out.println("3 - -2");
        System.out.println("4 - 958,326,983.(3)");
        System.out.println();
        System.out.println("Molq napishi otgovora: ");
        int answerv2 = scanner.nextInt();

        if (answerv2 == 1) {
            System.out.println("Greshka, prost!");
            return;
        } else if (answerv2 == 2) {
            System.out.println("BRAVO BE PHILIPS!");
        } else if (answerv2 == 3 || answerv2 == 4) {
            System.out.println("Greshka, prost!");
            return;
        } else {
            System.out.println("Ili si tup ili ne mojesh da pishesh");
            return;
        }
        System.out.println();
        System.out.println("Uspeshno otgovori na vtoriq vupros, gotov li si za tretiq (1 za da, 2 za ne)");
        int answer3 = scanner.nextInt();

        if (answer3 == 1)
        {
            System.out.println("Dobre");
            System.out.println();
        }
        else if (answer3 == 2)
        {
            System.out.println("Ebi se togava");
            
        }
        else if (answer3 > 2 | answer3 < 1)
        {
            System.out.println("Ili si tup ili ne mojesh da pishesh");
            
        }

        System.out.println("Vupros 3 - Kakva e razlikata mejdu shterka i dushterq");
        System.out.println("Vuzmojni otgovori: ");
        System.out.println("1 - Ednoto e edno a drugoto e drugo");
        System.out.println("2 - Ebali mu maikata");
        System.out.println("3 - Nqma");
        System.out.println("4 - Ima");
        System.out.println();
        System.out.println("Molq napishi otgovora: ");
        int answerv3 = scanner.nextInt();

        if (answerv3 == 1)
        {
            System.out.println("Greshka, prost!");
            
        }
        else if (answerv3 == 2)
        {
            System.out.println("Greshka, prost!");
            
        }
        else if (answerv3 == 3)
        {
            System.out.println("BRAVO BE PHILIPS!");
        }
        else if (answerv3 == 4)
        {
            System.out.println("Greshka, prost!");
            
        }
        else
        {
            System.out.println("Ili si tup ili ne mojesh da pishesh");
            
        }

        System.out.println("Ti uspeshno reshi tozi quiz, bravo BE PHILIPS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
