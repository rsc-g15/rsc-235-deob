package com.classic;

final class Class1
{
	static Class39 aClass39_1 = null;
	static int anInt1 = 0;
	static int[][] anIntArrayArray1;
	static int[] anIntArray1;

	static int method1(final int i, final int i_0_, final byte[] is, final int i_1_)
	{
		int result = -1;
		for (int index = i_1_; i_0_ > index; index++)
		{
			result = (result >>> 8) ^ Class44.anIntArray114[(is[index] ^ result) & 0xff];
		}
		result ^= i;
		return result;
	}

	static void method2(final Class27 class27, final Class27 class27_4_)
	{
		if (class27.aClass27_1 != null)
		{
			class27.method178();
		}

		class27.aClass27_2 = class27_4_;
		class27.aClass27_1 = class27_4_.aClass27_1;
		class27.aClass27_1.aClass27_2 = class27;
		class27.aClass27_2.aClass27_1 = class27;
	}
}
