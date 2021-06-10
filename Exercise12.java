import java.util.*;
public class Exercise12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int height = 0;
        int age = 0;
        String gender = "";
        int averageHeightF = 0;
        int averageHeightM = 0;
        int averageAge=0;
        int countM = 0;
        int countF = 0;
        int countP = 0;
        do{
            System.out.println("Enter the height: ");
            height = scanner.nextInt();
            if(height>0){
                System.out.println("Enter the age: ");
                age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the gender (F/M): ");
                gender = scanner.nextLine();
                if(gender.equals("M")){
                    countM++;
                    averageHeightM+=height;
                }else{
                    countF++;
                    averageHeightF+=height;
                }
                averageAge+=age;
                countP++;
            }

        }while(height>0);
        System.out.println("Average Height of Women : "+(averageHeightF/countF));
        System.out.println("Average Height of Men: "+(averageHeightM/countM));
        System.out.println("Average Age of Participants: "+(averageAge/countP));
    }
}