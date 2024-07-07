public class Calculation {
public static void main(String[] args) {
    int sum =0;
    for(int i=1;i<=10;i++){
        sum=sum+i;

    }

    System.out.println("The sum of first 100 numbers is " +sum);

    int j=0;

    System.out.println("\n\nPrinting the list of 10 even number");


    while(j<=10){
        System.out.println(j);

        j=j+2;
    }
    System.out.println("Printing the list of first 10 odd numbers");
    int k=1;
    do{
        System.out.println(k);

        k=k+2;

    }while(k<=10);

}
}
