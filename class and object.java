// class object
 class Calculator 
 {
     int a; 
     public int add(int n1, int n2)
     {
         int r=n1+n2;
         return r;
     }
 }
 public class Demo {
    public static void main(String[] args)
    {
        int num1=55;
        int num2=7;
        Calculator cal = new Calculator();
        int result = cal.add(num1,num2);
        
        System.out.println(result);
    }
}
