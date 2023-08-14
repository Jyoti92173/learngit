public class Vote {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter age:")
        int age=sc.nextInt();
        if(age>18){
            System.out.println("you are eligible for Vote");
        }
        else{
            System.out.println(" you are Not eligible");
        }
        
    }
}