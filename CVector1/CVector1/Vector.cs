using System;

namespace CVector1
{
	public class Vector
	{
		public static void Sort (int[] v){
			Array.Sort<int> (v);
		}
		/// <summary>
		/// Indexs the minimum.
		/// </summary>
		/// <returns>The minimum.</returns>
		/// <param name="v">V.</param>
		/// <param name="initialIndex">Initial index.</param>
		/// 
		public static int IndexMin (int [] v, int initialIndex) {
			if (initialIndex >= v.Length) {
				throw new IndexOutOfRangeException ();
			}
			int indexMin = initialIndex;
			for (int index = initialIndex + 1; index < v.Length; index++) {
				if (v [index] < v [initialIndex]) {
					indexMin = index;
				}
			}
			return IndexMin;
		}
		/// <summary>
		/// Swap the specified v, index and otherIndex.
		/// </summary>
		/// <param name="v">V.</param>
		/// <param name="index">Index.</param>
		/// <param name="otherIndex">Other index.</param>
		public static void Swap(int [] v,int index, int otherIndex){
		}
	}
}

