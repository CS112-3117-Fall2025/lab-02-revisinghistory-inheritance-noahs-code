public class HistoricalEvent {
    // CONSTANT VARIABLES
    public static final String INITIAL_DESCRIPTION = "Default starting historical description.";

    public static final Date INITIAL_EVENT_DAY = new Date();

    // INSTANCE VARIABLES
    private String description;

    private Date eventDay;

    /* CONSTRUCTORS */
    /* Default constructor sets object values to the default values.
    */
    public HistoricalEvent() {
        this(INITIAL_DESCRIPTION, INITIAL_EVENT_DAY);
    }
    
    /* Full constructor sets object values that are provided if valid. Otherwise, it will output an error message and exit the program.
     * @param description - the original historcal description.
     * @param eventDay - the date of a historical event
    */
    public HistoricalEvent(String description, Date eventDay) {
        if (!this.setAll(description, eventDay)) {
            System.out.println("Error: Bad data provided to the FULL constructor.");
            System.exit(0);
        }
    }
    
    /* Copy constructor creates a deep copy of HistoricalEvent. If it returns null, it will output an error message and exit the program.
     * @param original - the original HistoricalEvent that is being copied.
    */
    public HistoricalEvent(HistoricalEvent original) {
        if (original != null) {
            this.setAll(original.description, original.eventDay);
        } else {
            System.out.println("Error: Data provided to the COPY constructor is null.");
            System.exit(0);
        }
    }

    /* MUTATORS */
    /* Sets description of instance variables. No error checking except for null 
     * @param description - represents the description of a historical event. 
     * @return true if the setter worked, false if the parameter provided is null.
    */
    public boolean setDescription(String description) {
        if (description != null) {
            this.description = description;
            return true;
        } else {
            return false;
        }
    }
    
    /* Sets the event day. Does check for null and creates a deep copy because the variables being used are not a primitive type or String and need to be encapsulated.
     * @param eventDay Date represents a day of a historical event. Should not be changed.
     * @return true if the setter worked, false if the parameter provided is null.
    */
    public boolean setEventDay(Date eventDay) {
        if (eventDay != null) {
            this.eventDay = new Date(eventDay); //Creates deep copy to make a new and independent piece of data. For setters, deep copies should be encouraged to protect the data.
            return true;
        } else {
            return false;
        }
    }

    /* Sets all instance variables. Checks for null, but not other errors.
    * @param description - represents the description of a historical event. 
    * @param eventDay - Date represents a day of a historical event. Should not be changed.
    * @return true if the setter worked, false if the parameter provided is null.
    */
    public boolean setAll(String description, Date eventDay) {
        if (this.setDescription(description) && this.setEventDay(eventDay)) {
            this.setDescription(description);
            this.setEventDay(eventDay);
            return true;
        } else {
            return false;
        }
    }

    /* ACCESSORS */
    /* Accesses the data of the description instance variable. 
     * @return returns the description of the historical event
    */
    public String getDescription() {
        return this.description;
    }

    /* Accesses the data of the eventDay instance variable, AND makes a deep copy to preserve encapsulation/data. 
     * @return returns the date of the historical event
    */
    public Date getEventDay() {
        return new Date(this.eventDay); // Makes a deep copy of the eventDay
    }

    // ADDITIONAL REQUIRED METHODS
    @Override
    public String toString() {
        return "On " + this.eventDay + ": " + this.description;
    }
    
    @Override
    public boolean equals(Object other){
        if (other == null) {
            return false;
        } else if(!(other instanceof HistoricalEvent)) {
            return false;
        } else {
            HistoricalEvent otherEvent = (HistoricalEvent) other;
            return this.description.equals(otherEvent.description) && this.eventDay.equals(otherEvent.eventDay);
        }
    }
}
