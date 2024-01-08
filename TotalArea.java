public class TotalArea {
	public static void main(String[] args){
		Circle2[] circleArray;
		
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static Circle2[] createCircleArray(){
		Circle2[] circleArray = new Circle2[5];
		
		for(int i = 0; i<circleArray.length; i++){
			circleArray[i] = new Circle2(Math.random() * 100);
		}
		return circleArray
	}
	
	public static void printCircleArray (Circle2[] circleArray){
		
	}
}