package com.study.four;

/**
 * 
 * @author Administrator
 * Statement:这是语句学习类
 *
 */

public class Statement

{
	
	public static void main(String[] arge) 
	{
		//if 语句
		//在使用共享单车时需要检查使用者的年龄
		//如果在12岁以下，则静止骑行。

//		int age = 11; //使用者年龄
//		
//		if ( age < 12 ) 
//		{
//			
//			System.out.println( "未满12岁，不能骑小黄车" );
//		
//		}
		
		
		//score表示一个学生的分数，如果分数少于60则不及格
		//否则提示通过、并有奖励
		
//		int score = 60; //学生分数
//		
//		if ( score < 60 )
//			
//		{
//			System.out.println( "不及格" );
//		}
//		
//		else
//			
//		{
//			System.out.println( "通过了" );
//		}
//		
//		System.out.println( "结束" );
		
		
		//一个学生的分数 score 在90以上记为A，
		//在 80-90分记为B，在70-80记为C 70以下记为D
		
//		int score = 60; 
//		
//		if ( score >= 90 ) //90分以上
//			
//		{
//			
//			System.out.println( "A" );
//			
//		}
//		
//		else if ( score >= 80 ) //80-90分
//			
//		{
//			
//			System.out.println( "B" );
//			
//		}
//		
//		else if ( score >= 70 ) //70-80
//			
//		{
//			
//			System.out.println( "C" );
//			
//		}
//		
//		else if ( score < 70 ) //70分一下
//			
//		{
//			
//			System.out.println( "D" );
//			
//		}
		
		
		//for语句
		
		//计算1到100的平方和
		
//		int b = 0;
//		
//		for ( int a = 1;a < 101;a ++ )
//			
//		{
//			
//			a = a * a;
//			
//			b = b + a;
//			
//		}
//		
//		System.out.println(b);
		
		
		//计算 1到100以内，能被3整除的数
		
//		for ( int a = 1; a < 101;a++ )
//			
//		{
//			
//			if ( a % 3 == 0 )
//				
//			{
//				System.out.println( a );
//			}
//			
//		}
		
		
		//给定整数 n ，当n为偶数时从小到大输出，n为奇数时从大到小输出
		
//		int n = 0;
//		
//		if ( ( n % 2 == 0 ) && n != 0 ) 
//			
//		{
//			
//			for ( int a = 1;a <= n; a++ )
//				
//			{
//				
//				System.out.println(a);
//				
//			}
//		}
//		
//		else if ( ( n % 2 != 0 ) && n !=0 )
//		
//		{
//			
//			for ( ;n > 0;n-- )
//				
//			{
//				System.out.println(n);
//			}
//			
//		}
//		
//		else if ( n == 0 )
//			
//		{
//			
//			System.out.println(n);
//			
//		}
		
		
		
		//打印*号图形
		/*
		 * *
		 * **
		 * ***
		 */
		
//		int n = 5;
//		
//		for ( int i = 0; i < n; i ++ )
//			
//		{
//			for ( int k = 0; k <= i; k ++)
//				
//			{
//				
//				System.out.print("*");
//				
//			}
//			
//			System.out.println("\n");
//			
//		}
		
		
		// break 语句，用于中断循环
		// 要求打印输出一批数值，当数值超过10时停止打印
		
//		for ( int i = 0; i < 100; i ++) 
//			
//		{
//			
//			if ( i > 10 ) 
//				
//			{
//				
//				break; //运行到break时循环中止
//				
//			}
//			
//			System.out.println( i );
//			
//		}
		
		
		// continue 语句，用于跳过本轮循环
		//要求打印所有从1到20的数值，但不包括4的倍数
		
//		for ( int i = 1; i <= 20; i++ )
//		{
//			
//			if ( i % 4 == 0 )
//			{
//				
//				continue;
//				
//			}
//			
//			System.out.print(i + " ");
//			
//		}
		
		
		
		// for循环的变形
		
//		for ( ; ;) // for ( E1; E2; E3);E1、E2、 E3都为空也符合语法规则
//		{
//			System.out.println("in loop"); // 死循环
//		}

		
		// while 语句：表示循环
		//打印1到10之间的数值
		
//		int i = 1;
//		
//		while ( i <= 10 )
//		{
//			
//			System.out.print( i + " " );
//			
//			i ++;
//			
//		}
		
		
		
		//练习题
		
		//给定一个数a,如果为奇数则输出“为奇数”。如果为偶数则输出“为偶数”
		
//		int i = 124;
//		
//		if ( i % 2 == 0 )
//		{
//			System.out.println( i + " 为偶数");
//		}
//		else if ( i % 3 == 0 )
//		{
//			System.out.println( i + " 为奇数");
//		}
		
		
		//给定一个数，判断他是否既能被3整除，又能被7整除
		
//		int a = 21;
//		
//		if ( a % 3 == 0 && a % 7 ==0 )
//		{
//			System.out.println( a + " 既能被3整除，也能被7整除");
//		}
//		
//		else
//		{
//			System.out.println( a );
//		}
		
		
		//给定一个数，判断他是否在70-80之间
		
//		int i = 123;
//		
//		if ( i >= 70 && i <= 80 )
//		{
//			System.out.println( i + " 在70-80之间");
//		}
//		
//		else
//		{
//			System.out.println( i + " 不在70-80之间");
//		}
		
		
		// 给定一个数，如果他在[10.20]之间，或者在[50,60]之间则显示ok,否则错误
		
//		int i = 9;
//		
//		if ( i >= 10 && i <= 20 || i >= 50 && i <= 60 )
//		{
//			System.out.println("ok");
//		}
//		else
//		{
//			System.out.println("error");
//		}
		
		
		//给定一个值（可正可负），显示他的绝对值
		
//		int i = -123;
//		
//		if ( i < 0 )
//		{
//			System.out.println( -i );
//		}
//		else 
//		{
//			System.out.println( i );
//		}
		
		
		//给定3个数 a,b,c，判断他们是否相等
		
//		int a = 11;
//		
//		int b = 11;
//		
//		int c = 11;
//		
//		if ( a == b && b == c )
//		{
//			System.out.println( "相等");
//		}
//		else 
//		{
//			System.out.println("不相等");
//		}
		
		
		//打印从1到20所有能被4整除的数
		
//		for ( int i = 1; i <= 20; i++ )
//		{
//			if ( i % 4 == 0 )
//			{
//				System.out.print( i + " ");
//			}
//		}
//		
		
		//打印所有1-20之间能被3带除的数。按从大到小的顺序。
		
//		for (int i = 20; i > 0; i--)
//		{
//			if ( i % 3 == 0 )
//			{
//				System.out.println(i);
//			}
//		}
		
		
		//给定一个数N,  求 1 + 2 + 3 + ... + N 的和
		
//		int a = 3;
//		int b = 0;
//		
//		for ( int i = 0; i <= a; i++ )
//		{
////			b = i + i;
//			b += i;
//					
//		}
//		
//		System.out.println(b);
		
		
		//求100以内的奇数的平方和 

		//即 1* 1 +  3*3  + 5*5 + ... + 99 * 99 的和
		
//		int a = 0;
//		
//		for ( int i = 1; i <= 100; i ++ )
//		{
//			if ( i % 2 != 0 )
//			{
////				a = i * i;
//				
////				a += i * i;
//				
//				a = a + i * i;
//				
//			}
//			
//		}
//		System.out.println(a);
		
		
		
		//求1到100之间，所有能被3整除的数的立方和。
		
//		int result = 0;
//		
//		for ( int i = 1; i <= 100; i++ )
//		{
//			if ( i % 3 == 0 )
//			{
//				result += i * i * i;
//			}
//		}
//		
//		System.out.println(result);
		
		
		//给定三角形的三条边的长度。判断该三角形是否为直角三角形。

		//提示： 直角三角形的两条短边的平方和，等于斜边的平方。 （勾股定理)

//		int a = 3;
//		
//		int b = 5;
//		
//		int c = 4;
//		
//		//求各边长的平方和
//		int aa = a * a;
//		
//		int bb = b * b;
//		
//		int cc = c * c;
//		
//		if ( aa + bb == cc || aa + cc == bb || bb + cc == aa )
//		{
//			System.out.println("是直角三角形");
//		}
//		else 
//		{
//			System.out.println("不是直角三角形");
//		}
		
		
		/*
		 * 给定学生的分数。
		 *	90-100:  记为A
		 *	80-90: 记为B
		 *	70-80: 记为C
		 *	60-70: 记为D
		 *	<60: 记为E
		 *
		 *	已知:int score = 89;  // 给定学生的分数，求他的评级。
		 * 
		 * 
		 */

//		int score = 45;
//		
//		if ( score > 90 && score <= 100 )
//		{
//			System.out.println("A");
//		}
//		else if ( score > 80 && score <= 90 )
//		{
//			System.out.println("B");
//		}
//		else if ( score > 70 && score <= 80 )
//		{
//			System.out.println("C");
//		}
//		else if ( score > 60 && score <= 70 )
//		{
//			System.out.println("D");
//		}
//		else
//		{
//			System.out.println("E");
//		}
		
		
//		公司招聘前台，职位要求：限女性，20-30岁。
//
//		给定：
//
//		boolean female = true;  // true表示女生，false表示男生
//		int  age = 31;  // 年龄
//
//		写出判断逻辑。当不符号条件时，请给出提示原因。
		
		
//		boolean female = false;
//		
//		int age = 21;
//		
//		if ( female )
//		{
//			if ( age >= 20 && age <= 30 )
//			{
//				System.out.println("你符合要求");
//			}
//			else 
//			{
//				System.out.println("你不符合要求");
//			}
//			
//		}
//		else {
//			System.out.println("你不符合要求");
//		}
		
		
		
//		给定一个整数N ，判断它是否为质数
//
//		所谓“质数“，就是只能被1和它自己带除的数。
//		例如
//		2、3、5、7、11、13、17、19 ...
//
//		2只能被1，2整除
//		3只能被1，3整除
//		5只能被1，5整除
//
//		相反，6不是质数，因为6可以被1，2，3，6整除。
		
		
//		int n = 117;
//		
//		boolean isPrime = true;  //true:是质数，false：不是质数
//		
//		int sub = 0; //能被那个数整除
//		
//		for ( int i = 2; i < n; i++ )
//		{
//			if (n % i == 0 )
//			{
//				isPrime = false;  //判断是质数
//				
//				sub = i; //记录这个因子
//				
//				break;  //退出循环
//			}
//		}
//		
//		
//		if (isPrime)
//		{
//			System.out.println("是质数");
//		}
//		else 
//		{
//			System.out.println("不是质数，能被 " + sub + "整除");
//		}
		
		
//		打印下面的图形。(倒三角)
//
//		*****
//		****
//		***
//		**
//		*
		
//		for ( int i = 5; i > 0; i-- )
//		{
//			for (int k = 1; k <= i; k++ )
//			{
//				System.out.print("*");
//			}
//			System.out.println("\n");
//		}
		
		
		
//		打印出100~200之间，前10个能被7整除的数。 
//
//		注：能被7整除的数可能有很多个。这里只要求打印出前10个。
		
//		int a = 0;
//		
//		for (int i = 100; i <= 200; i ++ )
//		{
//			
//			if ( a < 10)
//			{
//				if ( i % 7 == 0 )
//				{
//					System.out.println(i);
//					
//					a++;
//				}
//				
//				
//			}
			
		}
		
		
	}
	
}
