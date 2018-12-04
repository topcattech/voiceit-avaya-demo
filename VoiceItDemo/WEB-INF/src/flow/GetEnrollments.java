package flow;

/**
 * This servlet is used to forward the request to the entry point of a
 * project callflow (subflow).
 * Last generated by Orchestration Designer at: (timestamp generation disabled)
 */
public class GetEnrollments extends com.avaya.sce.runtime.Subflow {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2018-NOV-07  09:35:03 PM
	 */
	public GetEnrollments() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the name of the subflow that is being invoked.  This name is used for
	 * determining the URL mapping for the the entry point of the subflow..
	 *
	 * @return the name of the subflow
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	protected String getSubflowName() {
		return("getenrollments");
	}
	/**
	 * Returns the name of the mapping of sub flow exit points to the URL mappings
	 * of the servlets to return back to in the calling flow.
	 *
	 * @return map of sub flow exit points to servlets in the calling flow.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	protected java.util.Map<String,String> getExitPoints() {
		java.util.Map<String, String> exitPoints;
		exitPoints = new java.util.HashMap<String, String>();
		exitPoints.put("getenrollments-Default", "VerifyCaller");
		exitPoints.put("getenrollments-Incomplete", "CreateEnrollment");
		exitPoints.put("getenrollments-Fail", "InformTryAgain");
		exitPoints.put("getenrollments-Error", "InformAPIError");
		return exitPoints;
	}
}
