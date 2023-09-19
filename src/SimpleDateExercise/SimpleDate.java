package SimpleDateExercise;

import java.util.Objects;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpleDate other = (SimpleDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
    	if(this.day == 30) {
    		this.day = 1;
    		if(this.month == 12) {
    			this.month = 1;
    			this.year++;
    			}
    		else if(this.month < 12) {
    			this.month++;
    		}
    		return;
    	}
    	
    	day++;
    	
    	
    }
    
    public void advance(int howMany) {
    	
    	for (int i = 0; i < howMany; i++) {
    		advance();
			
		}
    	
    	
    	    }
    
    public SimpleDate afterNumberOfDays(int days) {
    	SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
    	clone.advance(days);
    	return clone;
    }
}