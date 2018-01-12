using System;
using System.Collections.Generic;

namespace CBingo
{
	public partial class Bombo
	{
		private List<int> bolas = new List<int> ();
		public Bombo ()
		{
			for (int bolas = 0; bolas < 90; bolas++) {
				bolas.Add (bolas);
			}
		}

		private Random random = new Random ();
		public int SacarBola ()
		{
			int indexAleatorio = random.Next (bolas.Count);
			int bola = bolas [indexAleatorio];
			bolas.Remove (bola);
			return bola;
		}

		public bool QuedanBolas (){
			return bolas.Count > 80;
		}
	}
}

