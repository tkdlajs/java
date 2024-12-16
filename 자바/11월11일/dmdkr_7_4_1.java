package sam;

import java.util.HashMap;
import java.util.Scanner;

public class dmdkr_7_4_1 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("고추장",3000);
		menu.put("만두",500);
		menu.put("새우깡",1500);
		menu.put("콜라",600);
		menu.put("참치캔",2000);
		menu.put("치약",1000);
		menu.put("연어",2500);
		menu.put("삼겹살",2500);
		
		System.out.println("쇼핑 비용을 계산해드립니다. 구입 가능 물건과 가격은 다음과 같습니다.");
		
		while (true) {
        	System.out.print("물건과 갯수를 입력하세요>>");
            int totalCost = 0; 
            String input = sr.nextLine().trim(); 
            if (input.equals("그만")) { 
                break;
            }

            if (input.isEmpty()) {
                System.out.println("입력이 비어 있습니다. 다시 입력해주세요.");
                continue;
            }

            String[] items = input.split(" ");
            for (int i = 0; i < items.length; i += 2) {
                String menuName = items[i]; 

                if (!menu.containsKey(menuName)) {
                    System.out.println(menuName + "은(는) 없는 상품입니다. 다시 입력해주세요.");
                    continue;
                }

                int menuCount = 0;
                try {
                    if (i + 1 < items.length) { 
                        menuCount = Integer.parseInt(items[i + 1]);
                    } else {
                        System.out.println("수량 정보가 누락되었습니다. 다시 입력해주세요.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("수량은 숫자로 입력해야 합니다. 다시 입력해주세요.");
                    continue;
                }

                totalCost += menu.get(menuName) * menuCount;
            }

            System.out.println("이번 입력에 대한 총 비용은 " + totalCost + "원입니다.");
        }

        System.out.println("프로그램이 종료되었습니다.");
        sr.close();
    }
	}

