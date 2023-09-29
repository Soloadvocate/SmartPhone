package third_case;
import java.util.Scanner;
public class SmartPhone
{
    public class contacts
    {
        Scanner sc = new Scanner(System.in);
        int number[];
        String name;
        public void call()
        {
            System.out.println("Введите имя контакта");
            name = sc.next();
            System.out.println("Вы позвонили "+name );
        }
    }

    public class camera
    {
        Scanner sc = new Scanner(System.in);
        public boolean openCamera = false;
        public int numbercamera;
        public int numberphoto;
        int viborphoto;
        public void openCamera()
        {
            openCamera = true;
            System.out.println("Основная камера - 1; фронтальная - 2");
            numbercamera = sc.nextInt();
            if(numbercamera == 1)
            {
                System.out.println("Включена основная камера");
            }
            else
                System.out.println("Включены фронтальная камера");
        }
        public void takePhoto()
        {
            if(openCamera == true)
            {
                numberphoto += 1;
                System.out.println("Вы сделали снимок");
            }
        }
        public void seePhoto()
        {
            System.out.println("Введите номер фотографии от 0 до "+numberphoto);
            viborphoto = sc.nextInt();
            if(viborphoto>0&&viborphoto<=numberphoto)
            {
                System.out.println("Фотография");
            }
            else
                System.out.println("Такой фотографии не найдено");
        }
    }
}