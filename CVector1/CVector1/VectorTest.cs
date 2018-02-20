﻿using NUnit.Framework;
using System;

namespace CVector1
{
	[TestFixture]
	public class VectorTest
	{
		[Test]
		public void Sort ()	{
			int [] v = {12,9,15,7,13};
			Vector.Sort(v);
			CollectionAssert.AreEqual (new int[]{ 7, 9, 12, 13, 15 }, v);
			v = new int[] {7,9,12,13,15};
			Vector.Sort(v);
			CollectionAssert.AreEqual (new int[]{ 7, 9, 12, 13, 15 }, v);
		}
		[Test]
		public void indexMin(){
			int[] v = { 12, 9, 15, 7, 13 };
			int indexMin = Vector.IndexMin (v, 4);
			Assert.AreEqual (4, indexMin);
		}
	}
}
