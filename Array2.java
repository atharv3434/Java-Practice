public class Array2 {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int arr[]= {1,7,6,9,11,8,4,2,10};

        for(int element:arr){
            if(isPrime(element)){
                System.out.println(element);
            }
        }
    }
}
