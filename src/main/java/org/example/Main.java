package org.example;
import java.util.Scanner;
import third_case.SmartPhone;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SmartPhone smartPhone = new SmartPhone();
        SmartPhone.contacts contacts = smartPhone.new contacts();
        SmartPhone.camera camera = smartPhone.new camera();
        System.out.println("1 - Открыть камеру; 2 - позвонить");
        int numberVibor = sc.nextInt();
        if (numberVibor == 1) {
            camera.openCamera();
            System.out.println("Сделать фото?");
            String numbervibortwo = sc.next();
            if(numbervibortwo.contains("Да"))
            {
                camera.takePhoto();
                camera.seePhoto();
            }
            else
                System.out.println("Вы вышли из камеры");
        }
        else
            contacts.call();
    }
}