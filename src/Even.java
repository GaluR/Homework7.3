public class Even {
    public static void main(String[] args) {
        int number=100;
        int sum=0;
        for(int i=0;i<=number;i=i+2){

            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);
    }
}
