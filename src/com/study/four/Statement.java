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
		
		int i = 1;
		
		while ( i <= 10 )
		{
			
			System.out.print( i + " " );
			
			i ++;
			
		}
		
		
	}
	
}
