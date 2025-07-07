import java.io.*;
class LightBulb
{
    String brand;
    char size;
    boolean isOn;

    LightBulb(String b, char s, boolean status)
    {
        brand = b;
        size = s;
        isOn = status;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", On: " + isOn);
    }

    public static void main(String[] args)
    {
        LightBulb bulb1 = new LightBulb("Philips", 'M', true);
        LightBulb bulb2 = new LightBulb("Syska", 'S', false);

        bulb1.display();
        bulb2.display();
    }
}

