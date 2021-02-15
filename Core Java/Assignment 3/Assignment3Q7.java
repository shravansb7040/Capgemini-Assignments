package JavaFiles;

import java.util.ArrayList;

class ParkingSlot {
    private String ownerName;
    private int carNumber;
    private int token;
	private int level;
    private int section;
    private int slot;
    
    public ParkingSlot() {}
    
    public ParkingSlot(String ownerName, int carNumber, int token, int level, int section, int slot) {
		super();
		this.ownerName = ownerName;
		this.carNumber = carNumber;
		this.token = token;
		this.level = level;
		this.section = section;
		this.slot = slot;
	}
	
    public String getOwnerName() 
	{
		return ownerName;
	}
	
	public int getCarNumber() 
	{
		return carNumber;
	}
	
	public int getToken() 
	{
		return token;
	}
	
	public int getLevel() 
	{
		return level;
	}
	
	public int getSection() 
	{
		return section;
	}
	
	public int getSlot() 
	{
		return slot;
	}
	
	public void setOwnerName(String ownerName) 
	{
		this.ownerName = ownerName;
	}
	
	public void setCarNumber(int carNumber) 
	{
		this.carNumber = carNumber;
	}
	
	public void setToken(int token) 
	{
		this.token = token;
	}
	
	public void setLevel(int level) 
	{
		this.level = level;
	}
	
	public void setSection(int section) 
	{
		this.section = section;
	}
	
	public void setSlot(int slot) 
	{
		this.slot = slot;
	}
}

class Parked_CarOwenerList {
    int levels = 3;
    int sections = 4;
    int slots = 20;

    ArrayList<ParkingSlot> parkingSlot= new ArrayList<>();
    
    public void add_new_car(Assignment3Q7 obj){
    	for(int i=1;i<4;i++) {
    		for(int j=1;j<5;j++) {
    			for(int k=1;k<21;k++) {
    				ParkingSlot all = null;
    				if(parkingSlot.size()==0) {
				    	all= new ParkingSlot(obj.getName(),obj.getCarNo(),(i*100+j*10+k),i,j,k);
				    }
    				else {
    					for(ParkingSlot c:parkingSlot) {
    	    				if(c.getLevel()!=(i) || c.getSection()!=j || c.getSlot()!=k) {
    	    					all= new ParkingSlot(obj.getName(),obj.getCarNo(),(i*100+j*10+k),i,j,k);
    					    
    	    				}
    	    			}
    				}
    				parkingSlot.add(all);
    			}
    		}
    	}			
    }
    
    public void remove_car(String name,int carNo){
    	parkingSlot.removeIf(c -> c.getOwnerName().equals(name) && c.getCarNumber()==(carNo)); 
    }
    
    public String get_parked_car_location(int token){
   
    		String str="";
        	for(ParkingSlot slot:parkingSlot) {
    	    	if(slot.getToken()==token) {
    		    	str="level : "+slot.getLevel()+",section : "+slot.getSection()+",slot: "+slot.getSlot()+".";
    		    }
        	}
    	return str;
    }
}

public class Assignment3Q7 {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;
    
    public Assignment3Q7(){}

    public String getName() 
    {
    	return name;
    }
	
    public String getCarModel() 
    {
    	return carModel;
    }
	
    public int getCarNo() 
    {
    	return carNo;
    }
	
    public int getMobileNumber() 
    {
    	return mobileNumber;
    }
	
    public String getAddress() 
    {
    	return address;
    }
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Assignment3Q7(String name, String carModel, int carNo, int mobileNumber, String address) {
		super();
		this.name = name;
		this.carModel = carModel;
		this.carNo = carNo;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public static void main(String[] args) {
    	
    	Assignment3Q7 answer= new Assignment3Q7();
    }
}
