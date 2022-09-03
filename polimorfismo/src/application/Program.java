package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {
    public static void main(String[] args) throws Exception {

        List<Lesson> list = new ArrayList<Lesson>();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Quantas aulas tem o curso?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da " + i + "� aula:");
            System.out.println("Conte�do ou tarefa (c/t)?");
            String op = sc.next();

            if (op.toUpperCase().contentEquals("C")) {
                System.out.println("T�tulo:");
                sc.next();
                String videoTitle = sc.nextLine();
                System.out.println("URL do v�deo:");
                String videoUrl = sc.nextLine();
                System.out.println("Dura��o em segundos:");
                int videoDuration = sc.nextInt();
                list.add(new Video(videoTitle, videoUrl, videoDuration));
            }

            if (op.toUpperCase().contentEquals("T")) {
                System.out.println("T�tulo:");
                sc.next();
                String taskTitle = sc.nextLine();
                System.out.println("Descri��o: ");
                String taskDescription = sc.nextLine();
                System.out.println("Quantidade de quest�es: ");
                int taskDuration = sc.nextInt();
                list.add(new Task(taskTitle, taskDescription, taskDuration));
            }
        }
        int seconds = 0;
        for (Lesson l : list) {
            if (l.getClass() == Video.class) {
                seconds += l.duration(l.getTime());
            } else {
                seconds += l.duration(l.getTime());
            }
        }
        System.out.println("DURA��O TOTAL DO CURSO = " + seconds + " segundos");
    }
}
