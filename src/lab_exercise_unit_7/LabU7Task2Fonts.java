package lab_exercise_unit_7;



import java.awt.*;
public class LabU7Task2Fonts
{
public static void main (String arg [ ])
{
Font f;
f = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12);
String font = f. getName( );
int style = f.getStyle ( );
int size = f.getSize ( );
boolean bold = f.isBold ( );
boolean normal = f.isPlain ( );
boolean italic = f.isItalic ( );
System.out.println ("Font : "+ font + "  Style:"+ style
		+ "  Size: "+ size + "  Bold : "+bold + "  Italic:  "+italic);
}
}