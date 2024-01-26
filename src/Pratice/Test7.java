package Pratice;

interface Home {
	public void add();

	public void delete();

}

class Room implements Home {

	@Override
	public void add() {
		System.out.println("Adding element");

	}

	@Override
	public void delete() {
		System.out.println("deleting elemenet");

	}

	public void mul() {
		System.out.println("multily elemt");
	}

}

public class Test7 {
	public static void main(String[] args) {
		Home hobj = new Room(); // parent
		hobj.add();
		hobj.delete();

		Room robj = new Room();
		robj.add();
		robj.delete();

	}

}
