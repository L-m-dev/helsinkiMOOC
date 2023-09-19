package Apartment;

 
	public class Apartment {
	    private int rooms;
	    private int squares;
	    private int pricePerSquare;
	    
	    private int squaresForeign;
	    private int price;
	    
	
		public Apartment(int rooms, int squares, int pricePerSquare) {
	        this.rooms = rooms;
	        this.squares = squares;
	        this.pricePerSquare = pricePerSquare;
	        this.price = squares*pricePerSquare;
	    }
	    
	    //largerThan(Apartment), priceDifference(Apartment), moreExpensiveThan(Apartment)
	     
	    public boolean largerThan(Apartment compared) {
	    	squaresForeign = compared.getSquares();
	    	if(this.squares>squaresForeign) {
	    		return true;
	    	}
	    	return false;
	
	    }

	    public int priceDifference(Apartment compared) {
	    	int priceDiff = Math.abs(this.price - compared.getPrice());
	    	return priceDiff;
	    }
	
	    
	    public boolean moreExpensiveThan(Apartment compared) {
	    	
	    	if(this.price > compared.getPrice()) {
	    	return true;
	    	}
	    return false;
	    }
	    
	    
	    
	    
	    public int getRooms() {
			return rooms;
		}


		public void setRooms(int rooms) {
			this.rooms = rooms;
		}

		public int getSquares() {
			return squares;
		}

		public void setSquares(int squares) {
			this.squares = squares;
		}

		public int getPricePerSquare() {
			return pricePerSquare;
		}


		public void setPricePerSquare(int pricePerSquare) {
			this.pricePerSquare = pricePerSquare;
		}

		@Override
		public String toString() {
			return "Apartment [rooms=" + rooms + ", squares=" + squares + ", pricePerSquare=" + pricePerSquare + "]";
		}
	    
	    public int getPrice() {
				return price;
			}

			public void setPrice(int price) {
				this.price = price;
			}

	    
	    
	    
	    
	    @Override
	    public boolean equals(Object compare) {
	    	if(!(this == compare)) {
	    		return false;
	    	}
	    	
	    	if(!(compare instanceof Apartment)) {
	    		return false;
	    	}
	    	
	    Apartment apCompare = (Apartment) compare;
	    
	    if(this.price == apCompare.price)
	    	return true;
	    return false;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
 
