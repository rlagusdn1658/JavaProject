

    
    
   public class Box {
    	int width,lenght,height;
    	int volume;
    	
    	Box(int w, int l, int h){
    		width = w;
    		lenght = l;
    		height = h;
    		volume = w*l*h;
    		
    	}
    
    	Box whosLargest(Box box1,Box box2){
    		if(box1.volume > box2.volume)
    			return box1;
    		else
    			return box2;
    	}
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box obj1 = new Box(10,20,50); 
        Box obj2 = new Box(10,30,30);
        
        Box largest = obj1.whosLargest(obj1, obj2);
        System.out.println("("  + largest.width + "," + largest.lenght+"," + largest.height + ")");
	}

}
