public class equalityPrinter {

	public static void main(String[] args) {
		equalityPrinterMethods e = new equalityPrinterMethods();
		e.printEqual(1, 1, 1);
		e.printEqual(1, 1, 2);
		e.printEqual(-1, -1, -1);
		e.printEqual(1, 2, 3);
	}
}
