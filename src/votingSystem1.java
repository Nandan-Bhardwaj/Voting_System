import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.Calendar;
class votingSystem1 extends JFrame implements ActionListener
{

    JFrame f,f1;
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jbb;
    JPasswordField pf;
    JMenu j1,j2,j3;
    JMenuBar jm;
    char chh[] = {'D','d','h','a','w','a','l',' ',' ',' ',' '};
    JLabel label1,label2,label3,label4,label5,label6,labelb;   
    String na[] = new String[6];
    JTextField jt[] = new JTextField[6];
    JButton b1,b2,b3,b4,b5,b6,b7,b8,bcno,bcna,sa,ent,bcpl,tool,bcr,log,clo,cha;
    int v1=0,v2=0,v3=0,v4=0,v5=0,v6=0,n=0,ni=0,count=2,cl=0,checkc=0,checkt=0,check=0,open=0;
    int xSize=0,ySize=0;
    votingSystem1()
    {
        f= new JFrame(" Voting ");
        b1 = new JButton(" CANDIDATE 1 ");
        b2 = new JButton(" CANDIDATE 2 ");
        b3 = new JButton(" CANDIDATE 3 ");
        b4 = new JButton(" CANDIDATE 4 ");
        b5 = new JButton(" CANDIDATE 5 ");
        b6 = new JButton(" CANDIDATE 6 ");
        b7 = new JButton(" NILL ");
        j1 = new JMenu(" Edit");
        j2 = new JMenu(" Tool ");
        jm =  new JMenuBar();
        
        sa = new JButton(" SAVE ");
        clo = new JButton("CLOSE");

        b8 = new JButton();
        BufferedImage img1 = null;
        BufferedImage img2 = null;
        BufferedImage img3 = null;
        BufferedImage img4 = null;
        BufferedImage img5 = null;
        BufferedImage img6 = null;
        BufferedImage imgb = null;
        try
        {
            img1 = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/candidate.png"));
            img2 = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/candidate.png"));
            img3 = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/candidate.png"));
            img4 = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/candidate.png"));
            img5 = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/candidate.png"));
            img6 = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/candidate.png"));
            imgb = ImageIO.read(new File("C:/Users/Nanda/Pictures/Camera Roll/bg.jpg"));

        }
        catch(IOException e)
        {
        }
        Toolkit tk = Toolkit.getDefaultToolkit();
        xSize = ((int)tk.getScreenSize().getWidth());
        ySize = ((int)tk.getScreenSize().getHeight());
        f.setSize(xSize,ySize);

        Image dimg1 = img1.getScaledInstance(250,220,Image.SCALE_SMOOTH);
        Image dimg2 = img2.getScaledInstance(250,220,Image.SCALE_SMOOTH);
        Image dimg3 = img3.getScaledInstance(250,220,Image.SCALE_SMOOTH);
        Image dimg4 = img4.getScaledInstance(250,220,Image.SCALE_SMOOTH);
        Image dimg5 = img5.getScaledInstance(250,220,Image.SCALE_SMOOTH);
        Image dimg6 = img6.getScaledInstance(250,220,Image.SCALE_SMOOTH);
        Image dimgb = imgb.getScaledInstance(f.getWidth(),f.getHeight(),Image.SCALE_SMOOTH);

        int divWid = xSize/4;
        int divHei = ySize/3;

        JPanel panel = (JPanel)f.getContentPane();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        labelb = new JLabel();

        cb1 = new JCheckBox(" Candidate 1 ");
        cb2 = new JCheckBox(" Candidate 2 ");
        cb3 = new JCheckBox(" Candidate 3 ");
        cb4 = new JCheckBox(" Candidate 4 ");
        cb5 = new JCheckBox(" Candidate 5 ");
        cb6 = new JCheckBox(" Candidate 6 ");
        cb7 = new JCheckBox("  ");

        label1.setIcon(new ImageIcon(dimg1));
        label2.setIcon(new ImageIcon(dimg2));
        label3.setIcon(new ImageIcon(dimg3));
        label4.setIcon(new ImageIcon(dimg4));
        label5.setIcon(new ImageIcon(dimg5));
        label6.setIcon(new ImageIcon(dimg6));
        labelb.setIcon(new ImageIcon(dimgb));
        editMenu();
        toolMenu();
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        jm.add(j1);
        jm.add(j2);
        j1.addMouseListener(new MouseListener()
            {
                @Override
                public void mouseClicked(MouseEvent me)
                {

                }


                @Override
                public void mouseExited(MouseEvent me)
                {

                }


                @Override
                public void mousePressed(MouseEvent me)
                {
                    j1.setEnabled(true);
                    check=1;

                    if(checkc==0)
                    {
                        lock();

                    }

                }


                @Override
                public void mouseEntered(MouseEvent me)
                {

                }


                @Override
                public void mouseReleased(MouseEvent me)
                {
                    j2.setEnabled(false);
                }
            });
        j2.addMouseListener(new MouseListener()
            {
                @Override
                public void mouseClicked(MouseEvent me)
                {

                }


                @Override
                public void mouseExited(MouseEvent me)
                {

                }


                @Override
                public void mousePressed(MouseEvent me)
                {
                    j2.setEnabled(true);
                    check=2;

                    if(checkt==0)
                    {
                        lock();

                    }

                }


                @Override
                public void mouseEntered(MouseEvent me)
                {

                }


                @Override
                public void mouseReleased(MouseEvent me)
                {
                    j1.setEnabled(false);
                }
            });
        f.setJMenuBar(jm);
        f.add(b8);

        int remWid = divWid-250;
        int remHei = divHei-245;
        labelb.setBounds(0,0,f.getWidth(),f.getHeight());
        label1.setBounds(remWid,remHei,250,220);
        label2.setBounds(xSize-divWid,remHei,250,220);
        label3.setBounds(remWid,divHei-remHei,250,220);
        label4.setBounds(xSize-divWid,divHei-remHei,250,220);
        label5.setBounds(remWid,(2*divHei)-(3*remHei),250,220);
        label6.setBounds(xSize-divWid,(2*divHei)-(3*remHei),250,220);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(labelb);
        panel.setLayout(null);

        b1.setBounds(remWid+50,divHei-(6*remHei),150,40);
        b2.setBounds(xSize-divWid+50,divHei-(6*remHei),150,40);
        b3.setBounds(remWid+50,(2*divHei)-(8*remHei),150,40);
        b4.setBounds(xSize-divWid+50,(2*divHei)-(8*remHei),150,40);
        b5.setBounds(remWid+50,(3*divHei)-(10*remHei),150,40);
        b6.setBounds(xSize-divWid+50,(3*divHei)-(10*remHei),150,40);
        b7.setBounds((2*divWid)-remWid,350,150,40);

        f.setVisible(true);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        try
        {
            prev();
        }
        catch(IOException sdf)
        {
        }

        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        f.setResizable(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        clo.addActionListener(this);

        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.red);
        f.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent we )
                {
                    cl=1;
                    lock();
                    cl=0;
                }
            });
    }
    public void prev()throws IOException
    {
        FileReader fr = new FileReader("Result.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(new File("Result.txt"));
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();
        v4 = sc.nextInt();
        v5 = sc.nextInt();
        v6 = sc.nextInt();
        ni  = sc.nextInt();
        sc.close();
        br.close();
        fr.close();
        
    }

    public void disable()
    {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
    }
    public void passInput()throws IOException
    {

        FileOutputStream fout = new FileOutputStream("Pass.dat");
        DataOutputStream ffout = new DataOutputStream(fout);
        for(int i=0;i<10;i++)
        {
            ffout.writeChar(chh[i]);
        }
        fout.close();
        ffout.close();
    }
    public void passOutput()throws IOException
    {
        FileInputStream fit = new FileInputStream("Pass.dat");
        DataInputStream ffit = new DataInputStream(fit);
        for(int i=0;i<10;i++)
        {
            chh[i] = ffit.readChar();
        }
        ffit.close();
        fit.close();
    }
    public void enable()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
    }


    public void colour()
    {
        b1.setBackground(Color.red);
        b2.setBackground(Color.red);
        b3.setBackground(Color.red);
        b4.setBackground(Color.red);
        b5.setBackground(Color.red);
        b6.setBackground(Color.red);
        b7.setBackground(Color.red);
    }


    public void discolour()
    {
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.cyan);
    }


    public void lock()
    {
        if(open==1)
        f1.dispose();
        f1 = new JFrame("LOG IN ");
        JLabel lab = new JLabel();
        if(check==3)
        lab.setText(" Enter Current Password :");
        else
        lab.setText("Password :");
        if(cl==1)
        lab.setText("Password :");
        pf = new JPasswordField(20);
        log = new JButton("LOGIN");
        
        open=1;

        f1.add(lab);
        f1.add(pf);
        if(cl==0)
            f1.add(log);
        if(cl==1)
            f1.add(clo);
        f1.setLocation((f.getWidth()/2)-150,(f.getHeight()/2)-50);
        f1.setLayout(new FlowLayout());
        f1.setResizable(false);
        log.addActionListener(this);
        f1.setVisible(true);
        f1.pack();
    }

    public void editMenu()
    {
        JMenuItem item;
        item = new JMenuItem("Number Of Candidates ");
        item.addActionListener(this);
        j1.add(item);
        item = new JMenuItem("Name Of Candidates ");
        item.addActionListener(this);
        j1.add(item);

        item = new JMenuItem("Picture Of Candidates "); 
        item.addActionListener(this);
        j1.add(item);

    }


    public void toolMenu()
    {
        JMenuItem item;
        item = new JMenuItem("Reset Password");
        item.addActionListener(this);
        j2.add(item);

        item = new JMenuItem("Reset Votes");
        item.addActionListener(this);
        j2.add(item);

        item = new JMenuItem("Result ");
        item.addActionListener(this);
        j2.add(item);
        
        item = new JMenuItem("Add Result to file ");
        item.addActionListener(this);
        j2.add(item);
        
        item = new JMenuItem("Display File ");
        item.addActionListener(this);
        j2.add(item);
        item = new JMenuItem("Clear File ");
        item.addActionListener(this);
        j2.add(item);

        item = new JMenuItem("Lock Menus ");
        item.addActionListener(this);
        j2.add(item);

    }


    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        String s = e.getActionCommand();
        if(o==clo)
        {
            char ch[] = pf.getPassword();
            f1.dispose();
            int len = ch.length;
            char c[] = new char[10];
            for(int a=0;a<len;a++)
            c[a] =ch[a];
            for(int a=len;a<10;a++)
            c[a] =' ';
            try
            {
                passOutput();
            }
            catch(IOException efd)
            {
                }
            if(ch[0]==chh[0]&&c[1]==chh[1]&&c[2]==chh[2]&&c[3]==chh[3]&&c[4]==chh[4]&&c[5]==chh[5]&&c[6]==chh[6]&&c[7]==chh[7]&&c[8]==chh[8]&&c[9]==chh[9])
            {
                f.dispose();
                open=0;
            }
            else
            {
                JOptionPane pane = new JOptionPane("Wrong Password", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
                JDialog dialog = pane.createDialog(" ERROR ");
                dialog.setVisible(true);

            }
        }
        if(o==log)
        {
            char ch[] = pf.getPassword();
            int len = ch.length;
            char c[] = new char[10];
            for(int a=0;a<len;a++)
            c[a] =ch[a];
            for(int a=len;a<10;a++)
            c[a] =' ';
            try
            {
                passOutput();
            }
            catch(IOException efd)
            {
            }
            f1.dispose();
            if(c[0]==chh[0]&&c[1]==chh[1]&&c[2]==chh[2]&&c[3]==chh[3]&&c[4]==chh[4]&&c[5]==chh[5]&&c[6]==chh[6]&&c[7]==chh[7]&&c[8]==chh[8]&&c[9]==chh[9])
            {
                if(check==1)
                    checkc=1;
                if(check==2)
                    checkt=1;
                if(check==3)
                    resetP();
                if(check==4)
                {
                    try
                    {
                        reset();
                    }
                    catch(IOException sdf)
                    {
                    }
                }
                if(check==5)
                {
                    try
                    {
                        FClear();
                    }
                    catch(IOException sdf)
                    {
                    }
                }
            }
            else
            {

                JOptionPane pane = new JOptionPane("Wrong Password", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
                JDialog dialog = pane.createDialog(" ERROR ");
                dialog.setVisible(true);
                check=0;
            }
        }

        if(s.equals("Number Of Candidates "))
        {
            f1 = new JFrame(" No. Of Candidates ");

            cb7.setVisible(false);
            cb1.setBounds(30,30,150,40);
            cb2.setBounds(30,80,150,40);
            cb3.setBounds(30,130,150,40);
            cb4.setBounds(30,180,150,40);
            cb5.setBounds(30,230,150,40);
            cb6.setBounds(30,280,150,40);
            sa.setBounds(130,350,80,40);
            sa.addActionListener(this);
            f1.add(cb1);
            f1.add(cb2);
            f1.add(cb3);
            f1.add(cb4);
            f1.add(cb5);
            f1.add(cb6);

            f1.add(sa);
            f1.add(cb7);
            f1.setVisible(true);
            f1.setBounds((xSize/2)-125,(ySize/2)-250,250,500);
            f1.setResizable(false);
        }
        if(o==sa)
        {
            f1.dispose();
            n=0;
            if(cb1.isSelected())
            {
                b1.setVisible(true);
                label1.setVisible(true);
                n++;
            }
            else
            {
                b1.setVisible(false);
                label1.setVisible(false);
            }
            if(cb2.isSelected())
            {
                b2.setVisible(true);
                label2.setVisible(true);
                n++;
            }
            else
            {
                b2.setVisible(false);
                label2.setVisible(false);
            }
            if(cb3.isSelected())
            {
                b3.setVisible(true);
                label3.setVisible(true);
                n++;
            }
            else
            {
                b3.setVisible(false);
                label3.setVisible(false);
            }
            if(cb4.isSelected())
            {
                b4.setVisible(true);
                label4.setVisible(true);
                n++;
            }
            else
            {
                b4.setVisible(false);
                label4.setVisible(false);
            }
            if(cb5.isSelected())
            {
                b5.setVisible(true);
                label5.setVisible(true);
                n++;
            }
            else
            {
                b5.setVisible(false);
                label5.setVisible(false);
            }
            if(cb6.isSelected())
            {
                b6.setVisible(true);
                label6.setVisible(true);
                n++;
            }
            else
            {
                b6.setVisible(false);
                label6.setVisible(false);
            }

            b7.setVisible(true);
        }
        if(s.equals("Name Of Candidates "))
        {
            f1 = new JFrame(" Name ");
            JLabel ln[] = new JLabel[6];

            int j=30;
            ln[0] = new JLabel(" Enter Name Of Candidate 1 :");
            ln[1] = new JLabel(" Enter Name Of Candidate 2 :");
            ln[2] = new JLabel(" Enter Name Of Candidate 3 :");
            ln[3] = new JLabel(" Enter Name Of Candidate 4 :");
            ln[4] = new JLabel(" Enter Name Of Candidate 5 :");
            ln[5] = new JLabel(" Enter Name Of Candidate 6 :");

            jt[0] = new JTextField(20);
            jt[1] = new JTextField(20);
            jt[2] = new JTextField(20);
            jt[3] = new JTextField(20);
            jt[4] = new JTextField(20);
            jt[5] = new JTextField(20);
            if(b1.isVisible())
            {
                ln[0].setBounds(30,j-25,400,100);
                jt[0].setBounds(200,j+10,200,30);
                f1.add(ln[0]);
                f1.add(jt[0]);
                j=j+50;
            }   
            if(b2.isVisible())
            {
                ln[1].setBounds(30,j-25,400,100);
                jt[1].setBounds(200,j+10,200,30);
                f1.add(ln[1]);
                f1.add(jt[1]);
                j=j+50;
            }
            if(b3.isVisible())
            {
                ln[2].setBounds(30,j-25,400,100);
                jt[2].setBounds(200,j+10,200,30);
                f1.add(ln[2]);
                f1.add(jt[2]);
                j=j+50;
            }
            if(b4.isVisible())
            {
                ln[3].setBounds(30,j-25,400,100);
                jt[3].setBounds(200,j+10,200,30);
                f1.add(ln[3]);
                f1.add(jt[3]);
                j=j+50;
            }
            if(b5.isVisible())
            {
                ln[4].setBounds(30,j-25,400,100);
                jt[4].setBounds(200,j+10,200,30);
                f1.add(ln[4]);
                f1.add(jt[4]);
                j=j+50;
            }
            if(b6.isVisible())
            {
                ln[5].setBounds(30,j-25,400,100);
                jt[5].setBounds(200,j+10,200,30);
                f1.add(ln[5]);
                f1.add(jt[5]);
                j=j+50;
            }
            if(n>0)
            {
                ent = new JButton("ENTER");
                ent.setBounds(350,j,100,40);
                ent.addActionListener(this);
                f1.add(ent);
            }

            JLabel ni = new JLabel();
            f1.add(ni);
            ni.setVisible(false);
            f1.setVisible(true);
            
            f1.setBounds((xSize/2)-250,(ySize/2)-230,500,460);
            f1.setLayout(null);
            f1.setResizable(false);
        }
        if(o==ent)
        {
            f1.dispose();

            b1.setText(jt[0].getText());
            b2.setText(jt[1].getText());
            b3.setText(jt[2].getText());
            b4.setText(jt[3].getText());
            b5.setText(jt[4].getText());
            b6.setText(jt[5].getText());

        }
        if(s.equals("Reset Password"))
        {
            check=3;
            lock();
            
        }
        if(s.equals("Result "))

        {
            try
            {
                result();
            }
            catch(IOException sdf)
            {
            }
        }
        if(s.equals("Reset Votes"))
        {
            check = 4;
            lock();
        }
        if(s.equals("Picture Of Candidates "))
        {
            f1 = new JFrame(" Pics Location ");
            jb1 = new JButton(" Candidate 1 ");
            jb2  = new JButton(" Candidate 2 ");
            jb3 = new JButton(" Candidate 3 ");
            jb4  = new JButton(" Candidate 4 ");
            jb5 = new JButton(" Candidate 5");
            jb6  = new JButton(" Candidate 6 ");
            JButton no =  new JButton(" ");
            jbb = new JButton(" BackGround ");
            int j = 30;
            jbb.setBounds(30,j+10,150,40);
            f1.add(jbb);
            j=j+50;

            if(b1.isVisible())
            {
                jb1.setBounds(30,j+10,150,40);
                f1.add(jb1);
                j=j+50;
            }   
            if(b2.isVisible())
            {
                jb2.setBounds(30,j+10,150,40);
                f1.add(jb2);
                j=j+50;
            }
            if(b3.isVisible())
            {
                jb3.setBounds(30,j+10,150,40);
                f1.add(jb3);
                j=j+50;
            }
            if(b4.isVisible())
            {
                jb4.setBounds(30,j+10,150,40);
                f1.add(jb4);
                j=j+50;
            }
            if(b5.isVisible())
            {
                jb5.setBounds(30,j+10,150,40);
                f1.add(jb5);
                j=j+50;
            }
            if(b6.isVisible())
            {
                jb6.setBounds(30,j+10,150,40);
                f1.add(jb6);
                j=j+50;
            }
            no.setVisible(false);
            f1.add(no);
            jb1.addActionListener(this);
            jb2.addActionListener(this);
            jb3.addActionListener(this);
            jb4.addActionListener(this);
            jb5.addActionListener(this);
            jb6.addActionListener(this);
            jbb.addActionListener(this);
            f1.setLayout(null);
            f1.setVisible(true);
            f1.setLocation((f.getWidth()/2)-125,(f.getHeight()/2)-225);
            f1.setSize(250,450);
            f1.setResizable(false);
        }
        if(s.equals("Lock Menus "))
        {
            checkc =0;
            checkt = 0;
        }
        if(s.equals("Add Result to file "))
        {
            try
            {
                FInput();
                }
            catch(IOException sdf)
            {
            }
        }
        if(s.equals("Display File "))
        {
            try
            {
                FOutput();
                }
            catch(IOException sdf)
            {
            }
        }
        if(s.equals("Clear File "))
        {
            check = 5;
            lock();
        }
        if(o==jb1||o==jb2||o==jb3||o==jb4||o==jb5||o==jb6||o==jbb)
        {
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle(" Choose Image ");
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int rv = fc.showOpenDialog(this);
            if(rv==JFileChooser.APPROVE_OPTION)
            {
                File file =  fc.getSelectedFile();
                BufferedImage b1=null;
                Image ima=null;
                try
                {
                    b1 = ImageIO.read(file);
                    ima = b1.getScaledInstance(250,220,Image.SCALE_SMOOTH);

                }catch(IOException eam)
                {
                    eam.printStackTrace();
                }
                if(o==jb1)
                    label1.setIcon(new ImageIcon(ima));
                if(o==jb2)
                    label2.setIcon(new ImageIcon(ima));
                if(o==jb3)
                    label3.setIcon(new ImageIcon(ima));
                if(o==jb4)
                    label4.setIcon(new ImageIcon(ima));
                if(o==jb5)
                    label5.setIcon(new ImageIcon(ima));
                if(o==jb6)
                    label6.setIcon(new ImageIcon(ima));
                if(o==jbb)
                {
                    ima = b1.getScaledInstance(1400,800,Image.SCALE_SMOOTH);
                    labelb.setIcon(new ImageIcon(ima));
                }
            }
        }
        if(o==cha)
        {
            char ch[] = pf.getPassword();
            int len = ch.length;
            if(len<=10)
            {
                for(int a=0;a<len;a++)
                chh[a] =ch[a];
                for(int a=len;a<10;a++)
                chh[a] =' ';
                try
                {
                    passInput();
                }
                catch(IOException rdf)
                {
                }
                f1.dispose();
                JOptionPane pane = new JOptionPane(" Password Changed ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
                JDialog dialog = pane.createDialog(" Changing password ");
                dialog.setVisible(true);
            }
            else
            {
                JOptionPane pane = new JOptionPane(" Password is of more than 10 Characters ", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
                JDialog dialog = pane.createDialog(" ERROR ");
                dialog.setVisible(true);
            }
        }
        if(o==b1)
        {
            v1++;
        }
        if(o==b2)
        {
            v2++;
        }
        if(o==b3)
        {
            v3++;
        }
        if(o==b4)
        {
            v4++;
        }
        if(o==b5)
        {
            v5++;
        }
        if(o==b6)
        {
            v6++;
        }
        if(o==b7)
        {
            ni++;
        }
        if(o==b1||o==b2||o==b3||o==b4||o==b5||o==b6||o==b7)
        {
            JOptionPane pane = new JOptionPane(" Thanks For Voting", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{});
            final JDialog dialog = pane.createDialog(" Vote ");
            Timer timer = new Timer(3000, new ActionListener()
                    {public void actionPerformed(ActionEvent ae)
                        {
                            dialog.setVisible(false);
                            enable();
                            discolour();

                        }
                    });
            try
            {
                Input();
            }
            catch(IOException eg)
            {
            }
            disable();
            colour();

            timer.setRepeats(false);
            timer.start();
            dialog.setVisible(true);

        }  
    }
    public void resetP()
    {
        f1 = new JFrame("Change Password");
        JLabel lab = new JLabel(" Enter New Password ");
        pf = new JPasswordField(20);
        cha = new JButton("CHANGE");
        cha.addActionListener(this);
        f1.add(lab);
        f1.add(pf);
        f1.add(cha);
        f1.setLayout(new FlowLayout());
        f1.setLocation((f.getWidth()/2)-150,(f.getHeight()/2)-50);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.pack();
    }
    public void FInput() throws IOException
    {
        FileWriter fw = new FileWriter("FResult.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        FileReader fr = new FileReader("Result.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(new File("Result.txt"));
        Calendar calendar=Calendar.getInstance();
        
            pw.println("Date: "+calendar.get(Calendar.DATE)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
            pw.println("Time: "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE));
            pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        if(b1.isVisible());
        pw.println("              Vote For "+b1.getText()+" : "+sc.nextInt());
        if(b2.isVisible());
        pw.println("              Vote For "+b2.getText()+" : "+sc.nextInt());
        if(b3.isVisible());
        pw.println("              Vote For "+b3.getText()+" : "+sc.nextInt());
        if(b4.isVisible());
        pw.println("              Vote For "+b4.getText()+" : "+sc.nextInt());
        if(b5.isVisible());
        pw.println("              Vote For "+b5.getText()+" : "+sc.nextInt());
        if(b6.isVisible());
        pw.println("              Vote For "+b6.getText()+" : "+sc.nextInt());
        if(b7.isVisible());
        pw.println("              Vote For "+b7.getText()+" : "+sc.nextInt());
        pw.println();
        pw.close();
        bw.close();
        sc.close();
        fw.close();
        br.close();
    }
    public void FClear()throws IOException
    {
        
        PrintWriter pw = new PrintWriter("FResult.txt");
        pw.close();
    }
    public void FOutput() throws IOException
    {
        FileReader fr = new FileReader("FResult.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(new File("FResult.txt"));
        f1 = new JFrame("File");
        f1.setBounds((xSize/2)-225,(ySize/2)-250,450,500);
        JPanel panel = new JPanel();
        JScrollPane scrollbar = new JScrollPane(panel);
        int j=30;
        
        panel.setLayout(null);
        f1.setResizable(false);
        
        JLabel jla;

        while(sc.hasNext())
        {
            jla = new JLabel(""+sc.nextLine());
            jla.setBounds(30,j,200,100);
            j=j+30;
            panel.add(jla);
        }
        br.close();
        sc.close();
        
        panel.setPreferredSize(new Dimension(400,j+50));
        f1.getContentPane().add(scrollbar);
        
        f1.setVisible(true);
    }
    public void Input() throws IOException
    {
        FileWriter fw = new FileWriter("Result.txt",false);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println(v1);
        pw.println(v2);
        pw.println(v3);
        pw.println(v4);
        pw.println(v5);
        pw.println(v6);
        pw.println(ni);
        pw.close();
        bw.close();
        fw.close();
    }


    public void reset() throws IOException
    {
        FileWriter fw = new FileWriter("Result.txt",false);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        v1=0;
        v2=0;
        v3=0;
        v4=0;
        v5=0;
        v6=0;
        ni=0;

        pw.println(0);
        pw.println(0);
        pw.println(0);
        pw.println(0);
        pw.println(0);
        pw.println(0);
        pw.println(0);
        pw.close();
        bw.close();
        fw.close();
       
    }


    public void result()throws IOException
    {
        FileReader fr = new FileReader("Result.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(new File("Result.txt"));
        f1 = new JFrame("Result ");
        if(b1.isVisible());
        JLabel jl1 = new JLabel(" Vote for "+b1.getText()+" : "+sc.nextInt());
        if(b2.isVisible());
        JLabel jl2 = new JLabel(" Vote for "+b2.getText()+" : "+sc.nextInt());
        if(b3.isVisible());
        JLabel jl3 = new JLabel(" Vote for "+b3.getText()+" : "+sc.nextInt());
        if(b4.isVisible());
        JLabel jl4 = new JLabel(" Vote for "+b4.getText()+" : "+sc.nextInt());
        if(b5.isVisible());
        JLabel jl5 = new JLabel(" Vote for "+b5.getText()+" : "+sc.nextInt());
        if(b6.isVisible());
        JLabel jl6 = new JLabel(" Vote for "+b6.getText()+" : "+sc.nextInt());
        JLabel jln = new JLabel(" Vote for nill : "+sc.nextInt());
        int j=10;
        if(b1.isVisible())
        {
            jl1.setBounds(30,j,200,100);
            f1.add(jl1);
            j=j+50;
        }   
        if(b2.isVisible())
        {
            jl2.setBounds(30,j,200,100);
            f1.add(jl2);
            j=j+50;
        }
        if(b3.isVisible())
        {
            jl3.setBounds(30,j,200,100);
            f1.add(jl3);
            j=j+50;
        }
        if(b4.isVisible())
        {
            jl4.setBounds(30,j,200,100);
            f1.add(jl4);
            j=j+50;
        }
        if(b5.isVisible())
        {
            jl5.setBounds(30,j,200,100);
            f1.add(jl5);
            j=j+50;
        }
        if(b6.isVisible())
        {
            jl6.setBounds(30,j,200,100);
            f1.add(jl6);
            j=j+50;
        }
        if(b7.isVisible())
        {
            jln.setBounds(30,j,200,100);
            f1.add(jln);
            j=j+50;
        }
        JLabel no = new JLabel("");
        br.close();
        sc.close();
        f1.add(no);
        f1.setLayout(null);
        no.setVisible(false);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setLocation((f.getWidth()/2)-135,(f.getHeight()/2)-225);
        f1.setSize(270,440);
    }


    public static void main(String[] args)
    {
            new votingSystem1();
    }
}
