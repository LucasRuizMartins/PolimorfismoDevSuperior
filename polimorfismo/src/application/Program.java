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
            System.out.println("Dados da " + i + "ª aula:");
            System.out.println("Conteúdo ou tarefa (c/t)?");
            String op = sc.next();

            if (op.toUpperCase().contentEquals("C")) {
                System.out.println("Título:");
                sc.next();
                String videoTitle = sc.nextLine();
                System.out.println("URL do vídeo:");
                String videoUrl = sc.nextLine();
                System.out.println("Duração em segundos:");
                int videoDuration = sc.nextInt();
                list.add(new Video(videoTitle, videoUrl, videoDuration));
            }

            if (op.toUpperCase().contentEquals("T")) {
                System.out.println("Título:");
                sc.next();
                String taskTitle = sc.nextLine();
                System.out.println("Descrição: ");
                String taskDescription = sc.nextLine();
                System.out.println("Quantidade de questões: ");
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
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + seconds + " segundos");
    }
}
