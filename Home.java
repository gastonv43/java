
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import student.database.management.system.StudentDatabase;

public class Home extends javax.swing.JFrame {

    public Home() {
        this.setLocationRelativeTo(null);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem37 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem15 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem30 = new javax.swing.JCheckBoxMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        viewnotice = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem36 = new javax.swing.JCheckBoxMenuItem();
        exitbox = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem23 = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jCheckBoxMenuItem24 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem25 = new javax.swing.JCheckBoxMenuItem();
        jMenu10 = new javax.swing.JMenu();
        edit = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem31 = new javax.swing.JCheckBoxMenuItem();
        jMenu11 = new javax.swing.JMenu();
        studentbox = new javax.swing.JCheckBoxMenuItem();
        adminbox = new javax.swing.JCheckBoxMenuItem();
        subjectlistbox = new javax.swing.JCheckBoxMenuItem();
        coursebox = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem21 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem22 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem32 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem33 = new javax.swing.JCheckBoxMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        boxviewnotices = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
        bocviewimportant = new javax.swing.JCheckBoxMenuItem();
        boxsubject = new javax.swing.JCheckBoxMenuItem();
        boxcompulsory = new javax.swing.JCheckBoxMenuItem();
        btntimetable = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem17 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem18 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem20 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem19 = new javax.swing.JCheckBoxMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenu12.setText("File");
        jMenuBar3.add(jMenu12);

        jMenu13.setText("Edit");
        jMenuBar3.add(jMenu13);

        jMenu14.setText("File");
        jMenuBar4.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar4.add(jMenu15);

        jMenu16.setText("File");
        jMenuBar5.add(jMenu16);

        jMenu17.setText("Edit");
        jMenuBar5.add(jMenu17);

        jMenu18.setText("jMenu18");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("jCheckBoxMenuItem8");

        jCheckBoxMenuItem37.setSelected(true);
        jCheckBoxMenuItem37.setText("jCheckBoxMenuItem37");

        jCheckBoxMenuItem15.setSelected(true);
        jCheckBoxMenuItem15.setText("jCheckBoxMenuItem15");

        jCheckBoxMenuItem30.setSelected(true);
        jCheckBoxMenuItem30.setText("jCheckBoxMenuItem30");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Welcome to Miami University student Database");

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("      Swimmers dont make exuses but make waves");

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnexit)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnexit))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jMenu3.setText("Home");
        jMenu3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu3MouseMoved(evt);
            }
        });

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("login as super user");
        jCheckBoxMenuItem4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem4MouseMoved(evt);
            }
        });
        jCheckBoxMenuItem4.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jCheckBoxMenuItem4MouseWheelMoved(evt);
            }
        });
        jCheckBoxMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem4MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("change password");
        jCheckBoxMenuItem5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem5MouseMoved(evt);
            }
        });
        jCheckBoxMenuItem5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBoxMenuItem5FocusLost(evt);
            }
        });
        jCheckBoxMenuItem5.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jCheckBoxMenuItem5MouseWheelMoved(evt);
            }
        });
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Courses");
        jMenu3.add(jCheckBoxMenuItem6);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Departments");
        jRadioButtonMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMenuItem1MouseClicked(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem1);

        viewnotice.setSelected(true);
        viewnotice.setText("view notices");
        viewnotice.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewnoticeMouseMoved(evt);
            }
        });
        viewnotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewnoticeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewnoticeMouseEntered(evt);
            }
        });
        viewnotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewnoticeActionPerformed(evt);
            }
        });
        jMenu3.add(viewnotice);

        jCheckBoxMenuItem36.setSelected(true);
        jCheckBoxMenuItem36.setText("log out");
        jCheckBoxMenuItem36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem36MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem36ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem36);

        exitbox.setSelected(true);
        exitbox.setText("exit");
        exitbox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitboxMouseMoved(evt);
            }
        });
        exitbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitboxMouseEntered(evt);
            }
        });
        exitbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitboxActionPerformed(evt);
            }
        });
        jMenu3.add(exitbox);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Add Users");

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Add administrator");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem9.setSelected(true);
        jCheckBoxMenuItem9.setText("add a student");
        jCheckBoxMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem9);

        jCheckBoxMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem23.setSelected(true);
        jCheckBoxMenuItem23.setText("save changes");
        jCheckBoxMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem23);

        jMenuBar1.add(jMenu4);

        jMenu8.setText("Remove Users");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("remove admin");
        jMenu8.add(jRadioButtonMenuItem2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("remove student");
        jCheckBoxMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem1MouseClicked(evt);
            }
        });
        jMenu8.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Publish Time");

        jCheckBoxMenuItem24.setSelected(true);
        jCheckBoxMenuItem24.setText("Update time- table");
        jCheckBoxMenuItem24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem24MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem24ActionPerformed(evt);
            }
        });
        jMenu9.add(jCheckBoxMenuItem24);

        jCheckBoxMenuItem25.setSelected(true);
        jCheckBoxMenuItem25.setText("Delete");
        jCheckBoxMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem25ActionPerformed(evt);
            }
        });
        jMenu9.add(jCheckBoxMenuItem25);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Edit Profiles");

        edit.setSelected(true);
        edit.setText("Edit admin profile");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jMenu10.add(edit);

        jCheckBoxMenuItem31.setSelected(true);
        jCheckBoxMenuItem31.setText("edit student's profile");
        jCheckBoxMenuItem31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem31MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem31ActionPerformed(evt);
            }
        });
        jMenu10.add(jCheckBoxMenuItem31);

        jMenuBar1.add(jMenu10);

        jMenu11.setBackground(new java.awt.Color(255, 153, 51));
        jMenu11.setText("Update");

        studentbox.setSelected(true);
        studentbox.setText("studentdetails");
        studentbox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                studentboxMouseMoved(evt);
            }
        });
        studentbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentboxMouseEntered(evt);
            }
        });
        studentbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentboxActionPerformed(evt);
            }
        });
        jMenu11.add(studentbox);

        adminbox.setSelected(true);
        adminbox.setText("admin details");
        adminbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminboxMouseClicked(evt);
            }
        });
        adminbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminboxActionPerformed(evt);
            }
        });
        jMenu11.add(adminbox);

        subjectlistbox.setSelected(true);
        subjectlistbox.setText("subjectlists");
        subjectlistbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectlistboxActionPerformed(evt);
            }
        });
        jMenu11.add(subjectlistbox);

        coursebox.setSelected(true);
        coursebox.setText("courses");
        jMenu11.add(coursebox);

        jCheckBoxMenuItem21.setSelected(true);
        jCheckBoxMenuItem21.setText("Notices");
        jMenu11.add(jCheckBoxMenuItem21);

        jCheckBoxMenuItem22.setSelected(true);
        jCheckBoxMenuItem22.setText("Important days");
        jMenu11.add(jCheckBoxMenuItem22);

        jCheckBoxMenuItem32.setSelected(true);
        jCheckBoxMenuItem32.setText("semesters");
        jMenu11.add(jCheckBoxMenuItem32);

        jCheckBoxMenuItem33.setSelected(true);
        jCheckBoxMenuItem33.setText("time table");
        jMenu11.add(jCheckBoxMenuItem33);

        jMenuBar1.add(jMenu11);

        jMenu19.setText("View");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("publish time table");
        jCheckBoxMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem7MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem7ActionPerformed(evt);
            }
        });
        jMenu19.add(jCheckBoxMenuItem7);

        boxviewnotices.setSelected(true);
        boxviewnotices.setText("View Notices");
        boxviewnotices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxviewnoticesMouseClicked(evt);
            }
        });
        boxviewnotices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxviewnoticesActionPerformed(evt);
            }
        });
        jMenu19.add(boxviewnotices);

        jCheckBoxMenuItem11.setSelected(true);
        jCheckBoxMenuItem11.setText("Result Preview");
        jCheckBoxMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem11MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem11ActionPerformed(evt);
            }
        });
        jMenu19.add(jCheckBoxMenuItem11);

        bocviewimportant.setSelected(true);
        bocviewimportant.setText("View Important days");
        bocviewimportant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bocviewimportantMouseClicked(evt);
            }
        });
        bocviewimportant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bocviewimportantActionPerformed(evt);
            }
        });
        jMenu19.add(bocviewimportant);

        boxsubject.setSelected(true);
        boxsubject.setText("View subjectlist");
        boxsubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxsubjectMouseClicked(evt);
            }
        });
        boxsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxsubjectActionPerformed(evt);
            }
        });
        jMenu19.add(boxsubject);

        boxcompulsory.setSelected(true);
        boxcompulsory.setText("View compulsory subjects");
        boxcompulsory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxcompulsoryMouseClicked(evt);
            }
        });
        boxcompulsory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxcompulsoryActionPerformed(evt);
            }
        });
        jMenu19.add(boxcompulsory);

        btntimetable.setSelected(true);
        btntimetable.setText("View Optional subjects");
        btntimetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntimetableMouseClicked(evt);
            }
        });
        btntimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimetableActionPerformed(evt);
            }
        });
        jMenu19.add(btntimetable);

        jCheckBoxMenuItem17.setSelected(true);
        jCheckBoxMenuItem17.setText("View courses");
        jCheckBoxMenuItem17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem17MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem17ActionPerformed(evt);
            }
        });
        jMenu19.add(jCheckBoxMenuItem17);

        jCheckBoxMenuItem18.setSelected(true);
        jCheckBoxMenuItem18.setText("view current Semester");
        jCheckBoxMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem18ActionPerformed(evt);
            }
        });
        jMenu19.add(jCheckBoxMenuItem18);

        jCheckBoxMenuItem20.setSelected(true);
        jCheckBoxMenuItem20.setText("view administrators in the database");
        jCheckBoxMenuItem20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem20MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem20ActionPerformed(evt);
            }
        });
        jMenu19.add(jCheckBoxMenuItem20);

        jCheckBoxMenuItem19.setSelected(true);
        jCheckBoxMenuItem19.setText("View students in the database");
        jCheckBoxMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem19ActionPerformed(evt);
            }
        });
        jMenu19.add(jCheckBoxMenuItem19);

        jMenuBar1.add(jMenu19);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
ChangePassword password = new ChangePassword()  ;
password.show();
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jCheckBoxMenuItem4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4MouseMoved
 
    }//GEN-LAST:event_jCheckBoxMenuItem4MouseMoved

    private void jCheckBoxMenuItem5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5FocusLost
   
    }//GEN-LAST:event_jCheckBoxMenuItem5FocusLost

    private void jCheckBoxMenuItem5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5MouseMoved
           
 
    }//GEN-LAST:event_jCheckBoxMenuItem5MouseMoved

    private void jMenu3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseMoved
    
    }//GEN-LAST:event_jMenu3MouseMoved

    private void jCheckBoxMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem23ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
   try {
            StudentDatabase    base = new   StudentDatabase();
            base.show();
   }    catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem36ActionPerformed
LoginForm form = new  LoginForm ()   ;
form.show();
    }//GEN-LAST:event_jCheckBoxMenuItem36ActionPerformed

    private void exitboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitboxActionPerformed
       exitbox.setBackground(Color.red);
       System.exit(0);
    }//GEN-LAST:event_exitboxActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
SuperUserLogin login = new       SuperUserLogin() ;
login.show();
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jCheckBoxMenuItem4MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4MouseWheelMoved
        jCheckBoxMenuItem4.setBackground(Color.green);
        
    }//GEN-LAST:event_jCheckBoxMenuItem4MouseWheelMoved

    private void jCheckBoxMenuItem5MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5MouseWheelMoved
       jCheckBoxMenuItem5.setBackground(Color.green);
    }//GEN-LAST:event_jCheckBoxMenuItem5MouseWheelMoved

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
     int response = JOptionPane.showConfirmDialog(null, "Are you sure to Exit", "Exit", JOptionPane.YES_NO_OPTION);
       if(response == JOptionPane.YES_OPTION){
           this.dispose();
       }
        LoginForm form  = new  LoginForm();
      form.setVisible(true);
           
    }//GEN-LAST:event_btnexitActionPerformed

    private void jCheckBoxMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4MouseClicked
       
    }//GEN-LAST:event_jCheckBoxMenuItem4MouseClicked

    private void jRadioButtonMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1MouseClicked
      Department dep  =  new  Department();
      dep.show();
    }//GEN-LAST:event_jRadioButtonMenuItem1MouseClicked

    private void jCheckBoxMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem25ActionPerformed

    private void jCheckBoxMenuItem24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem24MouseClicked
      publishTimetable table =  new  publishTimetable();
      table.show();
    }//GEN-LAST:event_jCheckBoxMenuItem24MouseClicked

    private void viewnoticeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMouseEntered
    
    }//GEN-LAST:event_viewnoticeMouseEntered

    private void viewnoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMouseClicked
   ViewNotices  notice  = new   ViewNotices ();
    notice .show();
    }//GEN-LAST:event_viewnoticeMouseClicked

    private void jCheckBoxMenuItem36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem36MouseClicked
       
    }//GEN-LAST:event_jCheckBoxMenuItem36MouseClicked

    private void exitboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitboxMouseClicked
       JOptionPane.showConfirmDialog(null, " Do you want to exit???");
       System.exit(0);
    }//GEN-LAST:event_exitboxMouseClicked

    private void studentboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentboxMouseEntered
       studentbox.setBackground(Color.green);
       
    }//GEN-LAST:event_studentboxMouseEntered

    private void adminboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminboxMouseClicked
             adminbox.setBackground(Color.green);
    }//GEN-LAST:event_adminboxMouseClicked

    private void exitboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitboxMouseEntered
exitbox.setBackground(Color.red);
    }//GEN-LAST:event_exitboxMouseEntered

    private void exitboxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitboxMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_exitboxMouseMoved

    private void jCheckBoxMenuItem4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem4MouseDragged

    private void viewnoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewnoticeActionPerformed
        ViewNotices notice = new ViewNotices();
        notice.show();
    }//GEN-LAST:event_viewnoticeActionPerformed

    private void viewnoticeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewnoticeMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_viewnoticeMouseMoved

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
      
    }//GEN-LAST:event_editMouseClicked

    private void jCheckBoxMenuItem31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem31MouseClicked
       
    }//GEN-LAST:event_jCheckBoxMenuItem31MouseClicked

    private void jCheckBoxMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1MouseClicked
       StudentDatabase std;
      try {
            StudentDatabase    base = new   StudentDatabase();
            base.show();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jCheckBoxMenuItem1MouseClicked

    private void boxcompulsoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxcompulsoryActionPerformed
          Compulsory comp = new Compulsory();
          comp.show();
    }//GEN-LAST:event_boxcompulsoryActionPerformed

    private void jCheckBoxMenuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7MouseClicked
        publishTimetable ptb  = new  publishTimetable();
        ptb.show();
    }//GEN-LAST:event_jCheckBoxMenuItem7MouseClicked

    private void boxviewnoticesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxviewnoticesMouseClicked
       ViewNotices vn = new  ViewNotices();
       vn.show();
    }//GEN-LAST:event_boxviewnoticesMouseClicked

    private void jCheckBoxMenuItem11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem11MouseClicked

    }//GEN-LAST:event_jCheckBoxMenuItem11MouseClicked

    private void bocviewimportantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bocviewimportantMouseClicked
   
    }//GEN-LAST:event_bocviewimportantMouseClicked

    private void boxsubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxsubjectMouseClicked
       
    }//GEN-LAST:event_boxsubjectMouseClicked

    private void boxcompulsoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxcompulsoryMouseClicked

    }//GEN-LAST:event_boxcompulsoryMouseClicked

    private void btntimetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntimetableMouseClicked
      
    }//GEN-LAST:event_btntimetableMouseClicked

    private void jCheckBoxMenuItem20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem20MouseClicked
      AddNewUser user = new  AddNewUser();
      user.show();
    }//GEN-LAST:event_jCheckBoxMenuItem20MouseClicked

    private void adminboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminboxActionPerformed

    private void subjectlistboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectlistboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectlistboxActionPerformed

    private void btntimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimetableActionPerformed
    Optional op = new Optional();
                op.show();
    }//GEN-LAST:event_btntimetableActionPerformed

    private void boxsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxsubjectActionPerformed
        SubjectList subl = new  SubjectList ();
       subl.show();
    }//GEN-LAST:event_boxsubjectActionPerformed

    private void boxviewnoticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxviewnoticesActionPerformed
       ViewNotices vn = new  ViewNotices();
       vn.show();
    }//GEN-LAST:event_boxviewnoticesActionPerformed

    private void jCheckBoxMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem11ActionPerformed
           ResultPreview rs = new    ResultPreview () ; 
           rs.show();
            ViewNotices vn = new  ViewNotices();
       vn.dispose();
           
    }//GEN-LAST:event_jCheckBoxMenuItem11ActionPerformed

    private void bocviewimportantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bocviewimportantActionPerformed
         ImportantDays imp = new  ImportantDays();
    imp.show();
    }//GEN-LAST:event_bocviewimportantActionPerformed

    private void jCheckBoxMenuItem17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem17MouseClicked
       
    }//GEN-LAST:event_jCheckBoxMenuItem17MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
      EditAdminProfile profile = new EditAdminProfile();
        profile.show();
    }//GEN-LAST:event_editActionPerformed

    private void jCheckBoxMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem31ActionPerformed
        StudentProfile stp = new   StudentProfile();
        stp.show();
    }//GEN-LAST:event_jCheckBoxMenuItem31ActionPerformed

    private void studentboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentboxActionPerformed
        try {
            StudentDatabase    base = new   StudentDatabase();
            base.show();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studentboxActionPerformed

    private void jCheckBoxMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem17ActionPerformed
       Course cour = new Course();
       cour.show();
    }//GEN-LAST:event_jCheckBoxMenuItem17ActionPerformed

    private void jCheckBoxMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem18ActionPerformed
      CurrentSemester semester = new CurrentSemester();
      semester.show();
    }//GEN-LAST:event_jCheckBoxMenuItem18ActionPerformed

    private void jCheckBoxMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem20ActionPerformed
    AddNewUser add =  new   AddNewUser() ;
    add.show();
    }//GEN-LAST:event_jCheckBoxMenuItem20ActionPerformed

    private void jCheckBoxMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem19ActionPerformed
        try {
            StudentDatabase base = new StudentDatabase();
            base.show();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);








        }
    }//GEN-LAST:event_jCheckBoxMenuItem19ActionPerformed

    private void jCheckBoxMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7ActionPerformed
publishTimetable table = new  publishTimetable()  ;
table.show();
    }//GEN-LAST:event_jCheckBoxMenuItem7ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        AddNewUser user =  new  AddNewUser();
        user.show();
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem9ActionPerformed
        try {
            StudentDatabase database =  new StudentDatabase();
            database.show();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jCheckBoxMenuItem9ActionPerformed

    private void jCheckBoxMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem24ActionPerformed
    publishTimetable timetable = new publishTimetable();
    timetable.show();
    }//GEN-LAST:event_jCheckBoxMenuItem24ActionPerformed

    private void studentboxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentboxMouseMoved
        studentbox.setBackground(Color.green);
    }//GEN-LAST:event_studentboxMouseMoved

   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem adminbox;
    private javax.swing.JCheckBoxMenuItem bocviewimportant;
    private javax.swing.JCheckBoxMenuItem boxcompulsory;
    private javax.swing.JCheckBoxMenuItem boxsubject;
    private javax.swing.JCheckBoxMenuItem boxviewnotices;
    private javax.swing.JButton btnexit;
    private javax.swing.JCheckBoxMenuItem btntimetable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem coursebox;
    private javax.swing.JCheckBoxMenuItem edit;
    private javax.swing.JCheckBoxMenuItem exitbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem15;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem17;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem18;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem19;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem20;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem21;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem22;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem23;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem24;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem25;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem30;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem31;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem32;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem33;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem36;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem37;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JCheckBoxMenuItem studentbox;
    private javax.swing.JCheckBoxMenuItem subjectlistbox;
    private javax.swing.JCheckBoxMenuItem viewnotice;
    // End of variables declaration//GEN-END:variables
}
