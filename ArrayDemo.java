// name this file: ArrayDemo.java 
class ArrayDemo {
	public static void main (String args[]){
		int i;
		int[] eye;
		eye = new int[16];
			eye[0]= 11; eye[1]= 12; eye[2]= 45; 
			eye[3]= 16; eye[4]= 22; eye[5]= 56; 
			eye[6]= 8; eye[7]= 19; eye[8]= 32; 
			eye[9]= 15; eye[10]= 18; eye[11]= 76; 
			eye[12]= 25; eye[13]= 10; eye[14]= 94; 
			eye[15]= 77; 
 
			for (i = 0; i < 16; i++){
				System.out.print(eye[i]);
				System.out.print("  ");
			}
	}//end public
}//end class
