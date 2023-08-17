public class Numbercheck {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("index found at index:" + i);
            }
        }
    }
}
