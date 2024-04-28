//many-to -one association
public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch branch=new Branch();
		branch.setBranchId(100);
		branch.setBranchName("kanpur");
		Student s1=new Student();
		s1.setBranch(branch);
		s1.setName("bipin");
		s1.setStudentId(1);
		
		Student s2=new Student();
		s2.setBranch(branch);
		s2.setName("aditya");
		s2.setStudentId(2);
		
		Student s3=new Student();
		s3.setBranch(branch);
		s3.setName("prince");
		s3.setStudentId(3);
		
		System.out.println("details of studetn 1");
		System.out.println(s1.getName());
		System.out.println(s1.getStudentId());
		System.out.println(s1.getBranch().getBranchName());
		System.out.println(s1.getBranch().getBranchId());
		System.out.println("=============================");
		System.out.println(s2.getName());
		System.out.println(s2.getStudentId());
		System.out.println(s2.getBranch().getBranchName());
		System.out.println(s2.getBranch().getBranchId());
		System.out.println("=============================");
		System.out.println(s3.getName());
		System.out.println(s3.getStudentId());
		System.out.println(s3.getBranch().getBranchName());
		System.out.println(s3.getBranch().getBranchId());
	}

}
