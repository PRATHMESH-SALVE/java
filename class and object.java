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

________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

//Methods

 class Computer 
{
public void playmusic()
{
    System.out.println("play music");
}
public String getmeapen(int cost)
{
    if(cost>=10)
    {
    return"pen";
    }
    else 
    {
        return "enter a valid amount";
    }
}
}

 public class Main {
    public static void main(String[] args)
    {
        Computer obj=new Computer();
        obj.playmusic();
        
         String str =obj.getmeapen(8);
       
      System.out.println(str);
        
    }
 }
 
________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

 // Method overloading
 class calculator
{
    public int add (int n1, int n2)
    {
      return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public Double add(double n1,double n2)
    {
        return n1+n2;
    }
}

 public class Demo {
    public static void main(String[] args) 
    {
        calculator calc = new calculator();
        int r1 =calc.add(300,700,12);
        System.out.println(r1);
    }
}


