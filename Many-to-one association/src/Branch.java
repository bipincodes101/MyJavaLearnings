//this is dependent object (depends on the student class).
public class Branch {
	//instance variables.
	private String branchName;
	private Integer branchId;
	//setters and getters.
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
}
