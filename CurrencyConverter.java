pacakge com.LetsGrowMore;05.

import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter{
    public static void main(String[] args) {
        double rupee, dollar, pound, euro, yen, ringgit, kwd;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Press 1 -> Rupee");
            System.out.println("Press 2 -> Dollar");
            System.out.println("Press 3 -> Pound");
            System.out.println("Press 4 -> Euro");
            System.out.println("Press 5 -> Yen");
            System.out.println("Press 6 -> Ringgit");
            System.out.println("Press 7 -> kwd");
            System.out.println("Press 8 -> Exit");
            System.out.println("Select an Option -------");
            int choice = sc.nextInt();

            switch(choice){

                case 1 : {
                    System.out.println("Enter the amount in rupees : ");
                    rupee = sc.nextFloat();
                    dollar = rupee / 80.98;
                    System.out.println("Dollar : "+f.format(dollar));
                    pound = rupee / 101;
                    System.out.println("Pound : "+f.format(pound));
                    euro = rupee / 88.5;
                    System.out.println("Euro : "+f.format(euro));
                    kwd = rupee / 267;
                    System.out.println("KWD : "+f.format(kwd));
                    yen = rupee / 0.63;
                    System.out.println("Yen : "+f.format(yen));
                    ringgit = rupee / 16;
                    System.out.println("Ringgit : "+f.format(ringgit));
                    break;
                }

                case 2 : {
                    System.out.println("Enter the amount in Dollar : ");
                    dollar = sc.nextFloat();
                    rupee = dollar * 75;
                    System.out.println("Rupee : "+f.format(rupee));
                    pound = dollar * 0.72;
                    System.out.println("Pound : "+f.format(pound));
                    euro = dollar * 0.88;
                    System.out.println("EURO "+f.format(euro));
                    kwd = dollar * 0.30;
                    System.out.println("KWD : "+f.format(kwd));
                    yen = dollar * 111.087;
                    System.out.println("Yen : "+f.format(yen));
                    ringgit = dollar * 4.17;
                    System.out.println("Ringgit : "+f.format(ringgit));
                    break;
                }

                case 3 : {
                    System.out.println("Enter the amount in Pound : ");
                    pound = sc.nextFloat();
                    rupee = pound * 101;
                    System.out.println("Rupee : "+f.format(rupee));
                    dollar = pound * 1.35;
                    System.out.println("Dollar : "+f.format(dollar));
                    euro = pound * 1.36;
                    System.out.println("Euro : "+f.format(euro));
                    kwd = pound * 0.4;
                    System.out.println("KWD : "+f.format(kwd));
                    yen = pound * 140.93;
                    System.out.println("Yen : "+f.format(yen));
                    ringgit = pound * 5.29;
                    System.out.println("Ringgit : "+f.format(ringgit));
                    break;
                }

                case 4 : {
                    System.out.println("Enter the amount in Euro : ");
                    euro = sc.nextFloat();
                    rupee = euro * 84;
                    System.out.println("Rupee : "+f.format(rupee));
                    dollar = euro * 1.12;
                    System.out.println("Dollar : "+f.format(dollar));
                    pound = euro * 0.73;
                    System.out.println("Pound : "+f.format(pound));
                    kwd = euro * 0.34;
                    System.out.println("KWD : "+f.format(kwd));
                    yen = euro * 127.32;
                    System.out.println("Yen : "+f.format(yen));
                    ringgit = euro * 4.78;
                    System.out.println("Ringgit : "+f.format(ringgit));
                    break;
                }

                case 5 : {
                    System.out.println("Enter the amount in Yen: ");
                    yen = sc.nextFloat();
                    rupee = yen * 0.63;
                    System.out.println("Rupee : "+f.format(rupee));
                    dollar = yen * 0.008;
                    System.out.println("Dollar : "+f.format(dollar));
                    pound = yen * 0.007;
                    System.out.println("Pound : "+f.format(pound));
                    euro = yen * 0.007;
                    System.out.println("Euro : "+f.format(euro));
                    kwd = yen * 0.0023;
                    System.out.println("KWD : "+f.format(kwd));
                    ringgit = yen * 0.033;
                    System.out.println("Ringgit : "+f.format(ringgit));
                    break;
                }

                case 6 : {
                    System.out.println("Enter the amount in Ringgit : ");
                    ringgit = sc.nextFloat();
                    rupee = ringgit * 16.8;
                    System.out.println("Rupee : "+f.format(rupee));
                    dollar = ringgit * 0.239;
                    System.out.println("Dollar : "+f.format(dollar));
                    pound = ringgit * 0.188;
                    System.out.println("Pound : "+f.format(pound));
                    euro = ringgit * 0.209;
                    System.out.println("Euro : "+f.format(euro));
                    yen = ringgit * 26.63;
                    System.out.println("Yen : "+f.format(yen));
                    kwd = ringgit * 0.069;
                    System.out.println("Ringgit : "+f.format(kwd));
                    break;
                }

                case 7 : {
                    System.out.println("Enter the amount in KWD : ");
                    kwd = sc.nextFloat();
                    rupee = kwd * 250;
                    System.out.println("Rupee : "+f.format(rupee));
                    dollar = kwd * 3.30;
                    System.out.println("Dollar : "+f.format(dollar));
                    pound = kwd * 2.5;
                    System.out.println("Pound : "+f.format(pound));
                    euro = kwd * 2.94;
                    System.out.println("Euro : "+f.format(euro));
                    yen = kwd * 438.86;
                    System.out.println("Yen : "+f.format(yen));
                    ringgit = kwd * 14.5;
                    System.out.println("Ringgit : "+f.format(ringgit));
                    break; 
                }

                case 8 : {
                    System.out.println("------- Exit  Successfully -------");
                    System.exit(0);
                    break;
                }

                default : {
                    System.out.println(" Invalid  Option ");
                    break;
                }
                
            }
        }
        }
}
