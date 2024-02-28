/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import Repository.StudentRepository;
import java.util.ArrayList;

public class StudentInfoManager {
    StudentRepository program;
    ArrayList<Student> lt;

    public StudentInfoManager() {
        program = new StudentRepository();
        lt = new ArrayList<>();
    }

    public void run() {
        System.out.println("\nCollection Sort Program");
        program.display(lt);
    }
}