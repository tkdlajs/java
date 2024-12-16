package s10_1;

class Memo{
	private String name;
	private	String time;
	private	String content;
	
	public Memo(String name,String time,String content) {
		this.name = name;
		this.time = time;
		this.content = content;
	}
	public 	String getName() {
		return name;
	}
	
	public boolean isSameName(Memo otherMemo) {
		return this.name.equals(otherMemo.getName());
	}
	
	public void show() {
		System.out.println(name +", "+time +" "+ content);
	}
	
	public int length() {
		return content.length();
	}
}


public class week7 {
	public static void main(String[] args) {
		Memo a = new Memo("유송연", "10:10", "자바 과제 있음");
		Memo b = new Memo("유송연", "10:15", "시카고로 어학 연수가요!");
		Memo c = new Memo("유송연", "11:30", "사랑하는 사람이 생겼어요.");
		
		a.show();
		if(a.isSameName(b)) System.out.println("동일한 사람입니다.");
		else System.out.println("다른 사람입니다.");
		System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
	}
}
