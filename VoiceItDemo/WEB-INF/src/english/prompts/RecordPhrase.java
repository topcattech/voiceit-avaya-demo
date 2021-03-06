/**
 * Last generated by Orchestration Designer at: (timestamp generation disabled)
 */
package english.prompts;

public class RecordPhrase extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for RecordPhrase.
	 */
	public RecordPhrase() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("RecordPhrase");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,false);

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASESET,"record:record-0000",false));

		format = new com.avaya.sce.runtime.Format();
		format.add("time","250ms");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_FULL,"break", format));

		format = new com.avaya.sce.runtime.Format();
		format.add(com.avaya.sce.runtime.Format.FORMAT,com.avaya.sce.runtime.Format.FMT_TEXT);
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_TEXT,"phraseInfo:phrase", format));

	}
}
