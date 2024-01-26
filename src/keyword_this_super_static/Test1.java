package keyword_this_super_static;

class Student {
	private String sid;
	private String sname;
	private String saddr;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

}

public class Test1 {
	public static void main(String[] args) {
		Student std = new Student();
		std.setSid("111");
		std.setSname("Pratiksha");
		std.setSaddr("Hyd");

		System.out.println("Student details");
		System.out.println("---------------------------");
		System.out.println("Student Id " + std.getSid());
		System.out.println("Student Name " + std.getSname());
		System.out.println("Student Address :" + std.getSaddr());
	}
}
