import java.awt.*;
import java.awt.Graphics.*;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

class AwtComponent extends Frame
{
    AwtComponent()
    {
        super("Form");
        setSize(1000,1000);
        setVisible(true);

        GridLayout g1 = new GridLayout(10, 2,10,10);
        setLayout(g1);

        Label nameLabel = new Label("Name : ");
        TextField nametextField = new TextField(20);
        add(nameLabel);
        add(nametextField);

        Label nameLabe2 = new Label("E-mail Id : ");
        TextField nametextField2 = new TextField(20);
        add(nameLabe2);
        add(nametextField2);

        Label nameLabe3 = new Label("Gender : ");
        CheckboxGroup c1 = new CheckboxGroup();
        Panel p1 = new Panel();
        Checkbox c2 = new Checkbox("Male",c1,true);
        Checkbox c3 = new Checkbox("Female",c1,false);
        add(nameLabe3);
        p1.add(c2);
        p1.add(c3);
        add(p1);

        Label nameLabel4 = new Label("Address : ");
        TextArea t1 = new TextArea();
        add(nameLabel4);
        add(t1);

        Label nameLabel5 = new Label("Hobbies : ");
        Panel p2 = new Panel();
        Checkbox c5 = new Checkbox("Travelling");
        Checkbox c6 = new Checkbox("Reading");
        add(nameLabel5);
        p2.add(c5);
        p2.add(c6);
        add(p2);

        Label nameLabel6 = new Label("Education : ");
        List l1 = new List();
        l1.add("Engineering");
        l1.add("Pharmacy");
        l1.add("BCA");
        add(nameLabel6);
        add(l1);

        Label nameLabel7 = new Label("Benefits Of Education : ");
        add(nameLabel7);
        //Scrollbar s1 = new Scrollbar();
        Scrollbar s1 = new Scrollbar(Scrollbar.HORIZONTAL,0,5,0,100);
        add(s1);

        Label nameLabel8 = new Label("Country : ");
        add(nameLabel8);
        Choice c10 = new Choice();
        c10.add("Select");
        c10.add("INDIA");
        c10.add("USA");
        c10.add("JAPAN");
        c10.add("CANADA");
        add(c10);

        Label nameLabel9 = new Label("Canvas Demo : ");
        add(nameLabel9);
        Canvas o1 = new Canvas();
        add(o1);
        o1.setBackground(Color.PINK);
    
        Label nameLabel10 = new Label(" ");
        add(nameLabel10);
        Button b10 = new Button("Submit");
        add(b10);
    }
}


class main
{
    public static void main(String[] args)
    {
        AwtComponent a1 = new AwtComponent();
    }
}