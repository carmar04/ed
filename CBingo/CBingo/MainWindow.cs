using System;
using Gtk;
using System.Collections.Generic;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
		List<Button> buttons = new List<Button> ();

		Table table = new Table (9, 10, true);
		for(int index=0;index<90;index++){
			Button button = new Button ();
			button.Label = (index + 1).ToString();
			button.Visible = true;
			uint row = (uint)(index / 10);
			uint column = (uint)(index % 10);
			table.Attach (button, column, column + 1, row, row + 1);
			buttons.Add (button);
		}
//		for (uint row = 0; row < 9; row++) {
//			for (uint column = 0; column < 10; column++) {
//				int index = (int)(row * 10 + column);
//				Button button = new Button ();
//				button.Label = (index + 1).ToString ();
//				button.Visible = true;
//				table.Attach (button, column, column + 1, row, row + 1);
//			}
//		}	
		table.Visible = true;
		vBoxMain.Add (table);

		buttonAdelante.Clicked += delegate {
			int bola = 27; //TODO debe de ser aleatoria
			int index = bola -1;
			buttons[index].


		};
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
