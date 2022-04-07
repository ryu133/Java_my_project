package ch17.Ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//1. �л���: ������ �л��� ���� �Է����� �� ArrayList�� capacity ũ�� ����
//2. ���� �Է�: �Է¹��� �л� ���� ���� ���� �Է�. ArrayList�� ��ü�� ����.(for������)
//3. ���� ����Ʈ: ArrayList�� student ��ü�� �����ͼ� score(����) ���
//4. �м�: �ְ�����, ������� ���
//5. ����: ���� Ż��

/*
 *1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
----------------------------------------------------
����> 
1
�л����� �Է��ϼ��� : 
5
�Է¿Ϸ�
----------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
----------------------------------------------------
����> 
2
�л��� ��ŭ ������ �Է��Ͻÿ� : 
1 �� �л� ������ �Է��ϼ��� : 60
�Է¿Ϸ�
2 �� �л� ������ �Է��ϼ��� : 70
�Է¿Ϸ�
3 �� �л� ������ �Է��ϼ��� : 80
�Է¿Ϸ�
4 �� �л� ������ �Է��ϼ��� : 90
�Է¿Ϸ�
5 �� �л� ������ �Է��ϼ��� : 100
�Է¿Ϸ�
----------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
----------------------------------------------------
����> 
3
60
70
80
90
100
----------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
----------------------------------------------------
����> 
4
�ְ����� : 100
������� : 80.0
----------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
----------------------------------------------------
����>
 
 */

class Student{
	int score; //��ü ���� & ������ & setter �� �� �Ҵ�
				//private �� ��� �����ڿ� setter�� �� �Ҵ� ����
	
	Student(){}
	
	Student(int score){
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class ScoreStudent_1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		
		
        boolean run = true;
        int studentNum = 0;
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt(); 

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                studentNum=scanner.nextInt();
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            	//(studentNum)�� �л� ������ �Է��ϼ��� : (����) 
            	//�Է¿Ϸ�
            	if (studentNum==0) {
					System.out.println("�л� ���� ���� �Է��ϼ���.");
				}else {
					for (int i = 0,j=1; i < studentNum; i++,j++) {
						Student student=new Student(); //���� �ʵ� score �� �� �Ҵ�
						System.out.print(j+"�� �л� ������ �Է��ϼ��� : ");
						student.score=scanner.nextInt();
						arr.add(i, student);
						System.out.println("�Է¿Ϸ�");
						try {
							arr.remove(j);
						} catch (Exception e) {}
					}
				}
					
            } else if(selectNo == 3) {
            	//���� ����Ʈ ���, ��ü ���� �� �ʵ��� �� ���� ��� or getter�� ���
        		for (int i = 0; i < studentNum; i++) {
//        			System.out.println(arr.get(i));
        			Student student=arr.get(i);
//        			System.out.println(student.score);
        			System.out.println(student.getScore());
				}
            	
             
            } else if(selectNo == 4) {
            	
            	if (studentNum==0) {
					System.out.println("�л� ���� ���� �Է��ϼ���.");
				}else {
					int maxScore=0;
					int sum=0;
            		for (int i = 0; i < arr.size(); i++) {
            			Student student=arr.get(i);
            			maxScore=(student.score>maxScore)?student.score:maxScore; //3�� ������
            			sum+=student.score;
//            			if (student.score>maxScore) {
//            				maxScore=student.score;
//            			} 
            		}	
            		System.out.println("�ְ����� : " + maxScore);
            		System.out.println("������� : " + (float) sum / studentNum);
				}
         
            } else if(selectNo == 5) {
            	
            	run=false;
            	//break;
              }
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}
}
