/* This class will add on to the HistoricalEvent class to add extra data and to correct historical information. */
//By having 'extends HistoricalEvent', it grants us access to everything inside of HistoricalEvent
public class RevisedHistoricalEvent extends HistoricalEvent{
    /* DEFAULT VARIABLES */
    public static final String DEFAULT_REVISED_DESCRIPTION = "The revised version of the historical event description.";
    public static final String DEFAULT_CITATION = "The resource or citation goes here.";
    
    /* INSTANCE VARIABLES */
    private String revisedDescription;
    private String citation;

    /* CONSTRUCTORS */
    /* Default constructor sets object values to the default values.
    */
    public RevisedHistoricalEvent() {
        this(HistoricalEvent.INITIAL_DESCRIPTION, HistoricalEvent.INITIAL_EVENT_DAY, DEFAULT_REVISED_DESCRIPTION, DEFAULT_CITATION);
    }
    
    /* Full constructor sets object values that are provided if valid. Otherwise, it will output an error message and exit the program.
    * @param description - the original historcal description.
    * @param eventDay - the date of a historical event
    * @param revisedDescription - represents the REVISED description of a historical event. 
    * @param citation - represents the citation for the REVISED description of a historical event. 
    */
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
    }
    
    /* Copy constructor creates a deep copy of RevisedHistoricalEvent. If it returns null, it will output an error message and exit the program.
     * @param original - the original RevisedHistoricalEvent that is being copied.
    */
    public RevisedHistoricalEvent(RevisedHistoricalEvent original) {
        if (original != null) {
            this.setAll(original.getDescription(), original.getEventDay(), original.revisedDescription, original.citation);
        } else {
            System.out.println("Error: Data provided to the COPY constructor is null.");
            System.exit(0);
        }
    }

    /* MUTATORS */
    /* Sets the revised description of instance variables. No error checking except for null 
    * @param revisedDescription - represents the REVISED description of a historical event. 
    * @return true if the setter worked, false if the parameter provided is null.
    */
    public boolean setRevisedDescription(String revisedDescription) {
        if (revisedDescription != null) {
            this.revisedDescription = revisedDescription;
            return true;
        } else {
            return false;
        }
    }
    
    /* Sets the citation instance variable. No error checking except for null 
    * @param citation - represents the citation for the REVISED description of a historical event. 
    * @return true if the setter worked, false if the parameter provided is null.
    */
    public boolean setCitation(String citation) {
        if (citation != null) {
            this.citation = citation;
            return true;
        } else {
            return false;
        }
    }

    /* Sets all instance variables if the parameters provided are all valid. Checks for null, but not other errors.
    * @param description - represents the description of a historical event. 
    * @param eventDay - Date represents a day of a historical event. Should not be changed.
    * @param revisedDescription - represents the REVISED description of a historical event. 
    * @param citation - represents the citation for the REVISED description of a historical event. 
    * @return true if the setter worked, false if the parameter provided is null.
    */
    public boolean setAll(String description, Date eventDay, String revisedDescription, String citation) {
        if (!super.setAll(revisedDescription, eventDay)) {
            this.setRevisedDescription(revisedDescription);
            this.setCitation(citation);
            return true;
        } else {
            return false;
        }
    }

    /* ACCESSORS */
    /* Accesses the data of the revisedDescription instance variable. 
    * @return returns the REVISED description of the historical event
    */
    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    /* Accesses the data of the citation instance variable. 
    * @return returns the citation link
    */
    public String getCitation(){
        return this.citation;
    }

/* OTHER REQUIRED METHODS */
    @Override
    public String toString() {
        /*return "The following \"history\" was told for many years: \n\n" +
                super.toString() +
                "\n\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n" +
                this.revisedDescription +
                "\n\nCitation/Source used: "
                + this.citation;*/
        return super.toString() + "\nRevised Historical Event:" + this.revisedDescription + "\nCitation/Source used: "+ this.citation; // Simpler version since we now have teach()
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass()) {
            return false;
        } else {
            RevisedHistoricalEvent otherEvent = (RevisedHistoricalEvent) other;
            return super.equals(other) &&
                    this.revisedDescription.equals(otherEvent.revisedDescription) &&
                    this.citation.equals(otherEvent.citation);
        }
    }
        
/* Outputs to the console structured to educate people about past historical events, showing the version they may have been taught versus the true, revised history. */
    public void teach() {
        System.out.println("The following \"history\" was told for many years: \n\n" + super.toString());
        System.out.println("\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is the revised history:\n" +
        this.revisedDescription);
        System.out.println("\nCitation/Source used: " + this.citation);
    }


}
