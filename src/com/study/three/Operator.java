package com.study.three;

/**
 * 
 * @author Administrator
 * Operator 这是操作符学习类
 * 
 * 主要学习5个操作符：
 * 
 *  + ：加法运算
 *  - : 减法运算
 *  * ：乘法运算
 *  / : 除法运算
 *  % ：模运算
 *
 */
public class Operator

{
	public static void main(String[] args) 
	
	{

//		
//		int a = 123;
//		
//		int b = 23;
//		
//		int c = 9;
		
//      求a,b,c的乘积。并打印输出。
//		
//		System.out.println("a * b * c = " + a * b * c);
		
//		求a,b,c的平方之和。并打印输出。
		
//		System.out.println("a * a + b * b + c * c = " + (a * a + b * b + c * c));
		
		
		
//		在以下表达式中，result的值是多少？
//		(1) 
//		int  a = 10;
//		
//		int  b = 20;
//		
//		int  result1 = a * b;
//
////		(2) 
//		int result2 = 17 % 4 ;
//
////		(3) 
//		int result3 = 4 % 17;
//
////		(4) 
//		int result4 = 17 % 17;
//
////		(5)
//		int result5 = 13 / 5;
//
////		(6)
//		double result6 = 13.0 / 5.0;
//		
//		System.out.println(result6);
		
//		以下代码的输出是什么?
		
//		int a = 12;
//		
//		double b = 13;
//		
//		boolean result = a > b;
//		
//		System.out.println(result); // false,a > b 为假
		
		//代码中 result的值是多少
		//(1)
//		boolean  result1 =  ( 13 >= 13 ); //true
//
//		//(2)
//		boolean result2 = (( 13 - 1 ) == 12); //true
//
//		//(3)
//		boolean result3 =  (( 25 % 5) != 0); //false
//
//		//(4)
//		int a = 3;
//		
//		boolean result4 =  ( (a - 3) != (a + 3) ); //true
//		
//		System.out.println(result4);
		
		//以下代码的输出为？
		
//		int a = 12;
//		
//		int b = 20;
//	
//		System.out.println("result: " +   (a >=12 && b < 24)   ); // true :&& 逻辑与（并且）需要同时满足
		
		//以下代码的输出为：
		
//		int a = 12;
//		
//		boolean result = (( a < 12 ) || true ); //逻辑或（或者）
//		 
//		System.out.println("result: " + result); //true
		
//		boolean result = true && false; //逻辑与（并且）false
		
//		boolean result = false || false; //逻辑或（或者） false
		
//		boolean result = false || (3 > 2 ); //true
		
//		boolean result = ! true; //false
		
//		boolean result = ! (3 > 2); //false
//		
//		boolean a = false;
//		
//		boolean result = ( 3 > 2 ) && ( !a ); //true
		
//		int a = 3;
//		
//		boolean result = ! ( a > 3 || a < 8); //false
		
//		int a = 10;
//		
//		a += 12; // a = a + 12;
//		
//		int result = a;
		
//		System.out.println("result: " + result);
		
//		int a = 13;
//		
//		a %= 3; // a = a % 3;
//		
//		int result = a;
//		
//		System.out.println(result);
		
		//以下式子中的a,b,c的最终值是多少？
		
//		int a = 10;
//		
//		a ++; //a = a + 1;a = 11
//		
//		int b = a++; // b = 11; a = 12 ++前说明在运算前执行+1，在后说明在运算后执行+1
//		
//		int c = 13 + ( ++a); // a = 13;c = 26
//		
//		System.out.println("a = " + a + " b = " + b + " c = " + c);
//		
		//给定a,b,c的值，求他们的平均值
		
//		int a = 123;
//		
//		int b = 23;
//		
//		int c =2;
//		
//		int d = 453;
//		
//		double result = ( a + b + c + d) / 4;
//		
//		System.out.println(result);
		
		//以下代码 result 的值是多少？
		
//		int result = (int) ( 18.9 / 3 );
//		
//		System.out.println(result); // 6
		
		//以下值中 result 的值是多少？
		
//		double result = 18 / 3.0 / 10;
//		
//		System.out.println(result); // 0.6
		
		//以下代码有没有问题？
		
//		int abc = "2019"; //abc 为int类型 "2019"为String 类型
		
//		double a = 19 * 3.3;
//		
//		System.out.println("a: " + a); //62.699999999999996
		
		//给定一个4位数n,把他的各位数字单独打印出来
		// 例如：9527  输出9-5-2-7
		
		int n = 9527;
		
		int a = n % 10; //取出个位
		
		n /= 10; //此时n变成 952
		
		int b = n % 10; //取出十位
		
		n /= 10; //此时n变成 95
		
		int c = n % 10; //取出百位
		
		n /= 10; //此时n变成 9
		
		int d = n % 10; //取出千位
		
		System.out.println(d + "-" + c + "-" + b + "-" + a);
		
		
		
	}

}
