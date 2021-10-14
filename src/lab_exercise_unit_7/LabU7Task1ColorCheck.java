package lab_exercise_unit_7;



import java.awt. *;
public class LabU7Task1ColorCheck 
{
public static void main(String arg [ ])
{
Color rgb, hsb;
rgb = new Color (193,255,183);
int red, green, blue;
red = rgb.getRed ( );
green = rgb.getGreen ( );
blue = rgb.getBlue ( );
float x [ ] = {0.0f,0.0f,0.0f};
rgb.RGBtoHSB(red, green, blue, x);
System.out.println ("RGB ----");
System.out.println ("Red : "+red+" Green: "+green+" Blue : "+blue);
System.out.println ("Hue : "+x[0]+ " Saturation: "+x[1] +" Brightness: "+x[2]);
int r = rgb.HSBtoRGB (0.75f,0.2375f,0.95f);
System.out.println ("HSB -----");
System.out.println("Red, Blue and Green Combination: "+ r);
}
}
