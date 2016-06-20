import java.math.BigDecimal;  
import java.util.Scanner;  
public class Factorial {  
    public static BigDecimal factorial(int n){   
        BigDecimal result = new BigDecimal(1);  
        BigDecimal a;  
        for(int i = 2; i <= n; i++){  
            a = new BigDecimal(i);//��iת��ΪBigDecimal����  
            result = result.multiply(a);//����result*a����ΪBigDecimal����û�ж���*����</span><span>  
        }  
        return result;  
    }  
      
    public static void main(String[] arguments){  
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();//��ȡ����̨���������  
        System.out.println(a + "!=" + factorial(a));  
    }  
  
}  