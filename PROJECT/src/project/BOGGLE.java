/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Dell
 */
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Random;
import javax.swing.*;
//import static project.Project.root;




public class BOGGLE extends javax.swing.JFrame {

    /**
     * Creates new form BOGGLE
     */
    char[] charr = new char[15];
    
    String t;
    String[] words = new String[100];
    
    public BOGGLE() {
        initComponents();  
    }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOGGLE GAME");

        jPanel2.setBackground(new java.awt.Color(255, 102, 153));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        jButton1.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton1.setText("g");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton2.setText("k");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton9.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton9.setText("j");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton5.setFont(new java.awt.Font("Swis721 BlkEx BT", 3, 18)); // NOI18N
        jButton5.setText("h");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton7.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton7.setText("d");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton13.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton13.setText("i");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton12.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton12.setText("l");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton14.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton14.setText("o");
        jButton14.setToolTipText("");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton11.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton11.setText("p");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton10.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton10.setText("h");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton8.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton8.setText("c");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton6.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton6.setText("w");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton3.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton3.setText("o");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton4.setText("p");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton15.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton15.setText("k");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setFont(new java.awt.Font("Swis721 Blk BT", 3, 18)); // NOI18N
        jButton16.setText("a");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COMPUTER WORDS");

        jButton18.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton18.setText("SHUFFLE");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jButton17.setText("OK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOGGLE GAME");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YOUR WORDS");

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("ability\nable\nabout\nabove\naccept\naccording\naccount\nacross\nact\naction\nactivity\nactually\nadd\naddress\nadministration\nadmit\nadult\naffect\nafter\nagain\nagainst\nage\nagency\nagent\nago\nagree\nagreement\nahead\nair\nall\nallow\nalmost\nalone\nalong\nalready\nalso\nalthough\nalways\namerican\namong\namount\nanalysis\nand\nanimal\nanother\nanswer\nany\nanyone\nanything\nappear\napply\napproach\narea\nargue\narm\naround\narrive\nart\narticle\nartist\nas\nask\nassume\nat\nattack\nattention\nattorney\naudience\nauthor\nauthority\navailable\navoid\naway\nbaby\nback\nbad\nbag\nball\nbank\nbar\nbase\nbe\nbeat\nbeautiful\nbecause\nbecome\nbed\nbefore\nbegin\nbehavior\nbehind\nbelieve\nbenefit\nbest\nbetter\nbetween\nbeyond\nbig\nbill\nbillion\nbit\nblack\nblood\nblue\nboard\nbody\nbook\nborn\nboth\nbox\nboy\nbreak\nbring\nbrother\nbudget\nbuild\nbuilding\nbusiness\nbut\nbuy\nby\ncall\ncamera\ncampaign\ncan\ncancer\ncandidate\ncapital\ncar\ncard\ncare\ncareer\ncarry\ncase\ncatch\ncause\ncell\ncenter\ncentral\ncentury\ncertain\ncertainly\nchair\nchallenge\nchance\nchange\ncharacter\ncharge\ncheck\nchild\nchoice\nchoose\nchurch\ncitizen\ncity\ncivil\nclaim\nclass\nclear\nclearly\nclose\ncoach\ncold\ncollection\ncollege\ncolor\ncome\ncommercial\ncommon\ncommunity\ncompany\ncompare\ncomputer\nconcern\ncondition\nconference\ncongress\nconsider\nconsumer\ncontain\ncontinue\ncontrol\ncost\ncould\ncountry\ncouple\ncourse\ncourt\ncover\ncreate\ncrime\ncultural\nculture\ncup\ncurrent\ncustomer\ncut\ndark\ndata\ndaughter\nday\ndead\ndeal\ndeath\ndebate\ndecade\ndecide\ndecision\ndeep\ndefense\ndegree\ndemocrat\ndemocratic\ndescribe\ndesign\ndespite\ndetail\ndetermine\ndevelop\ndevelopment\ndie\ndifference\ndifferent\ndifficult\ndinner\ndirection\ndirector\ndiscover\ndiscuss\ndiscussion\ndisease\ndo\ndoctor\ndog\ndoor\ndown\ndraw\ndream\ndrive\ndrop\ndrug\nduring\neach\nearly\neast\neasy\neat\neconomic\neconomy\nedge\neducation\neffect\neffort\neight\neither\nelection\nelse\nemployee\nend\nenergy\nenjoy\nenough\nenter\nentire\nenvironment\nenvironmental\nespecially\nestablish\neven\nevening\nevent\never\nevery\neverybody\neveryone\neverything\nevidence\nexactly\nexample\nexecutive\nexist\nexpect\nexperience\nexpert\nexplain\neye\nface\nfact\nfactor\nfail\nfall\nfamily\nfar\nfast\nfather\nfear\nfederal\nfeel\nfeeling\nfew\nfield\nfight\nfigure\nfill\nfilm\nfinal\nfinally\nfinancial\nfind\nfine\nfinger\nfinish\nfire\nfirm\nfirst\nfish\nfive\nfloor\nfly\nfocus\nfollow\nfood\nfoot\nfor\nforce\nforeign\nforget\nform\nformer\nforward\nfour\nfree\nfriend\nfrom\nfront\nfull\nfund\nfuture\ngame\ngarden\ngas\ngeneral\ngeneration\nget\ngirl\ngive\nglass\ngo\ngoal\ngood\ngovernment\ngreat\ngreen\nground\ngroup\ngrow\ngrowth\nguess\ngun\nguy\nhair\nhalf\nhand\nhang\nhappen\nhappy\nhard\nhave\nhe\nhead\nhealth\nhear\nheart\nheat\nheavy\nhelp\nher\nhere\nherself\nhigh\nhim\nhimself\nhis\nhistory\nhit\nhold\nhome\nhope\nhospital\nhot\nhotel\nhour\nhouse\nhow\nhowever\nhuge\nhuman\nhundred\nhusband\ni\nidea\nidentify\nif\nimage\nimagine\nimpact\nimportant\nimprove\nin\ninclude\nincluding\nincrease\nindeed\nindicate\nindividual\nindustry\ninformation\ninside\ninstead\ninstitution\ninterest\ninteresting\ninternational\ninterview\ninto\ninvestment\ninvolve\nissue\nit\nitem\nits\nitself\njob\njoin\njust\nkeep\nkey\nkid\nkill\nkind\nkitchen\nknow\nknowledge\nland\nlanguage\nlarge\nlast\nlate\nlater\nlaugh\nlaw\nlawyer\nlay\nlead\nleader\nlearn\nleast\nleave\nleft\nleg\nlegal\nless\nlet\nletter\nlevel\nlie\nlife\nlight\nlike\nlikely\nline\nlist\nlisten\nlittle\nlive\nlocal\nlong\nlook\nlose\nloss\nlot\nlove\nlow\nmachine\nmagazine\nmain\nmaintain\nmajor\nmajority\nmake\nman\nmanage\nmanagement\nmanager\nmany\nmarket\nmarriage\nmaterial\nmatter\nmay\nmaybe\nme\nmean\nmeasure\nmedia\nmedical\nmeet\nmeeting\nmember\nmemory\nmention\nmessage\nmethod\nmiddle\nmight\nmilitary\nmillion\nmind\nminute\nmiss\nmission\nmodel\nmodern\nmoment\nmoney\nmonth\nmore\nmorning\nmost\nmother\nmouth\nmove\nmovement\nmovie\nmuch\nmusic\nmust\nmy\nmyself\nname\nnation\nnational\nnatural\nnature\nnear\nnearly\nnecessary\nneed\nnetwork\nnever\nnew\nnews\nnewspaper\nnext\nnice\nnight\nno\nnone\nnor\nnorth\nnot\nnote\nnothing\nnotice\nnow\nnumber\noccur\nof\noff\noffer\noffice\nofficer\nofficial\noften\noh\noil\nok\nokey\nold\non\nonce\none\nonly\nonto\nopen\noperation\nopportunity\noption\nor\norder\norganization\nother\nothers\nour\nout\noutside\nover\nown\nowner\npage\npain\npainting\npaper\nparent\npart\nparticipant\nparticular\nparticularly\npartner\nparty\npass\npast\npatient\npattern\npay\npeace\npeople\nper\nperform\nperformance\nperhaps\nperiod\nperson\npersonal\nphone\nphysical\npick\npicture\npiece\nplace\nplan\nplant\nplay\nplayer\npoint\npolice\npolicy\npolitical\npolitics\npoor\npopular\npopulation\nposition\npositive\npossible\npower\npractice\nprepare\npresent\npresident\npressure\npretty\nprevent\nprice\nprivate\nprobably\nproblem\nprocess\nproduce\nproduct\nproduction\nprofessional\nprofessor\nprogram\nproject\nproperty\nprotect\nprove\nprovide\npublic\npull\npurpose\npush\nput\nquality\nquestion\nquickly\nquite\nrace\nradio\nraise\nrange\nrate\nrather\nreach\nread\nready\nreal\nreality\nrealize\nreally\nreason\nreceive\nrecent\nrecently\nrecognize\nrecord\nred\nreduce\nreflect\nregion\nrelate\nrelationship\nreligious\nremain\nremember\nremove\nreport\nrepresent\nrepublican\nrequire\nresearch\nresource\nrespond\nresponse\nresponsibility\nrest\nresult\nreturn\nreveal\nrich\nright\nrise\nrisk\nroad\nrock\nrole\nroom\nrule\nrun\nsafe\nsame\nsave\nsay\nscene\nschool\nscience\nscientist\nscore\nsea\nseason\nseat\nsecond\nsection\nsecurity\nsee\nseek\nseem\nsell\nsend\nsenior\nsense\nseries\nserious\nserve\nservice\nset\nseven\nseveral\nsex\nsexual\nshake\nshare\nshe\nshoot\nshort\nshot\nshould\nshoulder\nshow\nside\nsign\nsignificant\nsimilar\nsimple\nsimply\nsince\nsing\nsingle\nsister\nsit\nsite\nsituation\nsix\nsize\nskill\nskin\nsmall\nsmile\nso\nsocial\nsociety\nsoldier\nsome\nsomebody\nsomeone\nsomething\nsometimes\nson\nsong\nsoon\nsort\nsound\nsource\nsouth\nsouthern\nspace\nspeak\nspecial\nspecific\nspeech\nspend\nsport\nspring\nstaff\nstage\nstand\nstandard\nstar\nstart\nstate\nstatement\nstation\nstay\nstep\nstill\nstock\nstop\nstore\nstory\nstrategy\nstreet\nstrong\nstructure\nstudent\nstudy\nstuff\nstyle\nsubject\nsuccess\nsuccessful\nsuch\nsuddenly\nsuffer\nsuggest\nsummer\nsupport\nsure\nsurface\nsystem\ntable\ntake\ntalk\ntask\ntax\nteach\nteacher\nteam\ntechnology\ntelevision\ntell\nten\ntend\nterm\ntest\nthan\nthank\nthat\nthe\ntheir\nthem\nthemselves\nthen\ntheory\nthere\nthese\nthey\nthing\nthink\nthird\nthis\nthose\nthough\nthought\nthousand\nthreat\nthree\nthrough\nthroughout\nthrow\nthus\ntime\nto\ntoday\ntogether\ntonight\ntoo\ntop\ntotal\ntough\ntoward\ntown\ntrade\ntraditional\ntraining\ntravel\ntreat\ntreatment\ntree\ntrial\ntrip\ntrouble\ntrue\ntruth\ntry\nturn\ntv\ntwo\ntype\nunder\nunderstand\nunit\nuntil\nup\nupon\nus\nuse\nusually\nvalue\nvarious\nvery\nvictim\nview\nviolence\nvisit\nvoice\nvote\nwait\nwalk\nwall\nwant\nwar\nwatch\nwater\nway\nwe\nweapon\nwear\nweek\nweight\nwell\nwest\nwestern\nwhat\nwhatever\nwhen\nwhere\nwhether\nwhich\nwhile\nwhite\nwho\nwhole\nwhom\nwhose\nwhy\nwide\nwife\nwill\nwin\nwind\nwindow\nwish\nwith\nwithin\nwithout\nwoman\nwonder\nword\nwork\nworker\nworld\nworry\nwould\nwrite\nwriter\nwrong\nyard\nyeah\nyear\nyes\nyet\nyou\nyoung\nyour\nyourself\nzip");
        jScrollPane2.setViewportView(jTextArea2);

        jButton19.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton19.setText("Submit");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(476, 476, 476))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(544, 544, 544)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
       
       // jTextArea1.append("");
         jTextArea1.setText(jTextArea1.getText()+"\n");
        jButton1.setBackground(UIManager.getColor("Button.background"));
       jButton2.setBackground(UIManager.getColor("Button.background"));
       jButton5.setBackground(UIManager.getColor("Button.background"));
       jButton9.setBackground(UIManager.getColor("Button.background"));
       jButton13.setBackground(UIManager.getColor("Button.background"));
      jButton7.setBackground(UIManager.getColor("Button.background"));
      jButton10.setBackground(UIManager.getColor("Button.background"));
      jButton11.setBackground(UIManager.getColor("Button.background"));
      jButton12.setBackground(UIManager.getColor("Button.background"));
      jButton14.setBackground(UIManager.getColor("Button.background"));
      jButton8.setBackground(UIManager.getColor("Button.background"));
      jButton3.setBackground(UIManager.getColor("Button.background"));
      jButton6.setBackground(UIManager.getColor("Button.background"));
      jButton4.setBackground(UIManager.getColor("Button.background"));
      jButton15.setBackground(UIManager.getColor("Button.background"));
     jButton16.setBackground(UIManager.getColor("Button.background"));
       
         
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         jButton1.setBackground(Color.green);
        t=jButton1.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setBackground(Color.green);
        t=jButton2.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setBackground(Color.green);
        t=jButton9.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setBackground(Color.green);
        t=jButton5.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         jButton7.setBackground(Color.green);
        t=jButton7.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButton13.setBackground(Color.green);
        t=jButton13.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButton12.setBackground(Color.green);
        t=jButton12.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButton14.setBackground(Color.green);
        t=jButton14.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton11.setBackground(Color.green);
        t=jButton11.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setBackground(Color.green);
        t=jButton10.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setBackground(Color.green);
        t=jButton8.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setBackground(Color.green);
        t=jButton6.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setBackground(Color.green);
        t=jButton3.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setBackground(Color.green);
        t=jButton4.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jButton15.setBackground(Color.green);
        t=jButton15.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jButton16.setBackground(Color.green);
        t=jButton16.getText();
         jTextArea1.append(t);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jButton1.setBackground(UIManager.getColor("Button.background"));
       jButton2.setBackground(UIManager.getColor("Button.background"));
       jButton5.setBackground(UIManager.getColor("Button.background"));
       jButton9.setBackground(UIManager.getColor("Button.background"));
       jButton13.setBackground(UIManager.getColor("Button.background"));
      jButton7.setBackground(UIManager.getColor("Button.background"));
      jButton10.setBackground(UIManager.getColor("Button.background"));
      jButton11.setBackground(UIManager.getColor("Button.background"));
      jButton12.setBackground(UIManager.getColor("Button.background"));
      jButton14.setBackground(UIManager.getColor("Button.background"));
      jButton8.setBackground(UIManager.getColor("Button.background"));
      jButton3.setBackground(UIManager.getColor("Button.background"));
      jButton6.setBackground(UIManager.getColor("Button.background"));
      jButton4.setBackground(UIManager.getColor("Button.background"));
      jButton15.setBackground(UIManager.getColor("Button.background"));
     jButton16.setBackground(UIManager.getColor("Button.background"));
        t=getAlphanumericString(1);
  
        jButton1.setText(t);
         t=getAlphanumericString(1);
         
        jButton2.setText(t);
         t=getAlphanumericString(1);
       
         jButton3.setText(t);
         t=getAlphanumericString(1);
   
         jButton4.setText(t);
         t=getAlphanumericString(1);
       
         jButton5.setText(t);
         t=getAlphanumericString(1);
       
         jButton6.setText(t);
         t=getAlphanumericString(1);
  
         jButton7.setText(t);
         t=getAlphanumericString(1);
      
         jButton8.setText(t);
         t=getAlphanumericString(1);
      
         jButton9.setText(t);
         t=getAlphanumericString(1);
       
         jButton10.setText(t);
         t=getAlphanumericString(1);
      
         jButton11.setText(t);
         t=getAlphanumericString(1);
     
         jButton12.setText(t);
         t=getAlphanumericString(1);
       
         
         jButton13.setText(t);
         t=getAlphanumericString(1);
       
         jButton14.setText(t);
         t=getAlphanumericString(1);
        
         jButton15.setText(t);
         t=getAlphanumericString(1);
      
         jButton16.setText(t);
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       // TODO add your handling code here:
boolean tt =true;
int points=0,po=0,point=0;
String[] word;
word=jTextArea1.getText().split("\n");
int ii=10;
ii=jTextArea1.getLineCount();
Searches s=new Searches();
for(int i=0;i<1;i++)
{
   System.out.println(word[i]);  
tt=s.search(word[i]);
 System.out.println(tt); 
  if(tt==true){
       System.out.println("if"+word[i]); 
       point+=2;
  }  
 else
  {  
      point = point-1;
  } 
}
         JOptionPane.showMessageDialog(null, "you have scroed "+point+" points");
         System.exit(0);
    }//GEN-LAST:event_jButton19ActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public void main(String args[])  throws Exception  {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BOGGLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOGGLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOGGLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOGGLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
            new BOGGLE().setVisible(true);
    }
 
    
    static String getAlphanumericString(int n)
	{
int lowerLimit=97;
int upperLimit=122;
Random random = new Random();
StringBuilder r =new StringBuilder(n);
for (int i=0;i<n;i++)
{
	int nextRandomchar= lowerLimit+(int)(random.nextFloat()*(upperLimit-lowerLimit+1));
	r.append((char)nextRandomchar);
}
return r.toString();
        } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}

class Searches extends PROJECT
{
    boolean search(String key) { 
        int level; 
        int length = key.length(); 
        int index; 
        TrieNode pCrawl = root; 
       
        for (level = 0; level < length; level++) 
        { 
            index = key.charAt(level) - 'a'; 
       
            if (pCrawl.children[index] == null) 
                return false; 
       
            pCrawl = pCrawl.children[index]; 
        } 
       
        return (pCrawl != null && pCrawl.isEndOfWord); 
    }
}