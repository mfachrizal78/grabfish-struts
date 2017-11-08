
public class Test { 

	
	public Test() {
		
	}
	abstract class Char {
		public int dim = 0;
		public static final char CHAR = '*';

		public int getDim() {
			return dim;
		}

		public void setDim(int dim) {
			this.dim = dim;
		}
		
		public Char(int dim) {
			this.dim = dim;			
		}
		
		public abstract String getString(int line);

		public void print() {
			for(int i = 0; i < dim; i++) {
				System.out.println(getString(i));
			}			
		}
	}
	

	class CharX extends Char {

		public CharX(int dim) {
			super(dim); 
		}

		@Override
		public String getString(int i) {	
			String str = "";
			for(int j = 0; j < dim; j++) {
				if(i == j || i + j == dim - 1 || i + j == dim - 1 ) {
					str += CHAR;
				} else {
					str += " ";
				}
			}
			return str;
		}
	}
	
	class CharY extends Char {

		public CharY(int dim) {
			super(dim); 
		}

		@Override
		public String getString(int i) {	
			String str = "";
			for(int j = 0; j < dim; j++) {
		        if(((i == j || i + j == dim - 1) && i < dim / 2 + 1) || (i > dim / 2 && j == dim / 2)) {
					str += CHAR;
				} else {
					str += " ";
				}
			}
			return str;
		}
	}
	
	class CharZ extends Char {

		public CharZ(int dim) {
			super(dim); 
		}

		@Override
		public String getString(int i) {	
			String str = "";
			for(int j = 0; j < dim; j++) {
		        if(i == 0 || i + j == dim - 1 || i == dim - 1) {
					str += CHAR;
				} else {
					str += " ";
				}
			}
			return str;
		}
	}	
	
   public static void main(String[] args) {
	   
	   int dim = 5;
	   
//	   Char x = new Test().new CharX(dim);
//	   Char y = new Test().new CharY(dim);
	   Char z = new Test().new CharZ(dim);
// 
//	   for(int i = 0; i < dim; i++) {
//		   System.out.print(x.getString(i) + "\t" + y.getString(i) + "\t" + z.getString(i));
//		   System.out.println();
//	   }
//	   System.out.println();
//	   
//	   x.print();
//	   System.out.println();
//	   y.print();
	   System.out.println();
	   z.print();
   }
	
   public static void mains(String[] args) {
      int dim = 5;
      for(int i = 0; i < dim; i++) {
         for(int j = 0; j < dim; j++) {
            if(i == j || i + j == dim - 1) {
               System.out.print("*");
        } else {
           System.out.print(" ");
        }
     }
     System.out.println();
  }
  System.out.println();
  for(int i = 0; i < dim; i++) {
     for(int j = 0; j < dim; j++) {
        if(((i == j || i + j == dim - 1) && i < dim / 2 + 1) || (i > dim / 2 && j == dim / 2)) {
           System.out.print("*");
        } else {
           System.out.print(" ");
        }
     }
     System.out.println();
  }
  System.out.println();
  for(int i = 0; i < dim; i++) {
     for(int j = 0; j < dim; j++) {
        if(i == 0 || i + j == dim - 1 || i == dim - 1) {
           System.out.print("*");
        } else {
           System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
