public class Even {
    public static void main(String[] args) {
        int number= 0;
        int sum=0;
        while(number<=100){

            if(number%2==0){
                System.out.println(number);
                sum+=number;
            }
            number++;
            ;
        }
        System.out.println(sum);
    }
}
