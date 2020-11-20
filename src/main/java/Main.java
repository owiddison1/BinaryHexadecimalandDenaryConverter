import java.util.Scanner;
class Main {
    public static double BinToDen(String binary) {
        Scanner bininput = new Scanner(System.in);
        String zeroone = "01";
        boolean check = false;
        boolean fullcheck = false;
        while(fullcheck == false) {
            check = false;
            while(check == false) {
                try {
                    int newbinary = Integer.parseInt(binary);
                    check = true;
                } catch(Exception e) {
                    System.out.println("Please enter a valid number: ");
                    binary = bininput.nextLine();
                }
            }
            if(check == true) {
                boolean minicheck = true;
                String useless = "meh";
                int newbinary = Integer.parseInt(binary);
                for(int i = 0 ; i < binary.length() ; i++) {
                    if(newbinary >= 0 && (binary.charAt(i)) == zeroone.charAt(0) || binary.charAt(i) == zeroone.charAt(1)) {
                        useless = "well whatever";
                    } else {
                        System.out.println("Please enter a valid number: ");
                        binary = bininput.nextLine();
                        minicheck = false;
                    }
                    if(minicheck = true) {
                        fullcheck = true;
                    }
                }
            } else {
                System.out.println("Please enter a valid number: ");
                binary = bininput.nextLine();
            }
        }
        double denary = 0;
        for(int i = binary.length()-1 ; i >= 0 ; i--) {
            if(i == binary.length() - 1 && binary.substring(i) == "0") {
                denary = denary + 1;
            } else {
                double dnum = binary.length() - i - 1;
                double inum = Double.parseDouble(Character.toString(binary.charAt(i)));
                denary = denary + Math.pow(2, dnum) * inum;
            }
        }
        return denary;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        while(check == false) {
            System.out.println("Would you like to: ");
            System.out.println("(1) Convert Binary to Denary");
            System.out.println("(2) Convert Denary to Binary");
            System.out.println("(3) Convert Binary to Hexadecimal");
            System.out.println("(4) Convert Hexadecimal to Binary");
            System.out.println("(5) Convert Hexadecimal to Denary");
            System.out.println("(6) Convert Denary to Hexadecimal");
            System.out.println("(7) Exit");
            System.out.println("Choose an option 1 - 7: ");
            String choice = input.nextLine();
            if(choice.equals("1")) {
                System.out.println("Please enter your binary number: ");
                String binary = input.nextLine();
                double newnum = BinToDen(binary);
                System.out.println("Your number in denary is " + newnum);
            }
        }
    }
}