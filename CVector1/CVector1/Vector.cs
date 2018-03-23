using System;

namespace CVector1
{
	public class Vector
	{
		public static void Sort (int[] v){
			int n = v.Length;
			for (int positionIndex = 0; positionIndex < n - 1; positionIndex++) {
				int indexMin = positionIndex;
				for (int index = indexMin + 1; index < n; index++) {
					if (v [index] < v [indexMin]) {
						IndexMin = index;
					}
					int aux = v [positionIndex];
					v [positionIndex] = v [indexMin];
					v [indexMin] = aux;
				}
			}
		}
		/// <summary>
		/// Indexs the minimum.
		/// </summary>
		/// <returns>The minimum.</returns>
		/// <param name="v">V.</param>
		/// <param name="initialIndex">Initial index.</param>
		/// Si esta fuera de rango lanzará un IndexOutOfRangeException
		public static int IndexMin(int [] v, int initialIndex) {
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
			int aux = v [index];
			v [index] = v [otherIndex];
			v [otherIndex] = aux;
		}
	}
}

