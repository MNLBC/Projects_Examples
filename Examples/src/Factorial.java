import java.math.BigDecimal;  
import java.util.Scanner;  
public class Factorial {  
    public static BigDecimal factorial(int n){   
        BigDecimal result = new BigDecimal(1);  
        BigDecimal a;  
        for(int i = 2; i <= n; i++){  
            a = new BigDecimal(i);//将i转换为BigDecimal类型  
            result = result.multiply(a);//不用result*a，因为BigDecimal类型没有定义*操作</span><span>  
        }  
        return result;  
    }  
      
    public static void main(String[] arguments){  
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();//读取控制台输入的整数  
        System.out.println(a + "!=" + factorial(a));  
    }  
  
}  