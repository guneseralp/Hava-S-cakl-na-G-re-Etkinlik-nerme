import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int temp;

        System.out.print("Hava sicakliğinedir?: " + "\n1- 5 dereceden küçük"+"\n2- 5 ile 15 derece arasi"+"\n3- 15 ile 25 derece arasi"+"\n4- 25 dereceden  büyük");

        System.out.print("\nHangi secenegi sectiginizi belirtiniz: ");
        temp= input.nextInt();

        switch (temp){

            case 1:
                System.out.print("Kayak yapmanizi öneririm.");
                break;
            case 2:
                System.out.print("Sinemaya gitmenizi öneririm.");
                break;
            case 3:
                System.out.print("Pikniğe gitmenizi öneririm.");
                break;
            case 4 :
                System.out.print("Yüzmeye gitmenizi öneririm.");
                break;
        }
    }
}
