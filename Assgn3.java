public class Assgn3 {
   public static void main(String[] args) {
    
        summing obj = new summing();
        obj.sum(new float[] {0.9f, 1, 2.7f, 3.8f, 4, 5.6f, 6, 7.7f, 8, 9.9f});
    }
}
class summing{
    void sum(float a[]){
    float sum=0;
    for (float i : a)
    {
        sum += i;
    }
    System.out.println(sum);
        
}
}