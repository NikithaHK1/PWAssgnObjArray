class Addition{

    int add1(int a,int b,int c){
        int sum=0;
        sum= a+b+c;
        return sum;
    }

    int add2(int a,int b){
        int sum=0;
        sum= a+b;
        return sum;
    }

    float add3(float a,float b,float c){
        float sum=0;
        sum= a+b+c;
        return sum;
    }

    float add4(float a,float b){
        float sum=0;
        sum= a+b;
        return sum;
    }
}

public class Assgn1 {
    public static void main(String[] args) {
    
        Addition obj = new Addition();
        int res1 = obj.add1(5,4,8);
        int res2 = obj.add2(3,9);
        float res3 = obj.add3(6.4f,7.9f,7.9f);
        float res4 = obj.add4(5.4f,8.9f);

        System.out.println("Result1 :  " + res1 + "   Result2: " + res2 + "   Result3: " + res3 + "   Result4: " +res4 );
    }
}
