
public class CharPrint {

	abstract class Char {
		public int dim = 0;
		public final static String CHAR = "*";
		
		public int getDim() {
			return dim;
		}
		public void setDim(int dim) {
			this.dim = dim;
		}
		
		public abstract String getString(int line);
		
		public void print() {
			for(int i = 0; i < dim; i++) {
				System.out.println(getString(i));
			}			
		}
	}
	
	public class CharX extends Char {

		@Override
		public String getString(int line) {
			String s = "";
			for (int i=0; i<dim; i++) {
				if(line == i ) {
					s += CHAR;					
				} else {
					s += " ";
				}
			}
			return s;
		}
		
	}
	
	public class CharZ extends Char {

		@Override
		public String getString(int i) {
			String s = "";
			for (int j=0; j<dim; j++) {
				if(i > dim / 2 && j == dim / 2) {
					s += CHAR;					
				} else {
					s += " ";
				}
			}
			return s;
		}
		
	}	

	public class CharY extends Char {

		@Override
		public String getString(int i) {
			String s = "";
			for (int j=0; j<dim; j++) {
				if ((i <= dim /2 && (i==j || i+j==dim-1)) || (i > dim /2 && j==dim/2)) {
					s += CHAR;					
				} else {
					s += " ";
				}
			}
			return s;
		}
		
	}	
	
	public static void main(String[] args) {
//		CharX x = new CharPrint().new CharX();
//		x.setDim(5);
//		x.print();
		
//		CharZ z = new CharPrint().new CharZ();
//		z.setDim(5);
//		z.print();
		
		CharY y = new CharPrint().new CharY();
		y.setDim(5);
		y.print();
	}
}
