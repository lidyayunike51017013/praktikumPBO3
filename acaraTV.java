/**
 * @(#)acaraTV.java
 *
 *
 * @author 
 * @version 1.00 2019/10/10
 */

class acaraTV {
	String StasiunTV;
	String Acara;


    public String getStasiunTV() {
    	return StasiunTV;
    }
    
    public void setStasiunTV (String getStasiunTV)
   		 { this.StasiunTV=StasiunTV;
    }
    
    public String getAcara(){
    	return Acara;
    }
    
    public void setAcara (String Acara){
    	this.Acara=Acara;
    }
    
    public void cetak (){
    	System.out.println ("Acara "+ Acara + "Stasiun TV" + StasiunTV);
    }
}