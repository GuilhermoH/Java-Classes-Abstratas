package src.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstracts.entities.Circle;
import abstracts.entities.Rectangle;
import abstracts.entities.Shape;
import abstracts.enums.Colors;

public class AbstractMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Shape>list=new ArrayList<>();
		System.out.println("How many figures do you wanna add?");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Shape N-" + i);
			System.out.println("Rectangle or Circle? (r/c)");
			char c = sc.next().charAt(0);
			System.out.println("Color? BLUE/BLACK OR RED");
			Colors color = Colors.valueOf(sc.next());
			if (c == 'r') {
				System.out.println("RECTANGLE SELECTED");
				System.out.print("ENTER WIDTH:");
				double width=sc.nextDouble();
				System.out.println("ENTER HEIGHT:");
				double height=sc.nextDouble();
				Shape rectangle = new Rectangle(color, width, height);
				list.add(rectangle);
				}
			else {
				System.out.println("CIRCLE SELECTED");
				System.out.println("ENTER RADIUS DATA:");
				double radius=sc.nextDouble();
				Shape circle=new Circle(color, radius);
				list.add(circle);
				
			}
		}
		System.out.println("RESULTS:");
		for(Shape l:list) {
			System.out.println("AREA: "+l.area1()
			);
		}

	}

}
