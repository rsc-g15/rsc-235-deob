package com.classic;

final class DataFileDecrypter
{
	private static DataFileVariables dataFileVariables = new DataFileVariables();

	private static void method52(final DataFileVariables class19)
	{
		byte i = class19.aByte1;
		int i_0_ = class19.anInt199;
		int i_1_ = class19.anInt211;
		int i_2_ = class19.anInt201;
		final int[] is = Class21.anIntArray46;
		int i_3_ = class19.anInt212;
		final byte[] is_4_ = class19.aByteArray10;
		int i_5_ = class19.anInt198;
		int i_6_ = class19.anInt205;
		final int i_7_ = i_6_;
		final int i_8_ = class19.anInt209 + 1;
		while_0_: for (;;)
		{
			if (i_0_ > 0)
			{
				for (;;)
				{
					if (i_6_ == 0)
					{
						break while_0_;
					}
					if (i_0_ == 1)
					{
						break;
					}
					is_4_[i_5_] = i;
					i_0_--;
					i_5_++;
					i_6_--;
				}
				if (i_6_ == 0)
				{
					i_0_ = 1;
					break;
				}
				is_4_[i_5_] = i;
				i_5_++;
				i_6_--;
			}
			for (;;)
			{
				if (i_1_ == i_8_)
				{
					i_0_ = 0;
					break while_0_;
				}
				i = (byte) i_2_;
				i_3_ = is[i_3_];
				final int i_9_ = (byte) i_3_;
				i_3_ >>= 8;
				i_1_++;
				if (i_9_ != i_2_)
				{
					i_2_ = i_9_;
					if (i_6_ == 0)
					{
						i_0_ = 1;
						break while_0_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
				}
				else
				{
					if (i_1_ != i_8_)
					{
						break;
					}
					if (i_6_ == 0)
					{
						i_0_ = 1;
						break while_0_;
					}
					is_4_[i_5_] = i;
					i_5_++;
					i_6_--;
				}
			}
			i_0_ = 2;
			i_3_ = is[i_3_];
			int i_10_ = (byte) i_3_;
			i_3_ >>= 8;
			if (++i_1_ != i_8_)
			{
				if (i_10_ != i_2_)
				{
					i_2_ = i_10_;
				}
				else
				{
					i_0_ = 3;
					i_3_ = is[i_3_];
					i_10_ = (byte) i_3_;
					i_3_ >>= 8;
					if (++i_1_ != i_8_)
					{
						if (i_10_ != i_2_)
						{
							i_2_ = i_10_;
						}
						else
						{
							i_3_ = is[i_3_];
							i_10_ = (byte) i_3_;
							i_3_ >>= 8;
							i_1_++;
							i_0_ = (i_10_ & 0xff) + 4;
							i_3_ = is[i_3_];
							i_2_ = (byte) i_3_;
							i_3_ >>= 8;
							i_1_++;
						}
					}
				}
			}
		}
		final int i_11_ = class19.anInt202;
		class19.anInt202 += i_7_ - i_6_;
		if (class19.anInt202 >= i_11_)
		{
			/* empty */
		}
		class19.aByte1 = i;
		class19.anInt199 = i_0_;
		class19.anInt211 = i_1_;
		class19.anInt201 = i_2_;
		Class21.anIntArray46 = is;
		class19.anInt212 = i_3_;
		class19.aByteArray10 = is_4_;
		class19.anInt198 = i_5_;
		class19.anInt205 = i_6_;
	}

	private static byte method53(final DataFileVariables dataFileVariables)
	{
		return (byte) method55(8, dataFileVariables);
	}

	private static byte method54(final DataFileVariables class19)
	{
		return (byte) method55(1, class19);
	}

	private static int method55(final int i, final DataFileVariables class19)
	{
		for (;;)
		{
			if (class19.anInt204 >= i)
			{
				final int i_12_ = ((class19.anInt206 >> (class19.anInt204 - i)) & ((1 << i) - 1));
				class19.anInt204 -= i;
				return i_12_;
			}
			class19.anInt206 = ((class19.anInt206 << 8) | ((class19.aByteArray8[class19.anInt210]) & 0xff));
			class19.anInt204 += 8;
			class19.anInt210++;
			class19.anInt197++;
			if (class19.anInt197 == 0)
			{
				/* empty */
			}
		}
	}

	private static void method56(final int[] is, final int[] is_13_, final int[] is_14_, final byte[] is_15_,
	        final int i, final int i_16_, final int i_17_)
	{
		int i_18_ = 0;
		for (int i_19_ = i; i_19_ <= i_16_; i_19_++)
		{
			for (int i_20_ = 0; i_20_ < i_17_; i_20_++)
			{
				if (i_19_ == is_15_[i_20_])
				{
					is_14_[i_18_] = i_20_;
					i_18_++;
				}
			}
		}
		for (int i_21_ = 0; i_21_ < 23; i_21_++)
		{
			is_13_[i_21_] = 0;
		}
		for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
		{
			is_13_[is_15_[i_22_] + 1]++;
		}
		for (int i_23_ = 1; i_23_ < 23; i_23_++)
		{
			is_13_[i_23_] += is_13_[i_23_ - 1];
		}
		for (int i_24_ = 0; i_24_ < 23; i_24_++)
		{
			is[i_24_] = 0;
		}
		int i_25_ = 0;
		for (int i_26_ = i; i_26_ <= i_16_; i_26_++)
		{
			i_25_ = (is_13_[i_26_ + 1] - is_13_[i_26_]) + i_25_;
			is[i_26_] = i_25_ - 1;
			i_25_ <<= 1;
		}
		for (int i_27_ = i + 1; i_27_ <= i_16_; i_27_++)
		{
			is_13_[i_27_] = ((is[i_27_ - 1] + 1) << 1) - is_13_[i_27_];
		}
	}

	private static void method57(final DataFileVariables dataFileVariables)
	{
		int i = 0;
		int[] is = null;
		int[] is_45_ = null;
		int[] is_46_ = null;
		dataFileVariables.anInt203 = 1;
		if (Class21.anIntArray46 == null)
		{
			Class21.anIntArray46 = new int[dataFileVariables.anInt203 * 100000];
		}
		boolean bool_47_ = true;
		while (bool_47_)
		{
			byte i_48_ = method53(dataFileVariables);
			if (i_48_ == 23)
			{
				break;
			}
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method53(dataFileVariables);
			i_48_ = method54(dataFileVariables);
			if (i_48_ == 0)
			{
				/* empty */
			}
			dataFileVariables.anInt200 = 0;
			int i_49_ = method53(dataFileVariables);
			dataFileVariables.anInt200 = (dataFileVariables.anInt200 << 8) | (i_49_ & 0xff);
			i_49_ = method53(dataFileVariables);
			dataFileVariables.anInt200 = (dataFileVariables.anInt200 << 8) | (i_49_ & 0xff);
			i_49_ = method53(dataFileVariables);
			dataFileVariables.anInt200 = (dataFileVariables.anInt200 << 8) | (i_49_ & 0xff);
			for (int i_50_ = 0; i_50_ < 16; i_50_++)
			{
				i_48_ = method54(dataFileVariables);
				if (i_48_ == 1)
				{
					dataFileVariables.aBoolArray6[i_50_] = true;
				}
				else
				{
					dataFileVariables.aBoolArray6[i_50_] = false;
				}
			}
			for (int i_51_ = 0; i_51_ < 256; i_51_++)
			{
				dataFileVariables.aBoolArray7[i_51_] = false;
			}
			for (int i_52_ = 0; i_52_ < 16; i_52_++)
			{
				if (dataFileVariables.aBoolArray6[i_52_])
				{
					for (int i_53_ = 0; i_53_ < 16; i_53_++)
					{
						i_48_ = method54(dataFileVariables);
						if (i_48_ == 1)
						{
							dataFileVariables.aBoolArray7[i_53_ + (i_52_ * 16)] = true;
						}
					}
				}
			}
			method59(dataFileVariables);
			final int i_54_ = dataFileVariables.anInt196 + 2;
			final int i_55_ = method55(3, dataFileVariables);
			final int i_56_ = method55(15, dataFileVariables);
			for (int i_57_ = 0; i_57_ < i_56_; i_57_++)
			{
				int i_58_ = 0;
				for (;;)
				{
					i_48_ = method54(dataFileVariables);
					if (i_48_ == 0)
					{
						break;
					}
					i_58_++;
				}
				dataFileVariables.aByteArray7[i_57_] = (byte) i_58_;
			}
			final byte[] is_59_ = new byte[6];
			for (byte i_60_ = 0; i_60_ < i_55_; i_60_++)
			{
				is_59_[i_60_] = i_60_;
			}
			for (int i_61_ = 0; i_61_ < i_56_; i_61_++)
			{
				byte i_62_ = dataFileVariables.aByteArray7[i_61_];
				final byte i_63_ = is_59_[i_62_];
				for (/**/; i_62_ > 0; i_62_--)
				{
					is_59_[i_62_] = is_59_[i_62_ - 1];
				}
				is_59_[0] = i_63_;
				dataFileVariables.aByteArray5[i_61_] = i_63_;
			}
			for (int i_64_ = 0; i_64_ < i_55_; i_64_++)
			{
				int i_65_ = method55(5, dataFileVariables);
				for (int i_66_ = 0; i_66_ < i_54_; i_66_++)
				{
					for (;;)
					{
						i_48_ = method54(dataFileVariables);
						if (i_48_ == 0)
						{
							break;
						}
						i_48_ = method54(dataFileVariables);
						if (i_48_ == 0)
						{
							i_65_++;
						}
						else
						{
							i_65_--;
						}
					}
					dataFileVariables.aByteArrayArray10[i_64_][i_66_] = (byte) i_65_;
				}
			}
			for (int i_67_ = 0; i_67_ < i_55_; i_67_++)
			{
				int i_68_ = 32;
				byte i_69_ = 0;
				for (int i_70_ = 0; i_70_ < i_54_; i_70_++)
				{
					if (dataFileVariables.aByteArrayArray10[i_67_][i_70_] > i_69_)
					{
						i_69_ = (dataFileVariables.aByteArrayArray10[i_67_][i_70_]);
					}
					if (dataFileVariables.aByteArrayArray10[i_67_][i_70_] < i_68_)
					{
						i_68_ = (dataFileVariables.aByteArrayArray10[i_67_][i_70_]);
					}
				}
				method56(dataFileVariables.anIntArrayArray8[i_67_], dataFileVariables.anIntArrayArray9[i_67_],
				        dataFileVariables.anIntArrayArray7[i_67_], dataFileVariables.aByteArrayArray10[i_67_], i_68_, i_69_, i_54_);
				dataFileVariables.anIntArray44[i_67_] = i_68_;
			}
			final int i_71_ = dataFileVariables.anInt196 + 1;
			int i_72_ = -1;
			int i_73_ = 0;
			for (int i_74_ = 0; i_74_ <= 255; i_74_++)
			{
				dataFileVariables.anIntArray43[i_74_] = 0;
			}
			int i_75_ = 4095;
			for (int i_76_ = 15; i_76_ >= 0; i_76_--)
			{
				for (int i_77_ = 15; i_77_ >= 0; i_77_--)
				{
					dataFileVariables.aByteArray6[i_75_] = (byte) (i_77_ + (i_76_ * 16));
					i_75_--;
				}
				dataFileVariables.anIntArray45[i_76_] = i_75_ + 1;
			}
			int i_78_ = 0;
			if (i_73_ == 0)
			{
				i_72_++;
				i_73_ = 50;
				final byte i_79_ = dataFileVariables.aByteArray5[i_72_];
				i = dataFileVariables.anIntArray44[i_79_];
				is = dataFileVariables.anIntArrayArray8[i_79_];
				is_46_ = dataFileVariables.anIntArrayArray7[i_79_];
				is_45_ = dataFileVariables.anIntArrayArray9[i_79_];
			}
			i_73_--;
			int i_80_ = i;
			int i_81_;
			int i_82_;
			for (i_82_ = method55(i_80_, dataFileVariables); i_82_ > is[i_80_]; i_82_ = (i_82_ << 1) | i_81_)
			{
				i_80_++;
				i_81_ = method54(dataFileVariables);
			}
			int i_83_ = is_46_[i_82_ - is_45_[i_80_]];
			while (i_83_ != i_71_)
			{
				if ((i_83_ == 0) || (i_83_ == 1))
				{
					int i_84_ = -1;
					int i_85_ = 1;
					do
					{
						if (i_83_ == 0)
						{
							i_84_ += i_85_ * 1;
						}
						else if (i_83_ == 1)
						{
							i_84_ += i_85_ * 2;
						}
						i_85_ *= 2;
						if (i_73_ == 0)
						{
							i_72_++;
							i_73_ = 50;
							final byte i_86_ = dataFileVariables.aByteArray5[i_72_];
							i = dataFileVariables.anIntArray44[i_86_];
							is = dataFileVariables.anIntArrayArray8[i_86_];
							is_46_ = dataFileVariables.anIntArrayArray7[i_86_];
							is_45_ = dataFileVariables.anIntArrayArray9[i_86_];
						}
						i_73_--;
						i_80_ = i;
						for (i_82_ = method55(i_80_, dataFileVariables); i_82_ > is[i_80_]; i_82_ = (i_82_ << 1) | i_81_)
						{
							i_80_++;
							i_81_ = method54(dataFileVariables);
						}
						i_83_ = is_46_[i_82_ - is_45_[i_80_]];
					}
					while ((i_83_ == 0) || (i_83_ == 1));
					i_84_++;
					i_49_ = (dataFileVariables.aByteArray9[(dataFileVariables.aByteArray6[dataFileVariables.anIntArray45[0]]) & 0xff]);
					dataFileVariables.anIntArray43[i_49_ & 0xff] += i_84_;
					for (/**/; i_84_ > 0; i_84_--)
					{
						Class21.anIntArray46[i_78_] = i_49_ & 0xff;
						i_78_++;
					}
				}
				else
				{
					int i_87_ = i_83_ - 1;
					if (i_87_ < 16)
					{
						final int i_88_ = dataFileVariables.anIntArray45[0];
						i_48_ = dataFileVariables.aByteArray6[i_88_ + i_87_];
						for (/**/; i_87_ > 3; i_87_ -= 4)
						{
							final int i_89_ = i_88_ + i_87_;
							dataFileVariables.aByteArray6[i_89_] = dataFileVariables.aByteArray6[i_89_ - 1];
							dataFileVariables.aByteArray6[i_89_ - 1] = dataFileVariables.aByteArray6[i_89_ - 2];
							dataFileVariables.aByteArray6[i_89_ - 2] = dataFileVariables.aByteArray6[i_89_ - 3];
							dataFileVariables.aByteArray6[i_89_ - 3] = dataFileVariables.aByteArray6[i_89_ - 4];
						}
						for (/**/; i_87_ > 0; i_87_--)
						{
							dataFileVariables.aByteArray6[i_88_ + i_87_] = (dataFileVariables.aByteArray6[(i_88_ + i_87_) - 1]);
						}
						dataFileVariables.aByteArray6[i_88_] = i_48_;
					}
					else
					{
						int i_90_ = i_87_ / 16;
						final int i_91_ = i_87_ % 16;
						int i_92_ = dataFileVariables.anIntArray45[i_90_] + i_91_;
						i_48_ = dataFileVariables.aByteArray6[i_92_];
						for (/**/; i_92_ > dataFileVariables.anIntArray45[i_90_]; i_92_--)
						{
							dataFileVariables.aByteArray6[i_92_] = dataFileVariables.aByteArray6[i_92_ - 1];
						}
						dataFileVariables.anIntArray45[i_90_]++;
						for (/**/; i_90_ > 0; i_90_--)
						{
							dataFileVariables.anIntArray45[i_90_]--;
							dataFileVariables.aByteArray6[dataFileVariables.anIntArray45[i_90_]] = (dataFileVariables.aByteArray6[((dataFileVariables.anIntArray45[i_90_
							        - 1]) + 16) - 1]);
						}
						dataFileVariables.anIntArray45[0]--;
						dataFileVariables.aByteArray6[(dataFileVariables.anIntArray45[0])] = i_48_;
						if (dataFileVariables.anIntArray45[0] == 0)
						{
							i_75_ = 4095;
							for (int i_93_ = 15; i_93_ >= 0; i_93_--)
							{
								for (int i_94_ = 15; i_94_ >= 0; i_94_--)
								{
									dataFileVariables.aByteArray6[i_75_] = (dataFileVariables.aByteArray6[(dataFileVariables.anIntArray45[i_93_])
									        + i_94_]);
									i_75_--;
								}
								dataFileVariables.anIntArray45[i_93_] = i_75_ + 1;
							}
						}
					}
					dataFileVariables.anIntArray43[(dataFileVariables.aByteArray9[i_48_ & 0xff] & 0xff)]++;
					Class21.anIntArray46[i_78_] = dataFileVariables.aByteArray9[i_48_ & 0xff] & 0xff;
					i_78_++;
					if (i_73_ == 0)
					{
						i_72_++;
						i_73_ = 50;
						final byte i_95_ = dataFileVariables.aByteArray5[i_72_];
						i = dataFileVariables.anIntArray44[i_95_];
						is = dataFileVariables.anIntArrayArray8[i_95_];
						is_46_ = dataFileVariables.anIntArrayArray7[i_95_];
						is_45_ = dataFileVariables.anIntArrayArray9[i_95_];
					}
					i_73_--;
					i_80_ = i;
					for (i_82_ = method55(i_80_, dataFileVariables); i_82_ > is[i_80_]; i_82_ = (i_82_ << 1) | i_81_)
					{
						i_80_++;
						i_81_ = method54(dataFileVariables);
					}
					i_83_ = is_46_[i_82_ - is_45_[i_80_]];
				}
			}
			dataFileVariables.anInt199 = 0;
			dataFileVariables.aByte1 = (byte) 0;
			dataFileVariables.anIntArray42[0] = 0;
			for (int i_96_ = 1; i_96_ <= 256; i_96_++)
			{
				dataFileVariables.anIntArray42[i_96_] = dataFileVariables.anIntArray43[i_96_ - 1];
			}
			for (int i_97_ = 1; i_97_ <= 256; i_97_++)
			{
				dataFileVariables.anIntArray42[i_97_] += dataFileVariables.anIntArray42[i_97_ - 1];
			}
			for (int i_98_ = 0; i_98_ < i_78_; i_98_++)
			{
				i_49_ = (byte) (Class21.anIntArray46[i_98_] & 0xff);
				Class21.anIntArray46[(dataFileVariables.anIntArray42[i_49_ & 0xff])] |= i_98_ << 8;
				dataFileVariables.anIntArray42[i_49_ & 0xff]++;
			}
			dataFileVariables.anInt212 = Class21.anIntArray46[dataFileVariables.anInt200] >> 8;
			dataFileVariables.anInt211 = 0;
			dataFileVariables.anInt212 = Class21.anIntArray46[dataFileVariables.anInt212];
			dataFileVariables.anInt201 = (byte) (dataFileVariables.anInt212 & 0xff);
			dataFileVariables.anInt212 >>= 8;
			dataFileVariables.anInt211++;
			dataFileVariables.anInt209 = i_78_;
			method52(dataFileVariables);
			if (((dataFileVariables.anInt209 + 1) == dataFileVariables.anInt211) && (dataFileVariables.anInt199 == 0))
			{
				bool_47_ = true;
			}
			else
			{
				bool_47_ = false;
			}
		}
	}

	static int unpackData(final byte[] maybe_decompressedData, int decmp_len, final byte[] compressedData, final int compressedDataOffset)
	{
		synchronized (dataFileVariables)
		{
			dataFileVariables.aByteArray8 = compressedData;
			dataFileVariables.anInt210 = compressedDataOffset;
			dataFileVariables.aByteArray10 = maybe_decompressedData;
			dataFileVariables.anInt198 = 0;
			dataFileVariables.anInt205 = decmp_len;
			dataFileVariables.anInt204 = 0;
			dataFileVariables.anInt206 = 0;
			dataFileVariables.anInt197 = 0;
			dataFileVariables.anInt202 = 0;
			method57(dataFileVariables);
			decmp_len -= dataFileVariables.anInt205;
			dataFileVariables.aByteArray8 = null;
			dataFileVariables.aByteArray10 = null;
			final int i_102_ = decmp_len;
			return i_102_;
		}
	}

	private static void method59(final DataFileVariables class19)
	{
		class19.anInt196 = 0;
		for (int i = 0; i < 256; i++)
		{
			if (class19.aBoolArray7[i])
			{
				class19.aByteArray9[class19.anInt196] = (byte) i;
				class19.anInt196++;
			}
		}
	}
}
