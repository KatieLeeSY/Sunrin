package java20170822;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** ���α׷��� ���� **");
		System.out.print("�Է��ϼ���: ");
		String inputS = sc.nextLine();
		
		StringBuffer inputSB = new StringBuffer(inputS);
		
		while(true) {
			System.out.print("���: ");
			String command = sc.nextLine();
			int size = command.length();		//	command ����
			int beforeStart = 0, beforeEnd = 0;		//	���� �� ������ġ����, ���� �� ������ġ��
			String replacement = "";		// ���� �� ����
			
			/*
			String array[] = command.split("!");
			if(command == "�׸�")	 {
				System.out.println("��");//	����ó��(�׸�)
				break;
			}
			else if(command.indexOf("!") == 0){
				System.out.println("�߸��� ���");
			}
			//love!LOVE
			else if(!inputS.contains(array[0])){
				System.out.println("ã�� �� �����ϴ�.");
			}
			else {
				int index = inputSB.indexOf(array[0]);
				inputSB.replace(index, index+array[0].length(), array[1]);
				System.out.println(inputSB);
			}
			*/
			
			int op = 0, errorCheck = 0;	//	'!' ã��
			
			for(int i=0;i<size;i++) {	//	'!' ã����
				if(command.charAt(i)=='!') {
					op = i;
					errorCheck++;
				}
			}
			
			if(op==0 || errorCheck!=1 || op==size) {	//	����ó��(!������, �����ʰ�), !��, ��!
				System.out.println("�߸��� ����Դϴ�!");
				continue;
			} else {
				for(int i=0;i<op;i++) {			//	���� �� ���� ��ġ ã��
					if(inputSB.charAt(i)==command.charAt(0))	//	���� �� ������ġ����
						beforeStart = i;
					else if(inputSB.charAt(i)==command.charAt(op-1))	//	���� �� ������ġ��
						beforeEnd = i;
					}
				
				if(beforeEnd == 0) {		//	����ó��(ã�� �� ����)
					System.out.println("ã�� �� �����ϴ�!");
					continue;
				}
				
				for(int i=op+1;i<size;i++) {	//	���� �� ����
					replacement += command.charAt(i);
				}
				
				inputSB.replace(beforeStart, beforeEnd+1, replacement);
				System.out.println(inputSB);
			}
			
		}	//	end of while

	}	//	end of main

}
