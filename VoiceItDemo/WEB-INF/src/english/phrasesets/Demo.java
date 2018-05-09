package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: (timestamp generation disabled)
 */
public class Demo extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(30);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: Greeting_Return_Caller
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Greeting_Return_Caller", "Greeting_Return_Caller.wav", "You have called Voice Authentication. Your phone number has been recognized."); 

		// phrase: Greeting_New_Caller
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Greeting_New_Caller", "Greeting_New_Caller.wav", "Welcome to the Voice Authentication system. You are a new user, you will now be enrolled."); 

		// phrase: General_Error
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "General_Error", "General_Error.wav", "An unhandled error occurred. Goodbye."); 

		// phrase: Enroll_Return_Caller
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Enroll_Return_Caller", "Enroll_Return_Caller.wav", "You have not completed enrollment. You will be asked to say a phrase up to 3 times, then you will be able to log in with that phrase."); 

		// phrase: Enroll
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Enroll", "Enroll.wav", "Please say the following phrase to enroll."); 

		// phrase: Passphrase
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Passphrase", "Passphrase.wav", "Never forget tomorrow is a new day."); 

		// phrase: Authenticate
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Authenticate", "Authenticate.wav", "Please say the following phrase to authenticate."); 

		// phrase: Enroll_Complete
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Enroll_Complete", "Enroll_Complete.wav", "Thank you, recording recieved. You are now enrolled. You can log in."); 

		// phrase: Enroll_Success
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Enroll_Success", "Enroll_Success.wav", "Thank you, recording recieved. You will now be asked to record your phrase again."); 

		// phrase: Enroll_Failed
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Enroll_Failed", "Enroll_Failed.wav", "Sorry, your recording did not stick. Please try again."); 

		// phrase: Authentication_Failed
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Authentication_Failed", "Authentication_Failed.wav", "Your authentication did not pass. Please try again."); 

		// phrase: Authentication_API_Error
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Authentication_API_Error", "Authentication_API_Error.wav", "API Error. Your authentication did not pass. Please try again."); 

		// phrase: Menu_Post_Authentication
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Menu_Post_Authentication", "Menu_Post_Authentication.wav", "Press 1 to clear your enrollment information and re-enroll. Press 2 to remove your phone number from the system."); 

		// phrase: Clear_Enrollments_Success
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Clear_Enrollments_Success", "Clear_Enrollments_Success.wav", "Your enrollment information has been cleared from the system. You will now be asked to say a phrase 3 times, then you will be able to log in with that phrase."); 

		// phrase: Delete_Account_Success
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Delete_Account_Success", "Delete_Account_Success.wav", "Your account has been successfully removed from the system. Goodbye."); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(Demo.PHRASE_MAP, phraseName));
	}
}
