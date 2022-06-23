package areaOfRectangle;
public class Rectangle {

		private int length;				
		private int breadth;
		
		
		public int getL() {
			return length;
		}
		public void setL(int length) {

			if(length<10 || length>50)
			{
				
				System.out.println("Please enter length between 10 & 50");
			}
			
			this.length=length;
		}
		
		
		
		public int getB() {
			return breadth;
		}
		public void setB(int breadth) {
			
			if(breadth< 5|| breadth> 20)
			{
			
				System.out.println("Please enter breadth between 5 & 20");
			}
			
			this.breadth = breadth;
		}
		
		
		
		public Rectangle(int length, int breadth) {
			setL(length);
			setB(breadth);
			
		}
		
		
		@Override
		public String toString() {
			return "Rectangle [Length= " + getL() + ", Breadth= " + getB() + "]" + "[AREA = " + getL()*getB() +"]";
			
		}
		
		
		
		
		
		
	}

