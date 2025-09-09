/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
		tulsaRevised, tulsaCitation);

		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();
		

		/* MY CHOSEN EVENT: */

		String myEventInitialDescription = "The Indian Removal Act was passed, under Andrew Jackson, the seventh President of the United States. Jackson is sometimes revered as a 'defender of democracy' for being one of the earlier Presidents of the United States, but has also come under large amounts of scrutiny towards his treatment of Native Americans during his presidency. Under his administration, the Indian Removal Act was passed, with it resulting in the 'Trail of Tears' and the deaths of approximately 13 to 16 thousand Native Americans.";
		Date myEventDay = new Date(5, 28, 1830);
		HistoricalEvent myEvent = new HistoricalEvent(myEventInitialDescription, myEventDay);
		
		System.out.println("====================================================");
		System.out.println("MY HISTORICAL EVENT:");
		System.out.println("====================================================");
		System.out.println(myEvent);

		String myEventDescriptionRevised = "However, the story behind the Indian Removal Act goes much deeper than what is commonly known. In a letter to congress dated on the 6th of December, 1830, Jackson admits himself that he had pursued the passing of this act for nearly thirty years, indicating that it had been set in motion for quite some time. Jackson himself had even fought in multiple conflicts with Native American tribes, such as the First Seminole War. Indicated by language used in his letter, describing the native peoples as 'savages', this push for the act was likely from his very own racist sentiments. Jackson promised to provide troops and the orders for the relocation of the natives, pushing for the passing of this act quite heavily himself. In only about six short months, the act was passed, and the relocation of Native tribes was initiated, with over 60,000 native people being displaced, and over 13,000 dying on the trip as well.",
		myEventCitation = "https://www.archives.gov/milestone-documents/jacksons-message-to-congress-on-indian-removal";
		RevisedHistoricalEvent myEventRevised = new RevisedHistoricalEvent(myEventInitialDescription, myEventDay,
		myEventDescriptionRevised, myEventCitation);

		
		System.out.println("\n====================================================");
		System.out.println("THE REVISED HISTORICAL EVENT:");
		System.out.println("====================================================");
		myEventRevised.teach();
	}
}