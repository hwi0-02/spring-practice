package d0616_03;

public class GridPrint implements Print {

	PrintInfo info;
	
	public GridPrint(PrintInfo info) {
	    this.info = info;
	}
	public void print() {
		System.out.println("+--------------------------+");
		System.out.println("|학번|   이름  |  국어  |  영어  |  수학 |");
		System.out.println("+--------------------------+");
		System.out.println("|"+info.getId()+"|"+info.getName()+"|"+info.getSungjuk().getKor()+"|"+info.getSungjuk().getEng()+"|"+info.getSungjuk().getMath()+"|");
		System.out.println("+--------------------------+");
	}

	public void print(String id, String name, Sungjuk sungjuk) {
		System.out.println("+--------------------------+");
		System.out.println("|학번|   이름  |  국어  |  영어  |  수학 |");
		System.out.println("+--------------------------+");
		System.out.println("|"+info.getId()+"|"+info.getName()+"|"+sungjuk.getKor()+"|"+sungjuk.getEng()+"|"+sungjuk.getMath()+"|");
		System.out.println("+--------------------------+");
	}
	

}
