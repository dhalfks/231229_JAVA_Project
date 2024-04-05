package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/* file에 저장되어있는 문자를 파일명과 확장자로 분리하여 출력
		 * 파일명 : 이것이자바다
		 * 확장자 : java 
		 * */
		
		String file = "이것이자바다.java";
		// "[.]", "\\."
		String fileName = file.substring(0, file.indexOf("."));
		System.out.println(fileName);
		String suffix = file.substring(file.indexOf(".")+1);
		System.out.println(suffix);
		
		//contains : 문자가 포함되어 있는지를 체크 boolean
		
		if(file.contains("java")) {
			System.out.println("자바파일입니다.");
		}

	}

}
