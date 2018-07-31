
public class Avg {
      String name;
      String title = "ÃÑÁ¡";
      String Average = "Æò±Õ";
      int avg,tot;
      
      public String average(int kor ,int eng, int math)
      {
    	  avg = (kor+eng+math)/3;
    	  tot = (kor+eng+math);
    	  return name+Average+avg+title+tot;
    	  
      }
      }
