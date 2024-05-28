public class Problem02 {
public static void main(String args[]){
    int n1=1, n2=1, n3=0, limit=5000000, sum=0;
    while(true){
        n3=n1+n2; 
        n1=n2; 
        n2=n3;
        if(n3%2==0){
            sum += n3;
            if(sum<=limit)
            System.out.println(sum);
            else
            break;
        }
    }
}
}
